import React, { useState } from 'react';
import { Link, useNavigate } from 'react-router-dom';
import { loginUser } from '../api/userApis';

const Login = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [errors, setErrors] = useState({});
  const [loading, setLoading] = useState(false);
  const navigate = useNavigate();

  const validateForm = () => {
    const newErrors = {};
    
    if (!email.trim()) {
      newErrors.email = 'Email is required';
    } else if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
      newErrors.email = 'Please enter a valid email';
    }
    
    if (!password) {
      newErrors.password = 'Password is required';
    } else if (password.length < 6) {
      newErrors.password = 'Password must be at least 6 characters';
    }
    
    setErrors(newErrors);
    return Object.keys(newErrors).length === 0;
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    
    if (!validateForm()) return;
    
    setLoading(true);
    setErrors({});
    try {
      const token = await loginUser(email, password);
      console.log('Login successful, token:', token);
      // Store token in localStorage
      localStorage.setItem('authToken', token);
      // Redirect to profile page
      navigate('/profile');
    } catch (error) {
      setErrors({ submit: error.response?.data?.message || 'Login failed. Please try again.' });
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="min-h-screen bg-white flex items-center justify-center px-4">
      <div className="w-full max-w-md">
        {/* Card */}
        <div className="bg-white">
          {/* Header */}
          <div className="text-center mb-12">
            <h1 className="text-4xl font-light text-slate-900 mb-2">Welcome Back</h1>
            <p className="text-slate-600">Sign in to your account</p>
          </div>

          {/* Form */}
          <form onSubmit={handleSubmit} className="space-y-6">
            {/* Email Input */}
            <div>
              <label htmlFor="email" className="block text-slate-700 font-medium mb-2 text-sm">
                Email Address
              </label>
              <input
                type="email"
                id="email"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
                placeholder="you@example.com"
                className={`w-full px-4 py-3 rounded-lg border ${
                  errors.email ? 'border-red-400 bg-red-50' : 'border-slate-300 bg-slate-50'
                } text-slate-900 placeholder-slate-500 focus:outline-none focus:ring-2 focus:ring-slate-400 focus:border-transparent transition-all`}
              />
              {errors.email && (
                <p className="text-red-600 text-sm mt-2">{errors.email}</p>
              )}
            </div>

            {/* Password Input */}
            <div>
              <label htmlFor="password" className="block text-slate-700 font-medium mb-2 text-sm">
                Password
              </label>
              <input
                type="password"
                id="password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
                placeholder="••••••••"
                className={`w-full px-4 py-3 rounded-lg border ${
                  errors.password ? 'border-red-400 bg-red-50' : 'border-slate-300 bg-slate-50'
                } text-slate-900 placeholder-slate-500 focus:outline-none focus:ring-2 focus:ring-slate-400 focus:border-transparent transition-all`}
              />
              {errors.password && (
                <p className="text-red-600 text-sm mt-2">{errors.password}</p>
              )}
            </div>

            {/* Remember Me & Forgot Password */}
            <div className="flex items-center justify-between">
              <label className="flex items-center text-slate-600 hover:text-slate-900 cursor-pointer">
                <input
                  type="checkbox"
                  className="w-4 h-4 rounded border-slate-300 text-slate-900 focus:ring-2 focus:ring-slate-400"
                />
                <span className="ml-2 text-sm">Remember me</span>
              </label>
              <a href="#" className="text-slate-600 hover:text-slate-900 text-sm transition-colors">
                Forgot password?
              </a>
            </div>

            {/* Submit Error */}
            {errors.submit && (
              <p className="text-red-600 text-center text-sm bg-red-50 p-3 rounded-lg border border-red-200">
                {errors.submit}
              </p>
            )}

            {/* Login Button */}
            <button
              type="submit"
              disabled={loading}
              className="w-full py-3 bg-slate-900 text-white font-medium rounded-lg hover:bg-slate-800 transition-colors duration-300 disabled:opacity-50 disabled:cursor-not-allowed"
            >
              {loading ? 'Signing In...' : 'Sign In'}
            </button>
          </form>

          {/* Divider */}
          <div className="relative my-8">
            <div className="absolute inset-0 flex items-center">
              <div className="w-full border-t border-slate-300"></div>
            </div>
            <div className="relative flex justify-center text-sm">
              <span className="px-2 bg-white text-slate-600">
                Or continue with
              </span>
            </div>
          </div>

          {/* Social Login */}
          <div className="grid grid-cols-2 gap-4">
            <button type="button" className="py-3 px-4 rounded-lg bg-slate-100 border border-slate-300 text-slate-900 font-medium hover:bg-slate-200 transition-colors">
              Google
            </button>
            <button type="button" className="py-3 px-4 rounded-lg bg-slate-100 border border-slate-300 text-slate-900 font-medium hover:bg-slate-200 transition-colors">
              GitHub
            </button>
          </div>

          {/* Sign Up Link */}
          <p className="text-center mt-8 text-slate-600">
            Don't have an account?{' '}
            <Link
              to="/register"
              className="text-slate-900 font-medium hover:underline transition-colors"
            >
              Sign up here
            </Link>
          </p>
        </div>

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
  );
};

export default Login;
