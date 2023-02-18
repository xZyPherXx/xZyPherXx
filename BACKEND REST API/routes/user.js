
const route = require('express').Router();

// CRUB
// Mock data
var users = [

    {
        id : 1 ,
        name : 'ZyPherX' ,
        age : 20
    } ,
    {
        id : 2 ,
        name : 'Punnawat' ,
        age : 666
    }

];

route.get('/' , (req , res) => {

    // throw new Error('Somthing went worng'); //Ex. Err

    //Handle Error
    try {

        res.status(200).json({
    
            message : 'Success' ,
            data : users ,
        });
    } catch(err) { res.send(`Error : ${err}`); }

});

route.post('/' , (req , res) => {

    let { name } = req.body;
    let { age } = req.body;

    try {

        const user = {

            id : users.length++ ,
            name : name ,
            age : age
        }

        users.push(user);

        res.status(200).json( {
            
            message : 'Insert Success' ,
            data : users
        });
    } catch(err) { res.send(`Error : ${err}`); }

});

// params
route.get('/:name/:age' , (req , res) => {

    let name = req.params.name;
    let age = req.params.age;

    console.log(name , age);
    res.send(`Your name : ${name}, Your age : ${age}`);
});

// query
// localhost:666/?name=ZyPherX
// localhost:666/?name=ZyPherX&age=20
route.get('/' , (req , res) => {

    console.log(req.query);
    res.end();
});

// body
route.post('/' , (req , res) => {

    let name = req.body.name;
    let age = req.body.age;

    console.log(req.body.name);
    console.log(req.body.age);
    res.send(`Your name : ${name}, Your age : ${age}`);
});

// put = All database
// patch = Some database

route.put('/:id' , (req , res) => {

    try {

        const id = req.params.id;
        const name = req.body.name;
        const age = req.body.age;
        
        for (let index = 0 ; index < users.length ; index++) {

            if (users[index].id == id) {

                users[index].name = name;
                users[index].age = age;
            }

        }

        res.status(200).json({

            message : "Changed Success" ,
            data : users
        });
    } catch(err) { res.send(`Error : ${err}`); }

});

route.delete('/:id' , (req , res) => {

    try {

        const id = req.params.id;

        for (let index = 0 ; index < users.length ; index++) {

            if (users[index].id == id) users.splice(index , 1);
        }

        res.status(200).json({

            message : "Deleted Success" ,
            data : users
        });

    } catch(err) { res.send(`Error : ${err}`); }

});

module.exports = route;