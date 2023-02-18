
const route = require('express').Router();
const users = require('./user');
const product = require('./product');

route.use('/users' , users);
route.use('/products' , product);

module.exports = route