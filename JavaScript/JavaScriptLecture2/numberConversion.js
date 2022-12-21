
let num = '150';
let float = '1.50';

console.log("********Converting string to integers********");
//! Converting strings to integers
console.log(parseInt('100'));
console.log(parseInt(num));
console.log(parseInt('ABC'));
console.log(parseInt('0xF')); //* Hexdecimal number

console.log("********Converting strings to float********");
//! Converting strings to float
console.log(parseFloat('1.25abc'));
console.log(parseFloat(float));
console.log(parseFloat('ABC'));

console.log("********More Concersion Examples********");
//! More Conversion Examples
//! Number after special characters are ignored
console.log(parseInt('1.5'));
console.log(parseInt('1 + 1'));

//! Using Template Literals
console.log(parseInt(`${1 + 1}`));

console.log("********Converting numbers to strings********");
//! Converting number to strings
console.log(num.toString());
console.log(float.toString());
console.log((100).toString());