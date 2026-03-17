import {Router} from "express";

const authRouter = Router();

// POST /auth/register - Register a new user (patient or doctor)
authRouter.post("/register", (req, res) => {
	// Controller: registerUser
	res.status(201).json({ message: "User registered successfully" });
});

// POST /auth/login - Login a user and return a JWT token
authRouter.post("/login", (req, res) => {
	// Controller: loginUser
	res.status(200).json({ message: "User logged in successfully", token: "jwt-token" });
});

// POST /auth/logout - Logout a user (invalidate JWT token)
authRouter.post("/logout", (req, res) => {
	// TODO: Add verifyToken middleware if logout requires authentication
	// Controller: logoutUser
	res.status(200).json({ message: "User logged out successfully" });
});


export default authRouter;