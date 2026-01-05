// enum status{
//     PENDING=10,ACTIVE=90,APPROVED=23,REJECTED=45
// }

// let txstatus:status=status.PENDING    //0
// console.log(txstatus)
// txstatus=status.ACTIVE
// console.log(txstatus)

enum traffic{
    RED='STOP',YELLOW='GET READY',GREEN='GO'
}

let signal:traffic=traffic.RED
console.log(signal)
signal=traffic.YELLOW
console.log(signal)
signal=traffic.GREEN
if(signal===traffic.GREEN)
    console.log("YOU CAN GO NOW")

