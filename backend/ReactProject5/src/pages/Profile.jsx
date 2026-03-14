import React, { useState, useEffect } from 'react';
import { Link, useNavigate } from 'react-router-dom';
import { getUserProfile, getAllUsers } from '../api/userApis';

const Profile = () => {
  const [userProfile, setUserProfile] = useState(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);
  const [allProfiles, setAllProfiles] = useState([]);
  const [profilesLoading, setProfilesLoading] = useState(false);
  const [profilesError, setProfilesError] = useState('');
  const navigate = useNavigate();

  useEffect(() => {
    const fetchProfile = async () => {
      try {
        const token = localStorage.getItem('authToken');
        if (!token) {
          navigate('/login');
          return;
        }
        const profile = await getUserProfile(token);
        console.log('Fetched user profile:', profile);
        setUserProfile(profile.data || profile);
      } catch (err) {
        setError(err.response?.data?.message || 'Failed to load profile');
        localStorage.removeItem('authToken');
        navigate('/login');
      } finally {
        setLoading(false);
      }
    };

    fetchProfile();
  }, [navigate]);
  
  const handleLogout = () => {
    // Clear auth data
    localStorage.removeItem('authToken');
    navigate('/');
  };

  const handleGetAllProfiles = async () => {
    setProfilesLoading(true);
    setProfilesError('');

    try {
      const token = localStorage.getItem('authToken');
      if (!token) {
        navigate('/login');
        return;
      }

      const response = await getAllUsers(token);
      const users = Array.isArray(response)
        ? response
        : response?.data || response?.users || response?.allUsers || [];

      setAllProfiles(Array.isArray(users) ? users : []);
    } catch (err) {
      setProfilesError(err.response?.data?.message || 'Failed to fetch profiles.');
    } finally {
      setProfilesLoading(false);
    }
  };

  if (loading) {
    return (
      <div className="min-h-screen bg-white flex items-center justify-center">
        <div className="text-center">
          <div className="inline-block animate-spin">
            <div className="w-12 h-12 border-4 border-slate-300 border-t-slate-900 rounded-full"></div>
          </div>
          <p className="mt-4 text-slate-600">Loading profile...</p>
        </div>
      </div>
    );
  }

  if (error) {
    return (
      <div className="min-h-screen bg-white flex items-center justify-center px-4">
        <div className="text-center">
          <p className="text-red-600 mb-4">{error}</p>
          <Link to="/login" className="text-slate-900 font-medium hover:underline">
            Go back to login
          </Link>
        </div>
      </div>
    );
  }

  return (
    <div className="min-h-screen bg-white flex items-center justify-center px-4">
      <div className="w-full max-w-md">
        {/* Card */}
        <div className="bg-white">
          {/* Header */}
          <div className="text-center mb-12">
            <div className="w-24 h-24 mx-auto mb-4 rounded-full bg-slate-200 flex items-center justify-center text-4xl">
              👤
            </div>
            <h1 className="text-3xl font-light text-slate-900 mb-2">{userProfile?.name || 'User'}</h1>
            <p className="text-slate-600">{userProfile?.email || 'email@example.com'}</p>
          </div>

          {/* Profile Info */}
          <div className="space-y-3 mb-8">
            <div className="bg-slate-50 rounded-lg p-4 border border-slate-200">
              <p className="text-slate-600 text-sm mb-1">Role</p>
              <p className="text-slate-900 font-medium capitalize">{userProfile?.role || 'user'}</p>
            </div>
            <div className="bg-slate-50 rounded-lg p-4 border border-slate-200">
              <p className="text-slate-600 text-sm mb-1">Account Status</p>
              <p className="text-slate-900 font-medium flex items-center">
                <span className="inline-block w-2 h-2 bg-green-600 rounded-full mr-2"></span>
                Active
              </p>
            </div>
            <div className="bg-slate-50 rounded-lg p-4 border border-slate-200">
              <p className="text-slate-600 text-sm mb-1">User ID</p>
              <p className="text-slate-900 font-medium text-sm font-mono break-all">
                {userProfile?._id?.substring(0, 12) || 'N/A'}...
              </p>
            </div>
          </div>

          {/* Buttons */}
          <div className="space-y-2">
            <button className="w-full py-3 bg-slate-100 border border-slate-300 text-slate-900 font-medium rounded-lg hover:bg-slate-200 transition-colors">
              Edit Profile
            </button>
            <button className="w-full py-3 bg-slate-100 border border-slate-300 text-slate-900 font-medium rounded-lg hover:bg-slate-200 transition-colors">
              Change Password
            </button>
            <button
              onClick={handleGetAllProfiles}
              disabled={profilesLoading}
              className="w-full py-3 bg-slate-100 border border-slate-300 text-slate-900 font-medium rounded-lg hover:bg-slate-200 transition-colors disabled:opacity-60 disabled:cursor-not-allowed"
            >
              {profilesLoading ? 'Loading Profiles...' : 'Get All Profiles'}
            </button>
            <button
              onClick={handleLogout}
              className="w-full py-3 bg-slate-900 text-white font-medium rounded-lg hover:bg-slate-800 transition-colors"
            >
              Logout
            </button>
          </div>

          {profilesError && (
            <p className="text-sm text-red-600 mt-4">{profilesError}</p>
          )}

          {allProfiles.length > 0 && (
            <div className="mt-6 bg-slate-50 border border-slate-200 rounded-lg p-4">
              <p className="text-sm text-slate-700 font-medium mb-3">All Profiles</p>
              <ul className="space-y-2 max-h-56 overflow-auto">
                {allProfiles.map((profile) => (
                  <li key={profile?._id || profile?.email} className="text-sm text-slate-700">
                    {(profile?.name || 'Unknown')} - {profile?.email || 'No email'}
                  </li>
                ))}
              </ul>
            </div>
          )}

          {/* Back to Home */}
          <div className="text-center mt-8">
            <Link
              to="/"
              className="text-slate-600 hover:text-slate-900 transition-colors text-sm"
            >
              ← Back to Home
            </Link>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Profile;
