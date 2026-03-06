import express from 'express';
import dotenv from 'dotenv';
import formRouter from './routes/formRouter.js';
import userRouter from './routes/userRouter.js';
import authRouter from './routes/authRouter.js';
import dbConnect from './utils/dbConnect.js';

dotenv.config();

const app = express();
const PORT = process.env.PORT || 3000;

dbConnect();

app.use(express.json());



app.use('/api/form', formRouter);
app.use('/api/user', userRouter);
app.use('/api/auth', authRouter);

app.get('/', (req, res) => {
    res.send("Welcome to the Express Server!");
});

app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});