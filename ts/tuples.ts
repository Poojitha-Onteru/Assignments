let person:[number,string]=[1.90,'pooji']
let persons:[number,string][]=[[234,'priya'],[124,'keerthi'],[125,'mike']]
console.log(person)
console.log(persons)

let arr=new Array<number>(5).fill(0)
// arr[0]=120
// arr[1]=121
// arr[2]=122
// arr[3]=124
// arr[4]=125
// arr[5]=126

console.log(arr)
let mynums= Object.freeze([12,13]) 
let mynumsarr:number[]=[12,12,14,15,16]
mynumsarr.push(0)
console.log(mynumsarr)
mynumsarr.pop()
console.log(mynumsarr)
mynumsarr.pop()
console.log(mynumsarr)
// mynums.push(13)
console.log(mynums)


// let student={
//     name:'priya',id:342
// }
// console.log(student.name+" "+student.id)
// student.id=22