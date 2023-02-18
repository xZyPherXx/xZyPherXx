
require('dotenv').config(); // env config
const express = require('express'); // Express in node_modules
const PORT = process.env.PORT || 3000; // Port = .env PORT
const app = express();
const route = require('./routes');

app.use(express.json()); // Express know JSON for body
app.use('/api' , route);
app.use(express.static(__dirname + '/FRONTEND'));

app.listen(PORT , () => {

    console.log(`Server running on port : ${PORT}`);
});