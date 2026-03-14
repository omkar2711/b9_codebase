import mongoose from "mongoose";

const User = mongoose.Schema({
    userId: { type: String, required: true, unique: true },
    userName: { type: String, required: true },
    userEmail: { type: String, required: true, unique: true },
    password: { type: String, required: true },
    role : { type: String, enum: ['user', 'admin'], default: 'user' }
})

const userModel = mongoose.model("User", User);

export default userModel;

