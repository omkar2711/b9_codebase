import React,{useRef,useMemo, useCallback} from 'react'
import Component2 from './Component2.jsx'
import {useCounter} from '../Hooks/CounterHook.jsx';

const Comonent1 = () => {


    const data = useRef() //
    const {count , increment , decrement} = useCounter();

    const calculationFunction = (value) => {
        let sum = 0;
        for(let i = 0;i<100000;i++){
            for(let i = 0;i<100000;i++){
                sum += i + value;
            }
        }

        return sum;
    }


    const data1 = useCallback(()=>{
        return calculationFunction(value);
    },[value]);
    



  return (
    <div>
      <Component2 />
    </div>
  )
}

export default Comonent1
