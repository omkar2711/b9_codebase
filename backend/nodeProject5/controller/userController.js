import { loginService, registerService } from "../service/userService.js"
const loginController = async(req, res) => {
    try{
        const {email, password} = req.body;
        const result = await loginService(email, password);
        res.status(200).json({message: 'Login successful', data: result})
    }
    catch(error){
        res.status(500).json({message: 'Server error', error: error.message})
    }
}

const registerController = async(req, res) => {
    try{
        const {name, email, password, role} = req.body;
        const result = await registerService(name, email, password, role);
        res.status(201).json({message: 'Registration successful', data: result})
    }
    catch(error){
        res.status(500).json({message: 'Server error', error: error.message})
    }
}

export {loginController, registerController};