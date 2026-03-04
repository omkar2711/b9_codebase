import { Router } from "express"


const userRouter = Router();

userRouter.get('/Details',(req, res)=>{
    res.send("User Details!")
});


userRouter.post('/Details',(req, res)=>{
    res.send("User Details updated!")
});

export default userRouter;

