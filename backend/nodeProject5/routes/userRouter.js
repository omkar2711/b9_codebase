import {Router} from 'express'
import {loginController, registerController} from '../controller/userController.js'
import { loginRequired, registrationRequired } from '../middleware/userMiddleware.js';

const userRouter = Router();

userRouter.get('/', (req, res) => {
    res.send('User route is working!');
});

userRouter.post('/login' , loginRequired, loginController);
userRouter.post('/register' , registrationRequired, registerController);


export default userRouter;