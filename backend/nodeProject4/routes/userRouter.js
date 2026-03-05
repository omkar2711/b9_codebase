import { Router } from "express";
import userData from "../utils/data.js";

const userRouter = Router();


userRouter.get('/', (req,res)=>{
    res.send("User router is working!")
});


userRouter.get('/getAllUsers', (req,res)=>{
    res.json(userData);
});

userRouter.post('/createUser', (req,res)=>{
    try{
        const {userId, userName, userEmail, password} = req.body;
        const newUser = { userId, userName, userEmail, password };
        userData.push(newUser);
        res.status(201).json(newUser);
    }
    catch(error){
        res.status(500).json({ error: "Failed to create user" });
    }
    
});

userRouter.put('/updateUser', (req,res)=>{
    try{
        const { userId, userName, userEmail, password } = req.body;
        const userIndex = userData.findIndex(user => user.userId === userId);
        if (userIndex !== -1) {
            userData[userIndex] = { userId, userName, userEmail, password };
            res.json(userData[userIndex]);
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
        const { userId } = req.body;
        const userIndex = userData.findIndex(user => user.userId === userId);
        if (userIndex !== -1) {
            userData.splice(userIndex, 1);
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