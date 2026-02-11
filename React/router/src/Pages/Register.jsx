import React from 'react'
import { useNavigate } from 'react-router-dom';

const Register = ({userLoggedIn, setUserLoggedIn}) => {
    const navigate = useNavigate();

    const onHandleRegister = () => {
        //localstorege / backend api calls
        localStorage.setItem('token', '1234567890');
        setUserLoggedIn(true);
        navigate('/');
    }
  return (
    <div>
      <h1>
        Register Page
      </h1>

      <button onClick={onHandleRegister}>Register</button>
    </div>
  )
}

export default Register
