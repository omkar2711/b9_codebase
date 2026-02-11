import React , {useState} from 'react'
import { BrowserRouter , Routes, Route } from 'react-router-dom';
import Home from './Pages/Home.jsx';
import AboutUs from './Pages/AboutUs.jsx';
import Profile from './Pages/Profile.jsx';
import ContactUs from './Pages/ContactUs.jsx';
import Dashboard from './Pages/Dashboard.jsx';
import Settings from './Pages/Settings.jsx';
import Login from './Pages/Login.jsx';
import Register from './Pages/Register.jsx';


const App = () => {

  const [userLoggedIn, setUserLoggedIn] = useState();

  return (
      <Routes>
        <Route path='/' element={<Home userLoggedIn={userLoggedIn}/>} />
        <Route path='/login' element={<Login userLoggedIn={userLoggedIn}  />} />
        <Route path='/register' element={<Register userLoggedIn={userLoggedIn} setUserLoggedIn={setUserLoggedIn} />} />
        <Route path='/about-us' element={<AboutUs />} />
        <Route path='/contact-us' element={<ContactUs />} />
        <Route path='/dashboard' element = {<Dashboard />}>
          <Route path='profile/:id' element={<Profile />} />
          <Route path='settings' element={<Settings />} />
        </Route>

      </Routes>
  )
}

export default App
