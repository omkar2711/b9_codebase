const fetchData = async () =>{
    try {
        const response = await fetch(url);
        const data = await response.json();

        // Process the data as needed
        console.log('Data fetched:', data);
    }
    catch(err){
        console.log('Error fetching data:', err);
    }
}

//promise
const getData = () => {
    fetch('https://jsonplaceholder.typicode.com/posts/1')
    .then(response => response.json())
    .then(data => {
        //process the data as needed
        console.log('Data fetched:', data);
    })
    .catch(err => {
        console.log('Error fetching data:', err);
    });
}