import {Router} from 'express';

const formRouter = Router();

formRouter.get('/', (req,res)=>{
    res.send("Form router is working!")
})




export default formRouter;