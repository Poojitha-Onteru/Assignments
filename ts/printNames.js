const names=["lalitha","swapna","priya","jaya","Radha"]
// console.log(names)

for(i=0;i<names.length;i++){
    document.writeln(names[i]+"<br>")
}

let persons=[
    {
    name:"pavan",
    id:123,
    salary:45000,
    desg:"trainer"
},
{
    name:"Thanuja",
    id:123,
    salary:45000,
    desg:"trainer"
},
{
    name:"Demon",
    id:123,
    salary:45000,
    desg:"trainer"
},
{
    name:"Imanuel",
    id:123,
    salary:45000,
    desg:"trainer"
}
]

//persons.forEach(person=>{document.writeln(person.name+"|"+person.id+"|"+person.salary+"|"+person.desg+"<br>")})
document.writeln("<table border=3 style='border:3px solid blue'><tr><th>Person name</th><th> person id </th><th>person salary</th><th>  person desg  </th></tr>")

persons.forEach(p=>{
    document.writeln("<tr><td>"+p.name+"</td>")
    document.writeln("<td>"+p.id+"</td>")
    document.writeln("<td>"+p.salary+"</td>")
    document.writeln("<td>"+p.desg+"</td></tr>")

})
document.writeln("</table>")