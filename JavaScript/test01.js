
const str1 = 'The Fox';
const str2 = 'The Dog';
const str3 = 'The Cat';

findLostString(str1);
findLostString(str2);
findLostString(str3);

function findLostString(string) {

    const targets = []
    const alphabets = [
        'q', 'w', 'e', 'r', 't', 'y',
        'u', 'i', 'o', 'p', 'a', 's',
        'd', 'f', 'g', 'h', 'j', 'k',
        'l', 'z', 'x', 'c', 'v', 'b',
        'n', 'm'
    ];

    string = string.split(' ').join('').toLowerCase();

    for (let char of string) targets.push(char);
    for (let target of targets) for (let char of targets) if (target == char) alphabets.splice(alphabets.indexOf(char) , 1);

    console.log(alphabets.sort());
}