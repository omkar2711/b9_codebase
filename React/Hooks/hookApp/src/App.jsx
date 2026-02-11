import { useState, useContext } from 'react'
import {ThemeContext} from './store/context.jsx';
import './App.css'
import Comonent1 from './component/Comonent1.jsx';

function App() {
  const [t , setT] = useState('light');

  const {theme, toggleTheme} = useContext(ThemeContext);

  return (
    <>
    <h1>App Component</h1>
     {theme === 'light' ? <h1>Light Theme</h1> : <h1>Dark Theme</h1>}
     <button onClick={toggleTheme}>Toggle Theme</button>

     <Comonent1 />
    </>
  )
}

export default App
