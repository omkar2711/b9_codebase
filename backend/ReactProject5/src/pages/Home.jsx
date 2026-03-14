import React from 'react';
import { Link } from 'react-router-dom';

const Home = () => {
  return (
    <div className="min-h-screen bg-white">
      {/* Subtle top border */}
      <div className="h-1 bg-gradient-to-r from-slate-300 via-slate-200 to-slate-300"></div>

      <div className="max-w-5xl mx-auto px-6 py-16 md:py-24">
        {/* Header Section */}
        <div className="mb-16 text-center">
          <h1 className="text-5xl md:text-6xl font-light text-slate-900 mb-6 tracking-tight">
            Welcome to <span className="font-normal">AuthApp</span>
          </h1>
          <p className="text-lg text-slate-600 mb-8 max-w-2xl mx-auto leading-relaxed">
            A modern, minimalist authentication platform designed for simplicity and security. Get started with your account in seconds.
          </p>
        </div>

        {/* Feature Cards */}
        <div className="grid grid-cols-1 md:grid-cols-3 gap-8 mb-16">
          {/* Feature 1 */}
          <div className="bg-slate-50 rounded-xl p-8 border border-slate-200 hover:border-slate-300 hover:shadow-sm transition-all duration-300">
            <div className="text-4xl mb-4">🔐</div>
            <h3 className="text-lg font-medium text-slate-900 mb-3">Secure</h3>
            <p className="text-slate-600 text-sm leading-relaxed">Industry-standard security measures to protect your account and data.</p>
          </div>

          {/* Feature 2 */}
          <div className="bg-slate-50 rounded-xl p-8 border border-slate-200 hover:border-slate-300 hover:shadow-sm transition-all duration-300">
            <div className="text-4xl mb-4">⚡</div>
            <h3 className="text-lg font-medium text-slate-900 mb-3">Fast</h3>
            <p className="text-slate-600 text-sm leading-relaxed">Quick authentication with minimal friction. Get in and get going.</p>
          </div>

          {/* Feature 3 */}
          <div className="bg-slate-50 rounded-xl p-8 border border-slate-200 hover:border-slate-300 hover:shadow-sm transition-all duration-300">
            <div className="text-4xl mb-4">👥</div>
            <h3 className="text-lg font-medium text-slate-900 mb-3">Simple</h3>
            <p className="text-slate-600 text-sm leading-relaxed">Clean, intuitive design that requires no learning curve.</p>
          </div>
        </div>

        {/* CTA Buttons */}
        <div className="flex flex-col sm:flex-row gap-4 justify-center mb-16">
          <Link
            to="/login"
            className="px-8 py-3 bg-slate-900 text-white font-medium rounded-lg hover:bg-slate-800 transition-colors duration-300"
          >
            Sign In
          </Link>
          <Link
            to="/register"
            className="px-8 py-3 bg-slate-100 text-slate-900 font-medium rounded-lg hover:bg-slate-200 transition-colors duration-300 border border-slate-300"
          >
            Create Account
          </Link>
        </div>

        {/* Stats Section */}
        <div className="grid grid-cols-3 gap-6 text-center text-slate-600">
          <div>
            <p className="text-3xl font-light text-slate-900 mb-2">10K+</p>
            <p className="text-sm">Active Users</p>
          </div>
          <div>
            <p className="text-3xl font-light text-slate-900 mb-2">99.9%</p>
            <p className="text-sm">Uptime</p>
          </div>
          <div>
            <p className="text-3xl font-light text-slate-900 mb-2">24/7</p>
            <p className="text-sm">Support</p>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Home;
