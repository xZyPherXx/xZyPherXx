
const route = require('express').Router();

route.get('/' , (req , res) => {

    res.send('This is Product Route');
});

module.exports = route