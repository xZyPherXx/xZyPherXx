
const pos1 = ['n' , 'e' , 'n' , 'e' , 'e' , 'n'];
const pos2 = ['n' , 'e' , 'e' , 'n' , 'e' , 'n'];
const pos3 = ['n' , 'e' , 'w' , 'w' , 'w' , 'w' , 'n'];
const pos4 = ['n' , 'e' , 'n' , 'e' , 'e' , 's'];

findPos(pos1);
findPos(pos2);
findPos(pos3);
findPos(pos4);

function findPos(pos) {

    let board = [
        0 , 0 , 0 , 0 , 0 , 0 , 0 , 
        0 , 0 , 0 , 0 , 0 , 0 , 0 ,
        0 , 0 , 0 , 0 , 0 , 0 , 0 ,
        0 , 0 , 0 , 0 , 0 , 0 , 0 ,
        0 , 0 , 0 , 666 , 0 , 0 , 0, 
        0 , 0 , 0 , 0 , 0 , 0 , 0
    ];
    let walk = 31;

    for (let index = 0 ; index < pos.length ; index++) {

        if (pos[index] === 'n') walk -= 7;
        else if (pos[index] === 's') walk += 7;
        else if (pos[index] === 'e') walk += 1;
        else if (pos[index] === 'w') walk -= 1;
    }

    let lastPost = (walk === 13) ? 'TG1' : (walk == 14) ? 'TG2' : 'Lost';
    console.log(lastPost);
}