import { Router } from "express";

import userModel from "../model/userModel.js";
import { createUser } from "../controller/authController.js";

const userRouter = Router();


userRouter.get('/', (req,res)=>{
    res.send("User router is working!")
});


userRouter.get('/getAllUsers', async (req,res)=>{
    const data = await userModel.find();
    res.json(data);
});

userRouter.post('/createUser', createUser);

userRouter.put('/updateUser', async (req,res)=>{
    try{
        const { userId, userName, userEmail, password } = req.body;
        const userIndex = await userModel.findIndex(user => user.userId === userId);
        if (userIndex !== -1) {
            await userModel[userIndex].update({ userId, userName, userEmail, password });
            res.json(userModel[userIndex]);
        } else {
            res.status(404).json({ error: "User not found" });
        }
    }
    catch(error){
        res.status(500).json({ error: "Failed to update user" });
    }
});

userRouter.delete('/deleteUser', (req,res)=>{
    try{
        //use query params to get userId
        const userId = req.query.userId;
        const userIndex = userModel.findIndex(user => user.userId === userId);
        if (userIndex !== -1) {
            userModel.splice(userIndex, 1);
            res.json({ message: "User deleted successfully" });
        } else {
            res.status(404).json({ error: "User not found" });
        }
    }
    catch(error){
        res.status(500).json({ error: "Failed to delete user" });
    }
});

export default userRouter;