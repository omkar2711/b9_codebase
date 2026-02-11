import {useState} from 'react'
const useFetch = () =>{
    const [data, setData] = useState({});

    //fecthing

    const filterData = () => {};

    return {data, filterData};
}

const useCounter = () => {
    const [count , setCount ] = useState();

    const increment = () => {
        setCount(count + 1);
    }

    const decrement = () => {
        setCount(count - 1);
    }


    return {count , increment, decrement};
}

export {
    useCounter,
    useFetch
}