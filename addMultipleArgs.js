function addMultiples(...nums){
    let res =0;
    for(let num of nums) {
        res += num;
    }
    return res;
    }

    console.log(addMultiples(5,7,9)) ;