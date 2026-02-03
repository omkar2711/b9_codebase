const country = ["India" , "united states of america", "South Africa"];

const ans = country.reduce((acc, curr)=>{
    let n = curr.length;
    console.log(n);
    if(n > acc.size){
        acc.string = curr;
        acc.size = n;
    }

    return acc;
}, {
    string: "",
    size : 0
});

console.log(ans);