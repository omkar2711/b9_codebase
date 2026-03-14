import React, { useState } from 'react';
import { Link, useNavigate } from 'react-router-dom';
import { resgisterUser } from '../api/userApis';

const Register = () => {
  const [formData, setFormData] = useState({
    firstName: '',
    lastName: '',
    email: '',
    password: '',
    confirmPassword: '',
    agreeTerms: false,
  });
  const [errors, setErrors] = useState({});
  const [loading, setLoading] = useState(false);
  const navigate = useNavigate();

  const validateForm = () => {
    const newErrors = {};

    if (!formData.firstName.trim()) {
      newErrors.firstName = 'First name is required';
    }

    if (!formData.lastName.trim()) {
      newErrors.lastName = 'Last name is required';
    }

    if (!formData.email.trim()) {
      newErrors.email = 'Email is required';
    } else if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(formData.email)) {
      newErrors.email = 'Please enter a valid email';
    }

    if (!formData.password) {
      newErrors.password = 'Password is required';
    } else if (formData.password.length < 8) {
      newErrors.password = 'Password must be at least 8 characters';
    } else if (!/(?=.*[a-z])(?=.*[A-Z])(?=.*\d)/.test(formData.password)) {
      newErrors.password = 'Password must contain uppercase, lowercase, and numbers';
    }

    if (!formData.confirmPassword) {
      newErrors.confirmPassword = 'Please confirm your password';
    } else if (formData.password !== formData.confirmPassword) {
      newErrors.confirmPassword = 'Passwords do not match';
    }

    if (!formData.agreeTerms) {
      newErrors.agreeTerms = 'You must agree to the terms and conditions';
    }

    setErrors(newErrors);
    return Object.keys(newErrors).length === 0;
  };

  const handleChange = (e) => {
    const { name, value, type, checked } = e.target;
    setFormData((prev) => ({
      ...prev,
      [name]: type === 'checkbox' ? checked : value,
    }));
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    if (!validateForm()) return;

    setLoading(true);
    setErrors({});
    try {
      const fullName = `${formData.firstName} ${formData.lastName}`;
      await resgisterUser(fullName, formData.email, formData.password, 'user');
      // Redirect to login page
      alert('Registration successful! Please log in.');
      navigate('/login');
    } catch (error) {
      setErrors({ submit: error.response?.data?.message || 'Registration failed. Please try again.' });
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="min-h-screen bg-white flex items-center justify-center px-4 py-8">
      <div className="w-full max-w-md">
        {/* Card */}
        <div className="bg-white">
          {/* Header */}
          <div className="text-center mb-12">
            <h1 className="text-4xl font-light text-slate-900 mb-2">Create Account</h1>
            <p className="text-slate-600">Join us and get started</p>
          </div>

          {/* Form */}
          <form onSubmit={handleSubmit} className="space-y-5">
            {/* First Name & Last Name */}
            <div className="grid grid-cols-2 gap-4">
              <div>
                <label htmlFor="firstName" className="block text-slate-700 font-medium mb-2 text-sm">
                  First Name
                </label>
                <input
                  type="text"
                  id="firstName"
                  name="firstName"
                  value={formData.firstName}
                  onChange={handleChange}
                  placeholder="John"
                  className={`w-full px-4 py-2 rounded-lg border ${
                    errors.firstName ? 'border-red-400 bg-red-50' : 'border-slate-300 bg-slate-50'
                  } text-slate-900 placeholder-slate-500 focus:outline-none focus:ring-2 focus:ring-slate-400 focus:border-transparent transition-all text-sm`}
                />
                {errors.firstName && (
                  <p className="text-red-600 text-xs mt-1">{errors.firstName}</p>
                )}
              </div>

              <div>
                <label htmlFor="lastName" className="block text-slate-700 font-medium mb-2 text-sm">
                  Last Name
                </label>
                <input
                  type="text"
                  id="lastName"
                  name="lastName"
                  value={formData.lastName}
                  onChange={handleChange}
                  placeholder="Doe"
                  className={`w-full px-4 py-2 rounded-lg border ${
                    errors.lastName ? 'border-red-400 bg-red-50' : 'border-slate-300 bg-slate-50'
                  } text-slate-900 placeholder-slate-500 focus:outline-none focus:ring-2 focus:ring-slate-400 focus:border-transparent transition-all text-sm`}
                />
                {errors.lastName && (
                  <p className="text-red-600 text-xs mt-1">{errors.lastName}</p>
                )}
              </div>
            </div>

            {/* Email Input */}
            <div>
              <label htmlFor="email" className="block text-slate-700 font-medium mb-2 text-sm">
                Email Address
              </label>
              <input
                type="email"
                id="email"
                name="email"
                value={formData.email}
                onChange={handleChange}
                placeholder="you@example.com"
                className={`w-full px-4 py-2 rounded-lg border ${
                  errors.email ? 'border-red-400 bg-red-50' : 'border-slate-300 bg-slate-50'
                } text-slate-900 placeholder-slate-500 focus:outline-none focus:ring-2 focus:ring-slate-400 focus:border-transparent transition-all text-sm`}
              />
              {errors.email && (
                <p className="text-red-600 text-xs mt-1">{errors.email}</p>
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
                name="password"
                value={formData.password}
                onChange={handleChange}
                placeholder="••••••••"
                className={`w-full px-4 py-2 rounded-lg border ${
                  errors.password ? 'border-red-400 bg-red-50' : 'border-slate-300 bg-slate-50'
                } text-slate-900 placeholder-slate-500 focus:outline-none focus:ring-2 focus:ring-slate-400 focus:border-transparent transition-all text-sm`}
              />
              {errors.password && (
                <p className="text-red-600 text-xs mt-1">{errors.password}</p>
              )}
              <p className="text-slate-600 text-xs mt-2">
                At least 8 characters with uppercase, lowercase & numbers
              </p>
            </div>

            {/* Confirm Password Input */}
            <div>
              <label htmlFor="confirmPassword" className="block text-slate-700 font-medium mb-2 text-sm">
                Confirm Password
              </label>
              <input
                type="password"
                id="confirmPassword"
                name="confirmPassword"
                value={formData.confirmPassword}
                onChange={handleChange}
                placeholder="••••••••"
                className={`w-full px-4 py-2 rounded-lg border ${
                  errors.confirmPassword ? 'border-red-400 bg-red-50' : 'border-slate-300 bg-slate-50'
                } text-slate-900 placeholder-slate-500 focus:outline-none focus:ring-2 focus:ring-slate-400 focus:border-transparent transition-all text-sm`}
              />
              {errors.confirmPassword && (
                <p className="text-red-600 text-xs mt-1">{errors.confirmPassword}</p>
              )}
            </div>

            {/* Terms & Conditions */}
            <div className="pt-2">
              <label className="flex items-start text-slate-600 hover:text-slate-900 cursor-pointer">
                <input
                  type="checkbox"
                  name="agreeTerms"
                  checked={formData.agreeTerms}
                  onChange={handleChange}
                  className="w-4 h-4 rounded mt-1 border-slate-300 text-slate-900 focus:ring-2 focus:ring-slate-400"
                />
                <span className="ml-2 text-sm">
                  I agree to the{' '}
                  <a href="#" className="text-slate-900 hover:underline transition-colors">
                    Terms and Conditions
                  </a>{' '}
                  and{' '}
                  <a href="#" className="text-slate-900 hover:underline transition-colors">
                    Privacy Policy
                  </a>
                </span>
              </label>
              {errors.agreeTerms && (
                <p className="text-red-600 text-xs mt-2">{errors.agreeTerms}</p>
              )}
            </div>

            {/* Submit Error */}
            {errors.submit && (
              <p className="text-red-600 text-center text-sm bg-red-50 p-3 rounded-lg border border-red-200">
                {errors.submit}
              </p>
            )}

            {/* Register Button */}
            <button
              type="submit"
              disabled={loading}
              className="w-full py-3 bg-slate-900 text-white font-medium rounded-lg hover:bg-slate-800 transition-colors duration-300 disabled:opacity-50 disabled:cursor-not-allowed"
            >
              {loading ? 'Creating Account...' : 'Create Account'}
            </button>
          </form>

          {/* Divider */}
          <div className="relative my-8">
            <div className="absolute inset-0 flex items-center">
              <div className="w-full border-t border-slate-300"></div>
            </div>
            <div className="relative flex justify-center text-sm">
              <span className="px-2 bg-white text-slate-600">
                Or sign up with
              </span>
            </div>
          </div>

          {/* Social Registration */}
          <div className="grid grid-cols-2 gap-4">
            <button type="button" className="py-2 px-4 rounded-lg bg-slate-100 border border-slate-300 text-slate-900 font-medium hover:bg-slate-200 transition-colors text-sm">
              Google
            </button>
            <button type="button" className="py-2 px-4 rounded-lg bg-slate-100 border border-slate-300 text-slate-900 font-medium hover:bg-slate-200 transition-colors text-sm">
              GitHub
            </button>
          </div>

          {/* Login Link */}
          <p className="text-center mt-8 text-slate-600">
            Already have an account?{' '}
            <Link
              to="/login"
              className="text-slate-900 font-medium hover:underline transition-colors"
            >
              Sign in here
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

export default Register;
