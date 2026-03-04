import express from 'express'
import data from './data.js';
const app = express()
const port = 3000

app.use(express.json()); //middleware to parse JSON bodies


app.get('/', (req, res) => {
  res.send('Hello World!')
})

app.get('/about', (req, res) => {
  res.send('About Page')
})

app.get('/contact', (req, res) => {
  res.send('Contact Page')
})

app.get('/data', (req, res) => {
  res.json(data);
});

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})
