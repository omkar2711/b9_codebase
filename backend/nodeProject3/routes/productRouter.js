import { Router } from 'express';

const productRouter = Router();


productRouter.get('/',(req,res)=>{
    res.send("Product router is working!")
})

productRouter.get('/details', (req,res)=>{
    res.send("Product Details!")
});

productRouter.post('/details', (req,res)=>{
    res.send("Product Details updated!")
});

productRouter.delete('/delete', (req,res)=>{
    res.send("Product Deleted!")
});


export default productRouter;