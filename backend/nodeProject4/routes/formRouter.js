import {Router} from 'express';

const formRouter = Router();

formRouter.get('/', (req,res)=>{
    res.send("Form router is working!")
})

formRouter.post('/submit', (req,res)=>{
    const formData = req.body;
    console.log("Received form data:", formData);
    res.send("Form submitted successfully!");
});




export default formRouter;