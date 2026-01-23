const apiId = "331ca92302e15a439c9d10c2f72bc394";

// Unsplash background images based on weather conditions
const weatherBackgrounds = {
    Clear: "https://images.unsplash.com/photo-1601297183305-6df142704ea2?w=1920&q=80",
    Clouds: "https://images.unsplash.com/photo-1534088568595-a066f410bcda?w=1920&q=80",
    Rain: "https://images.unsplash.com/photo-1519692933481-e162a57d6721?w=1920&q=80",
    Drizzle: "https://images.unsplash.com/photo-1541919329513-35f7af297129?w=1920&q=80",
    Thunderstorm: "https://images.unsplash.com/photo-1605727216801-e27ce1d0cc28?w=1920&q=80",
    Snow: "https://images.unsplash.com/photo-1491002052546-bf38f186af56?w=1920&q=80",
    Mist: "https://images.unsplash.com/photo-1485236715568-ddc5ee6ca227?w=1920&q=80",
    Haze: "https://images.unsplash.com/photo-1603794067602-9feaa4f70e1c?w=1920&q=80",
    Fog: "https://images.unsplash.com/photo-1487621167305-5d248087c724?w=1920&q=80",
    Smoke: "https://images.unsplash.com/photo-1542856391-010fb87dcfed?w=1920&q=80",
    Dust: "https://images.unsplash.com/photo-1603789819044-5726d4ab20af?w=1920&q=80",
    Sand: "https://images.unsplash.com/photo-1509316785289-025f5b846b35?w=1920&q=80",
    default: "https://images.unsplash.com/photo-1504608524841-42fe6f032b4b?w=1920&q=80"
};

// Country codes to names mapping
const countryNames = {
    IN: "India", US: "United States", GB: "United Kingdom", CA: "Canada",
    AU: "Australia", DE: "Germany", FR: "France", JP: "Japan", CN: "China",
    BR: "Brazil", RU: "Russia", IT: "Italy", ES: "Spain", MX: "Mexico"
};

// DOM Elements
const weatherCard = document.getElementById("weather-card");
const loadingDiv = document.getElementById("loading");
const errorDiv = document.getElementById("error-message");
const bgOverlay = document.getElementById("bg-overlay");

// Format time from Unix timestamp
function formatTime(timestamp, timezone) {
    const date = new Date((timestamp + timezone) * 1000);
    return date.toLocaleTimeString("en-US", {
        hour: "2-digit",
        minute: "2-digit",
        hour12: true,
        timeZone: "UTC"
    });
}

// Set background based on weather
function setWeatherBackground(weatherMain) {
    const bgUrl = weatherBackgrounds[weatherMain] || weatherBackgrounds.default;
    bgOverlay.style.backgroundImage = `url('${bgUrl}')`;
    bgOverlay.classList.add("active");
    
    // Add weather class to body for gradient fallback
    document.body.className = "";
    document.body.classList.add(weatherMain.toLowerCase());
}

// Show loading state
function showLoading() {
    weatherCard.style.display = "none";
    errorDiv.style.display = "none";
    loadingDiv.style.display = "block";
}

// Show error state
function showError(message) {
    loadingDiv.style.display = "none";
    weatherCard.style.display = "none";
    errorDiv.style.display = "block";
    document.getElementById("error-text").textContent = message;
}

// Show weather card
function showWeather() {
    loadingDiv.style.display = "none";
    errorDiv.style.display = "none";
    weatherCard.style.display = "block";
}

// Update UI with weather data
function updateWeatherUI(data) {
    // Location
    document.getElementById("city-name").textContent = data.name;
    document.getElementById("country-name").textContent = 
        countryNames[data.sys.country] || data.sys.country;
    
    // Weather icon and description
    const iconCode = data.weather[0].icon;
    document.getElementById("weather-icon").src = 
        `https://openweathermap.org/img/wn/${iconCode}@4x.png`;
    document.getElementById("weather-description").textContent = 
        data.weather[0].description;
    
    // Temperature
    document.getElementById("temp").textContent = `${Math.round(data.main.temp)}°C`;
    document.getElementById("feels-like").textContent = 
        `Feels like ${Math.round(data.main.feels_like)}°C`;
    document.getElementById("temp-min").textContent = 
        `${Math.round(data.main.temp_min)}°C`;
    document.getElementById("temp-max").textContent = 
        `${Math.round(data.main.temp_max)}°C`;
    
    // Details
    document.getElementById("humidity").textContent = `${data.main.humidity}%`;
    document.getElementById("wind-speed").textContent = `${data.wind.speed} m/s`;
    document.getElementById("pressure").textContent = `${data.main.pressure} hPa`;
    document.getElementById("visibility").textContent = 
        `${(data.visibility / 1000).toFixed(1)} km`;
    
    // Sun times
    document.getElementById("sunrise").textContent = 
        formatTime(data.sys.sunrise, data.timezone);
    document.getElementById("sunset").textContent = 
        formatTime(data.sys.sunset, data.timezone);
    
    // Set background
    setWeatherBackground(data.weather[0].main);
}

// Main function to get weather
const getWeather = function() {
    const city = document.getElementById("city-input").value.trim();
    const country = document.getElementById("country-input").value.trim();
    
    if (!city) {
        showError("Please enter a city name.");
        return;
    }
    
    showLoading();
    
    const url = `https://api.openweathermap.org/data/2.5/weather?q=${city},${country}&appid=${apiId}&units=metric`;
    
    fetch(url)
        .then(response => {
            if (!response.ok) {
                throw new Error("City not found");
            }
            return response.json();
        })
        .then(data => {
            console.log(data);
            updateWeatherUI(data);
            showWeather();
        })
        .catch(error => {
            console.error(error);
            showError("City not found. Please check the city name and try again.");
        });
};

// Allow Enter key to trigger search
document.getElementById("city-input").addEventListener("keypress", function(e) {
    if (e.key === "Enter") {
        e.preventDefault();
        getWeather();
    }
});

document.getElementById("country-input").addEventListener("keypress", function(e) {
    if (e.key === "Enter") {
        e.preventDefault();
        getWeather();
    }
});
