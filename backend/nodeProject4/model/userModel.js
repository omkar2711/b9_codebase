import mongoose from "mongoose";

const User = mongoose.Schema({
    userId: { type: String, required: true, unique: true },
    userName: { type: String, required: true },
    userEmail: { type: String, required: true, unique: true },
    password: { type: String, required: true }
})

const userModel = mongoose.model("User", User);

export default userModel;

