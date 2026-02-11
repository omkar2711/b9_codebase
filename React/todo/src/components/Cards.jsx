import React, { useState, useEffect } from 'react'

const Cards = ({note, handleDelete , isTaskList, count, setCount}) => {

  const [a , setA] = useState(0);
  const [c , setC] = useState(0);

  const handleSetA = () => {
    setA(a + 1);
  }

  const handleSetC = () => {
    setC(c + 1);
  }

  useEffect(()=>{
    const timer = setInterval(()=>{
      setCount(count + 1);
    },2000);

    return () => clearInterval(timer);
  },[c]);


  return (
    <div className='mb-4 p-4 border border-gray-300 rounded-md'>
      <p>Count : {count}</p>
      <button onClick={handleSetA}>Increment A</button>
      <button onClick={handleSetC}>Increment C</button>
       <div className='max-w-sm rounded overflow-hidden shadow-lg'>
            <h2 className='text-xl'>Title : {note.title}</h2>
            <p> Description : {note.description}</p>
            {isTaskList && <button className="bg-red-500 hover:bg-red-700 text-white font-bold py-2 px-4 rounded" onClick={() => handleDelete(note.id)}> Delete</button>}
          </div>
    </div>
  )
}

export default Cards
