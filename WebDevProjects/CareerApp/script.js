// CareerHub - Job Search Application

// API Configuration
const API_CONFIG = {
    baseUrl: 'https://jsearch.p.rapidapi.com',
    headers: {
        'x-rapidapi-key': '964ab9bfbemshf7c3a95fc2524cep1f15dbjsnbed1d3d53735',
        'x-rapidapi-host': 'jsearch.p.rapidapi.com'
    }
};

// DOM Elements
const elements = {
    jobTitle: document.getElementById('jobTitle'),
    location: document.getElementById('location'),
    country: document.getElementById('country'),
    searchBtn: document.getElementById('searchBtn'),
    jobType: document.getElementById('jobType'),
    datePosted: document.getElementById('datePosted'),
    remoteFilter: document.getElementById('remoteFilter'),
    jobCards: document.getElementById('jobCards'),
    loading: document.getElementById('loading'),
    resultsCount: document.getElementById('resultsCount'),
    pagination: document.getElementById('pagination'),
    jobModal: document.getElementById('jobModal'),
    modalBody: document.getElementById('modalBody'),
    modalClose: document.getElementById('modalClose'),
    popularTags: document.querySelectorAll('.tag')
};

// State
let currentPage = 1;
let totalJobs = 0;
let currentJobs = [];

// Initialize
document.addEventListener('DOMContentLoaded', () => {
    initializeEventListeners();
    showWelcomeMessage();
});

// Event Listeners
function initializeEventListeners() {
    // Search button click
    elements.searchBtn.addEventListener('click', () => searchJobs(1));

    // Enter key on input fields
    elements.jobTitle.addEventListener('keypress', handleEnterKey);
    elements.location.addEventListener('keypress', handleEnterKey);

    // Filter changes
    elements.jobType.addEventListener('change', () => searchJobs(1));
    elements.datePosted.addEventListener('change', () => searchJobs(1));
    elements.remoteFilter.addEventListener('change', () => searchJobs(1));

    // Popular tags
    elements.popularTags.forEach(tag => {
        tag.addEventListener('click', () => {
            elements.jobTitle.value = tag.dataset.query;
            searchJobs(1);
        });
    });

    // Modal close
    elements.modalClose.addEventListener('click', closeModal);
    elements.jobModal.addEventListener('click', (e) => {
        if (e.target === elements.jobModal) closeModal();
    });

    // Escape key to close modal
    document.addEventListener('keydown', (e) => {
        if (e.key === 'Escape') closeModal();
    });
}

function handleEnterKey(e) {
    if (e.key === 'Enter') {
        searchJobs(1);
    }
}

// Show Welcome Message
function showWelcomeMessage() {
    elements.jobCards.innerHTML = `
        <div class="no-results">
            <i class="fas fa-search"></i>
            <h3>Start Your Job Search</h3>
            <p>Enter a job title, location, or select a country to find your perfect job</p>
        </div>
    `;
}

