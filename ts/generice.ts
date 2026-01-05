// function sayHello<T>(t : T):void{
//     console.log(t)
//     console.log(typeof t)
// }

// function getName(name:string):string{
//     return name.toUpperCase()
// }

// // sayHello("POOJITHA")
let p={
    name:'Thanuja',
    id:908
}
// sayHello(getName("pavithra"))
// let myname="pooja"
// sayHello((myname:string)=>myname.toUpperCase())


class Container<T>
{
    constructor(public t:T){}
    getValue():T{
        return this.t;
    }
}
let numCont:Container<number>=new Container(56);
let nameCont:Container<string>=new Container("Pooja")
let objCont:Container<Object>=new Container(p)

console.log(numCont.getValue())
console.log(nameCont.getValue())
console.log(objCont.getValue())

