import React, {useContext} from 'react'
import {ThemeContext} from '../store/context.jsx';

const Component2 = () => {

    const {theme, toggleTheme} = useContext(ThemeContext);
  return (
    <div>
        <h1>Component 2</h1>
   {theme === 'light' ? <h1>Light Theme</h1> : <h1>Dark Theme</h1>}
   <button onClick={toggleTheme}>Toggle Theme</button>
    </div>
  )
}

export default Component2
