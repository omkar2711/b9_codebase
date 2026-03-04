import express from 'express'
import adminRouter from './routes/adminRouter.js';
import productRouter from './routes/productRouter.js';
import userRouter from './routes/userRouter.js'

const app = express();
const port = 3000;

app.use(express.json()); // Middleware to parse JSON bodies

app.get('/', (req, res) => {
  res.send('Hello World!');
});

app.use('/api/admin', adminRouter); // Use the admin router for /api/admin routes
app.use('/api/product', productRouter);
app.use('/api/user', userRouter);

app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);
});
