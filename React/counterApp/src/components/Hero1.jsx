import React , {useState} from 'react'

const Hero1 = ({count, setCount, customVal, setCustomVal}) => {

  

  const [cnt, setCnt] = useState(0);

  const handleIncrement = () => {
    setCount(prev => prev + 1)
    setCnt(cnt+1);
  }

  const handleDecrement = () => {
    setCount(prev => prev - 1)
    setCnt(cnt-1);
  }

  const handleReset = () => {
    setCount(0)
    setCnt(0);
  }

  const handleCustomIncrement = () => {
    setCount(prev => prev + customVal);
    setCnt(cnt + customVal);
  }

    const handleCustomDecrement = () => {
    setCount(prev => prev - customVal);
    setCnt(cnt - customVal);
  }


  return (
    <div>
       <h1>Count : {count}</h1>
      <h1>Cnt : {cnt}</h1>

      <input type="number" value={customVal} onChange={(e) => setCustomVal(Number(e.target.value))} />
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={handleDecrement}>Decrement</button>
      <button onClick={handleReset}>Reset</button>
      <button onClick={handleCustomIncrement}>Custom Increment</button>
      <button onClick={handleCustomDecrement}>Custom Decrement</button>


      <h2>Custom Value: {customVal}</h2>
    </div>
  )
}

export default Hero1
