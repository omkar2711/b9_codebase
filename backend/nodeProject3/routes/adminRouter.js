import { Router } from "express"


const adminRouter = Router();

adminRouter.get('/adminDetails',(req, res)=>{
    res.send("Admin Details!")
});


adminRouter.post('/adminDetails',(req, res)=>{
    res.send("Admin Details updated!")
});

export default adminRouter;

