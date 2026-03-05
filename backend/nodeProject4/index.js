import express from 'express';
import { configDotenv } from 'dotenv';
import formRouter from './routes/formRouter.js';
import userRouter from './routes/userRouter.js';

configDotenv();

const app = express();
const PORT = process.env.PORT || 3000;

app.use(express.json());

app.use('/api/form', formRouter);
app.use('/api/user', userRouter);

app.get('/', (req, res) => {
    res.send("Welcome to the Express Server!");
});

app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});