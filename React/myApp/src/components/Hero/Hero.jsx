import React from 'react'
import Card from '../Card/Card.jsx'
import './Hero.css'





const Hero = () => {

    const data = [1,2,3,4,5]; // Dummy array to demonstrate multiple Card components
  return (
    <div id='hero'>
      <h2>This is Hero Component</h2>
      {data.map(item => (
        <Card n={item} key={item} />
      ))}
      
    </div>
  )
}

export default Hero
