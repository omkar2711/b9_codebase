import userModel from "../model/userModel.js";
import { loginService, registerService } from "../service/authService.js";
const loginController = (req, res) => {
    try{
       
        // Extra : Validation, logging, etc.
        return loginService(req, res);
    }
    catch(error){
        return res.status(500).json({ error: "Login failed" });
    }
}

const registerController = (req, res) => {
    try {
        return registerService(req, res);
    }
    catch (error) {
        return res.status(500).json({ error: "Registration failed" });
    }
};

const createUser = async (req, res) => {
    try {
        const {
            userId,
            userName,
            userEmail,
            password
        } = req.body;

        if (!userId || !userName || !userEmail || !password) {
            return res.status(400).json({ error: "All fields are required" });
        }

        const newUser = { userId, userName, userEmail, password };
        console.log("New user data:", newUser);
        await userModel.create(newUser);

        
        return res.status(201).json({ message: "User created successfully", user: newUser });
       
    }
    catch (error) {
        return res.status(500).json({ error: "Failed to create user" });
    }
};

export { loginController, registerController, createUser };