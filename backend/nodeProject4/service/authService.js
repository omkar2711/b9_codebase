import userData from "../utils/data.js";
import jwt from 'jsonwebtoken';
import bcrypt from 'bcrypt';

const loginService = async(req, res) => {
    try{
        const { userEmail, password } = req.body;
        const user = userData.find(u => u.userEmail === userEmail);
        if (!user) {
            return res.status(401).json({ error: "Invalid credentials" });
        }
        const isMatch = await bcrypt.compare(password, user.password);
        if (!isMatch) {
            return res.status(401).json({ error: "Invalid credentials" });
        }
        const token = jwt.sign({ userEmail }, 'your_jwt_secret', { expiresIn: '1h' });
        if (user) {
            return res.json({ message: "Login successful", user, token });
        } else {
            return res.status(401).json({ error: "Invalid credentials" });
        }

    }
    catch(error){
        return res.status(500).json({ error: "Login failed" });
    }
}

const registerService = async (req, res) => {
    try {
        const { userId, userName, userEmail, password } = req.body;

        if (!userId || !userName || !userEmail || !password) {
            return res.status(400).json({ error: "All fields are required" });
        }

        const existingUser = userData.find(u => u.userEmail === userEmail);
        if (existingUser) {
            return res.status(409).json({ error: "User already exists" });
        }

        const hashedPassword = await bcrypt.hash(password, 10);
        const newUser = { userId, userName, userEmail, password: hashedPassword };
        userData.push(newUser);

        return res.status(201).json({ message: "Registration successful", user: newUser });
    }
    catch (error) {
        return res.status(500).json({ error: "Registration failed" });
    }
};

export { loginService, registerService };