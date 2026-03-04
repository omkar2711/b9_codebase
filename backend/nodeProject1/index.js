// server.mjs
import { createServer } from 'node:http';
import { readFile, writeFile } from 'node:fs';
import { dirname } from 'node:path';
import os from 'node:os';

const server = createServer((req, res) => {
//   res.writeHead(200, { 'Content-Type': 'text/plain' });
  res.end('Hello World!\n');
});

const code = `console.log('Hello World!');
`;  

// writeFile('deo.txt', code, (err) => {
//   if (err) throw err;
//   console.log('File has been saved!');
// });


console.log('Operating System:', os.platform());
console.log('CPU Architecture:', os.arch());
console.log('Total Memory:', os.totalmem());


//   readFile('demo.txt', 'utf8', (err, data) => {
//     if (err) throw err;
//     console.log('File content:', data);
//   });


// starts a simple http server locally on port 3000
server.listen(3000, '127.0.0.1', () => {
  console.log('Listening on 127.0.0.1:3000');
});

// run with `node server.mjs`

