import React from 'react'
import { Link, Outlet } from 'react-router-dom'


const Dashboard = () => {
  return (
    <div>
      <h1>Dashboard Page</h1>
      <Link to="/dashboard/profile">Go to Profile</Link>
      <Link to="/dashboard/settings">Go to Settings</Link>

      <Outlet /> {/* This will render the nested routes (Profile) */}
    </div>
  )
}

export default Dashboard
