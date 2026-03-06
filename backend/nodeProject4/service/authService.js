import userData from "../utils/data.js";

const loginService = (req, res) => {
    try{
        const { userEmail, password } = req.body;
        const user = userData.find(u => u.userEmail === userEmail && u.password === password);
        if (user) {
            return res.json({ message: "Login successful", user });
        } else {
            return res.status(401).json({ error: "Invalid credentials" });
        }
    }
    catch(error){
        return res.status(500).json({ error: "Login failed" });
    }
}

const registerService = (req, res) => {
    try {
        const { userId, userName, userEmail, password } = req.body;

        if (!userId || !userName || !userEmail || !password) {
            return res.status(400).json({ error: "All fields are required" });
        }

        const existingUser = userData.find(u => u.userEmail === userEmail);
        if (existingUser) {
            return res.status(409).json({ error: "User already exists" });
        }

        const newUser = { userId, userName, userEmail, password };
        userData.push(newUser);

        return res.status(201).json({ message: "Registration successful", user: newUser });
    }
    catch (error) {
        return res.status(500).json({ error: "Registration failed" });
    }
};

export { loginService, registerService };