
// ! Arrow function with two arguments
const sum = (firstParam, secondParam) => {

    return firstParam + secondParam;
};
console.log(sum(2 , 3)); // * Prints : 7

// ! Arrow function with no arguments
const printHello = () => {

    console.log("hello");
};
printHello(); // * Prints : hello

// ! Arrow functions with a single argument
const checkWeight = (weight) => {

    console.log(`Baggage weight : ${weight} kilograms.`);
};
checkWeight(72); // * Prints : Baggage weight : 72 kilograms.

// ! Concise arrow functions
const multiply = (a , b) => a * b;
console.log(multiply(2 , 30)); // * Prints : 60