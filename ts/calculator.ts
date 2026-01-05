interface Calculator{
    add:(a:number,b:number)=>number
    sub:(a:number,b:number)=>number
    mul:(a:number,b:number)=>number
    div:(a:number,b:number)=>number
}

let calc:Calculator={
    add:(a,b)=>a+b,
    sub:(a,b)=>a-b,
    mul:(a,b)=>a*b,
    div:(a,b)=>a/b
}

console.log(calc.add(5,4))
console.log(calc.sub(5,4))
console.log(calc.mul(5,4))
console.log(calc.div(5,4))
