class Person{
    constructor(public name:string,public id:number){}

    sayHello(){
        console.log("hello "+this.name)
    }
}

class Student extends Person implements User{
    constructor(public name:string,public id:number,public course:string,public email:string,public pwd:string){
        super(name,id)
    }
    getCourseInfo(){
        console.log(this.name+" registered into "+this.course)
    }

    getCredentials(): void {
        console.log(this.email+" "+this.pwd)
    }
}

let s:Student=new Student("Thanu",2021,"PP1","thanu@gmail.com","thanu@123")
s.sayHello()
s.getCourseInfo()
s.getCredentials()

interface User{
    email:string
    pwd:string
    getCredentials():void;
}

class employee implements User{
    constructor(public email:string,public pwd:string){
        this.email=email
        this.pwd=pwd
    }
    getCredentials(): void {
        console.log(this.email+" "+this.pwd)
    }
}

let e:employee=new employee("pooji@gmail.com","pooji@123")
console.log(e.getCredentials())
