import express from "express";
import cors from "cors";
import dotenv from "dotenv";

dotenv.config(); //loading environment variables from .env file

const app = express(); //creating an instance of express
const PORT = process.env.PORT || 3000; //defining the port number

app.use(cors()); //enabling CORS for all routes

app.use(express.json()); //middleware to parse JSON bodies


// Define a simple route to test the server
app.get("/", (req, res)=>{
    res.send("Welcome to the Doctor's Appointment API");
});

// Start the server
app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});



