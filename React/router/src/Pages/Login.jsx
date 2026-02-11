import React, {useEffect} from 'react'
import { Link, useNavigate } from 'react-router-dom';


const Login = ({userLoggedIn}) => {

    const navigate = useNavigate();

    useEffect(()=>{
        if(localStorage.getItem('token')){
            navigate('/');
        }
    },[navigate]);


    const onHandleLogin = () => {
        localStorage.setItem('token', '1234567890');
        navigate('/');
    }

  return (
    <div>
      <h1>Login Page</h1>
      <Link to="/register">Don't have an account? Register here</Link>
      <button onClick={onHandleLogin}>Login</button>
    </div>
  )
}

export default Login