// Search Jobs
async function searchJobs(page = 1) {
    const jobTitle = elements.jobTitle.value.trim();
    const location = elements.location.value.trim();
    const country = elements.country.value;

    if (!jobTitle && !location && !country) {
        showNotification('Please enter a job title, location, or select a country', 'warning');
        return;
    }

    currentPage = page;
    showLoading(true);

    try {
        const queryParts = [];
        if (jobTitle) queryParts.push(jobTitle);
        if (location) queryParts.push(`in ${location}`);
        
        const query = queryParts.length > 0 ? queryParts.join(' ') : 'jobs';
        
        // Build URL with parameters
        const params = new URLSearchParams({
            query: query,
            page: page.toString(),
            num_pages: '1',
            date_posted: elements.datePosted.value
        });

        if (country) params.append('country', country);
        if (elements.jobType.value) params.append('employment_types', elements.jobType.value);
        if (elements.remoteFilter.value) params.append('remote_jobs_only', elements.remoteFilter.value);

        const response = await fetch(`${API_CONFIG.baseUrl}/search?${params}`, {
            method: 'GET',
            headers: API_CONFIG.headers
        });

        if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}`);
        }

        const data = await response.json();
        
        if (data.status === 'OK' && data.data) {
            currentJobs = data.data;
            totalJobs = data.data.length;
            displayJobs(data.data);
            updateResultsCount(data.data.length);
            scrollToJobs();
        } else {
            showNoResults();
        }

    } catch (error) {
        console.error('Error fetching jobs:', error);
        showError(error.message);
    } finally {
        showLoading(false);
    }
}

// Display Jobs
function displayJobs(jobs) {
    if (!jobs || jobs.length === 0) {
        showNoResults();
        return;
    }

    elements.jobCards.innerHTML = jobs.map((job, index) => createJobCard(job, index)).join('');

    // Add click listeners to job cards
    document.querySelectorAll('.job-card').forEach((card, index) => {
        card.addEventListener('click', () => openJobModal(jobs[index]));
    });

    // Add click listeners to apply buttons (prevent propagation)
    document.querySelectorAll('.btn-apply').forEach((btn, index) => {
        btn.addEventListener('click', (e) => {
            e.stopPropagation();
            applyToJob(jobs[index]);
        });
    });
}

// Create Job Card HTML
function createJobCard(job, index) {
    const logo = job.employer_logo 
        ? `<img src="${job.employer_logo}" alt="${job.employer_name}" class="company-logo" onerror="this.outerHTML='<div class=\\'company-logo-placeholder\\'>${getInitials(job.employer_name)}</div>'">`
        : `<div class="company-logo-placeholder">${getInitials(job.employer_name)}</div>`;

    const salary = formatSalary(job);
    const postedDate = getRelativeTime(job.job_posted_at_datetime_utc);
    const jobType = formatJobType(job.job_employment_type);
    const isRemote = job.job_is_remote;

    return `
        <div class="job-card" data-index="${index}">
            <div class="job-card-header">
                ${logo}
                <div class="job-info">
                    <h3>${truncateText(job.job_title, 60)}</h3>
                    <span class="company-name">${job.employer_name || 'Company'}</span>
                </div>
            </div>
            <div class="job-meta">
                <span><i class="fas fa-map-marker-alt"></i> ${job.job_city || job.job_country || 'Location not specified'}</span>
                ${job.job_country ? `<span><i class="fas fa-globe"></i> ${job.job_country}</span>` : ''}
            </div>
            <div class="job-tags">
                ${isRemote ? '<span class="job-tag remote">Remote</span>' : ''}
                <span class="job-tag ${jobType.toLowerCase()}">${jobType}</span>
                ${job.job_required_experience?.required_experience_in_months ? 
                    `<span class="job-tag">${Math.round(job.job_required_experience.required_experience_in_months / 12)}+ years exp</span>` : ''}
            </div>
            <div class="job-card-footer">
                <div>
                    ${salary ? `<span class="salary">${salary}</span>` : ''}
                    <span class="posted-date">${postedDate}</span>
                </div>
                <button class="btn-apply">Apply Now</button>
            </div>
        </div>
    `;
}

// Open Job Modal
function openJobModal(job) {
    const logo = job.employer_logo 
        ? `<img src="${job.employer_logo}" alt="${job.employer_name}" class="company-logo" onerror="this.outerHTML='<div class=\\'company-logo-placeholder\\'>${getInitials(job.employer_name)}</div>'">`
        : `<div class="company-logo-placeholder">${getInitials(job.employer_name)}</div>`;

    const salary = formatSalary(job);
    const description = job.job_description || 'No description available.';
    const highlights = job.job_highlights || {};

    elements.modalBody.innerHTML = `
        <div class="modal-header">
            ${logo}
            <div>
                <h2>${job.job_title}</h2>
                <p class="company-name">${job.employer_name || 'Company'}</p>
                <div class="job-meta" style="margin-top: 10px;">
                    <span><i class="fas fa-map-marker-alt"></i> ${job.job_city || ''} ${job.job_state || ''} ${job.job_country || ''}</span>
                    ${job.job_is_remote ? '<span><i class="fas fa-home"></i> Remote</span>' : ''}
                    <span><i class="fas fa-briefcase"></i> ${formatJobType(job.job_employment_type)}</span>
                </div>
            </div>
        </div>

        ${salary ? `
        <div class="modal-section">
            <h4><i class="fas fa-money-bill-wave"></i> Salary</h4>
            <p>${salary}</p>
        </div>
        ` : ''}

        <div class="modal-section">
            <h4><i class="fas fa-file-alt"></i> Job Description</h4>
            <p>${formatDescription(description)}</p>
        </div>

        ${highlights.Qualifications ? `
        <div class="modal-section">
            <h4><i class="fas fa-check-circle"></i> Qualifications</h4>
            <ul>
                ${highlights.Qualifications.slice(0, 8).map(q => `<li>${q}</li>`).join('')}
            </ul>
        </div>
        ` : ''}

        ${highlights.Responsibilities ? `
        <div class="modal-section">
            <h4><i class="fas fa-tasks"></i> Responsibilities</h4>
            <ul>
                ${highlights.Responsibilities.slice(0, 8).map(r => `<li>${r}</li>`).join('')}
            </ul>
        </div>
        ` : ''}

        ${highlights.Benefits ? `
        <div class="modal-section">
            <h4><i class="fas fa-gift"></i> Benefits</h4>
            <ul>
                ${highlights.Benefits.slice(0, 6).map(b => `<li>${b}</li>`).join('')}
            </ul>
        </div>
        ` : ''}

        <div class="modal-section">
            <h4><i class="fas fa-building"></i> About ${job.employer_name || 'the Company'}</h4>
            <p>${job.employer_company_type ? `Company Type: ${job.employer_company_type}` : 'Visit the company website to learn more about this employer.'}</p>
            ${job.employer_website ? `<p><a href="${job.employer_website}" target="_blank" rel="noopener">Visit Company Website</a></p>` : ''}
        </div>

        <div class="modal-actions">
            <button class="btn btn-primary" onclick="applyToJob(currentJobs[${currentJobs.indexOf(job)}])">
                <i class="fas fa-paper-plane"></i> Apply Now
            </button>
            <button class="btn btn-outline" onclick="saveJob(${currentJobs.indexOf(job)})">
                <i class="fas fa-bookmark"></i> Save Job
            </button>
        </div>
    `;

    elements.jobModal.classList.add('show');
    document.body.style.overflow = 'hidden';
}

// Close Modal
function closeModal() {
    elements.jobModal.classList.remove('show');
    document.body.style.overflow = '';
}

// Apply to Job
function applyToJob(job) {
    if (job.job_apply_link) {
        window.open(job.job_apply_link, '_blank', 'noopener');
    } else {
        showNotification('Application link not available. Please visit the company website.', 'info');
    }
}

// Save Job (Demo)
function saveJob(index) {
    const job = currentJobs[index];
    showNotification(`${job.job_title} has been saved to your favorites!`, 'success');
}

// Utility Functions
function getInitials(name) {
    if (!name) return '?';
    return name.split(' ').map(w => w[0]).slice(0, 2).join('').toUpperCase();
}

function truncateText(text, maxLength) {
    if (!text) return '';
    return text.length > maxLength ? text.substring(0, maxLength) + '...' : text;
}

function formatSalary(job) {
    if (job.job_min_salary && job.job_max_salary) {
        const currency = job.job_salary_currency || 'USD';
        const period = job.job_salary_period || 'YEAR';
        const min = formatNumber(job.job_min_salary);
        const max = formatNumber(job.job_max_salary);
        return `${currency} ${min} - ${max} / ${period.toLowerCase()}`;
    }
    return null;
}

function formatNumber(num) {
    if (num >= 1000) {
        return (num / 1000).toFixed(0) + 'K';
    }
    return num.toString();
}

function formatJobType(type) {
    const types = {
        'FULLTIME': 'Full-time',
        'PARTTIME': 'Part-time',
        'CONTRACTOR': 'Contract',
        'INTERN': 'Internship'
    };
    return types[type] || type || 'Full-time';
}

function getRelativeTime(dateString) {
    if (!dateString) return 'Recently';
    
    const date = new Date(dateString);
    const now = new Date();
    const diffTime = Math.abs(now - date);
    const diffDays = Math.floor(diffTime / (1000 * 60 * 60 * 24));
    
    if (diffDays === 0) return 'Today';
    if (diffDays === 1) return 'Yesterday';
    if (diffDays < 7) return `${diffDays} days ago`;
    if (diffDays < 30) return `${Math.floor(diffDays / 7)} weeks ago`;
    if (diffDays < 365) return `${Math.floor(diffDays / 30)} months ago`;
    return `${Math.floor(diffDays / 365)} years ago`;
}

function formatDescription(description) {
    if (!description) return '';
    // Convert newlines to breaks and limit length for display
    const formatted = description
        .replace(/\n\n/g, '</p><p>')
        .replace(/\n/g, '<br>')
        .replace(/•/g, '&#8226;');
    
    // Limit to first 1500 characters for modal display
    if (formatted.length > 1500) {
        return formatted.substring(0, 1500) + '...';
    }
    return formatted;
}

// UI Functions
function showLoading(show) {
    elements.loading.classList.toggle('show', show);
    if (show) {
        elements.jobCards.innerHTML = '';
    }
}

function updateResultsCount(count) {
    elements.resultsCount.textContent = count > 0 
        ? `Found ${count} job${count !== 1 ? 's' : ''} matching your search`
        : 'No jobs found';
}

function showNoResults() {
    elements.jobCards.innerHTML = `
        <div class="no-results">
            <i class="fas fa-search"></i>
            <h3>No Jobs Found</h3>
            <p>Try adjusting your search criteria or explore different keywords</p>
        </div>
    `;
    elements.resultsCount.textContent = 'No jobs found';
}

function showError(message) {
    elements.jobCards.innerHTML = `
        <div class="error-message">
            <i class="fas fa-exclamation-triangle"></i>
            <h3>Oops! Something went wrong</h3>
            <p>${message || 'Failed to fetch jobs. Please try again later.'}</p>
        </div>
    `;
    elements.resultsCount.textContent = 'Error loading jobs';
}

function scrollToJobs() {
    document.getElementById('jobsSection').scrollIntoView({ behavior: 'smooth' });
}

// Notification System
function showNotification(message, type = 'info') {
    // Remove existing notification
    const existing = document.querySelector('.notification');
    if (existing) existing.remove();

    const notification = document.createElement('div');
    notification.className = `notification ${type}`;
    notification.innerHTML = `
        <i class="fas ${type === 'success' ? 'fa-check-circle' : type === 'warning' ? 'fa-exclamation-circle' : 'fa-info-circle'}"></i>
        <span>${message}</span>
    `;
    
    // Add notification styles if not exist
    if (!document.querySelector('#notification-styles')) {
        const styles = document.createElement('style');
        styles.id = 'notification-styles';
        styles.textContent = `
            .notification {
                position: fixed;
                top: 100px;
                right: 20px;
                padding: 15px 25px;
                border-radius: 10px;
                background: white;
                box-shadow: 0 10px 25px rgba(0,0,0,0.15);
                display: flex;
                align-items: center;
                gap: 12px;
                z-index: 3000;
                animation: slideIn 0.3s ease, slideOut 0.3s ease 2.7s forwards;
                max-width: 400px;
            }
            .notification.success { border-left: 4px solid #10b981; }
            .notification.warning { border-left: 4px solid #f59e0b; }
            .notification.info { border-left: 4px solid #4f46e5; }
            .notification i { font-size: 1.2rem; }
            .notification.success i { color: #10b981; }
            .notification.warning i { color: #f59e0b; }
            .notification.info i { color: #4f46e5; }
            @keyframes slideIn { from { transform: translateX(100%); opacity: 0; } to { transform: translateX(0); opacity: 1; } }
            @keyframes slideOut { from { transform: translateX(0); opacity: 1; } to { transform: translateX(100%); opacity: 0; } }
        `;
        document.head.appendChild(styles);
    }

    document.body.appendChild(notification);
    setTimeout(() => notification.remove(), 3000);
}