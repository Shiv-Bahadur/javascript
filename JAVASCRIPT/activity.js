let prom= new Promise((resolve, reject) => {
    setTimeout(async() => {
       resolve(10); 
    }, 1000);
});

prom.then((num)=>{
    console.log("this is "+num);
}).catch((error)=>{
    console.log(error);
})
//this is for practice.