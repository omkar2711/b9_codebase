import React from 'react'
import { useEffect } from 'react'
import { useNavigate } from 'react-router-dom';

const Home = ({userLoggedIn}) => {

    const navigate = useNavigate();

    useEffect(() => {
        if(!localStorage.getItem('token')){
            navigate('/login');
        }
    }, [userLoggedIn, navigate])

  return (
    <div>
      <h1>Home Page</h1>
    </div>
  )
}

export default Home
