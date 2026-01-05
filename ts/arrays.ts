// let names=['priya','papai','jaya']
// console.log(names)

// let person={
//     name:"pooji",
//     id:123
// }

// console.log(person)


class Student{
   sname:string;
   sid!:number
    // constructor(){
    //     this.sname="priya"
    //     this.sid=234
    // }
    constructor(sname:string,sid:number){
        this.sname=sname
        this.sid=sid
    }
}
// let s=new Student()

// console.log(typeof Student)
// console.log(typeof s)
// console.log(s)
// s.sname="pooji"
// s.sid=456
// console.log(s)

let sArray:Student[]=[
    new Student("Thanu",120),
    new Student("Deepu",121),
    new Student("Jaya",122)
];

console.log(sArray)

for(let i=0;i<sArray.length;i++){
    // console.log(sArray[i].sname.toUpperCase())
    console.log(sArray[i]?.sname.toUpperCase()+" "+sArray[i]?.sid)
}




