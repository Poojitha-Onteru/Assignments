abstract class Account{
    accno:string;
    accName:string;
    ifsc:string

    constructor(accno:string,accName:string,ifsc:string){
        this.accno=accno;
        this.accName=accName
        this.ifsc=ifsc
    }
}

class SavingAccount extends Account{
    balance:number
    constructor(accno:string,accName:string,ifsc:string,balance:number){
        super(accno,accName,ifsc)
        this.balance=balance
    }
}
    

let sacc:SavingAccount=new SavingAccount("56789045","pooji","icic6789",45000)
console.log(sacc)