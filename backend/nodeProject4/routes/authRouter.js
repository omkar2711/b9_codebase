import {Router} from 'express';
import { loginController, registerController } from '../controller/authController.js';

const authRouter = Router();

authRouter.get('/', (req,res)=>{
    res.send("Auth router is working!")
})

authRouter.post('/login', loginController);
authRouter.post('/register', registerController);

export default authRouter;