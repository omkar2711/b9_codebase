import React from 'react'

const Hero2 = (props) => {
  return (
    <div>
        <h1>Hero 2</h1>
      <h2>Count : {props.count}</h2>
      <h2>Custom Count : {props.customVal}</h2>
    </div>
  )
}

export default Hero2
