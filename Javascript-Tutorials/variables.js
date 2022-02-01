var x=6,y=8,z=10;
let yz=9,zx=6,yx=3;
var d=0.999;
let pi=3.124567894;
console.log(x);
console.log(y);
console.log(z);
console.log(d);
console.log(pi);
var _variable =12345;
let st="Helloworld";
var qwerty="qwerty";

const va=10;
//va=20;
console.log(va);
//this is comment
//JavaScript Datatypes
//String, number, BigInt, 123456789012345678912345678n, 
//Boolean, undefined, null, Symbol and object
var string = 'Sachin'  //string
var str="Tendulkar" //string
var BigInt=12345678901234567890n; //BigInt -()
var Boolean=true //Boolean
var Bool=false //Boolean
var a; //Undefined
let value=Symbol('hello') //Symbol
var val=Symbol("World") //Symbol
let student={
    id:101,
    firstname:"Sachin",
    lastname:null,
    class:10
}; //Object 
//Note: Except object all the datatypes are primitive.
console.log(student)
console.log(typeof(student))

//JavaScript Operators
//1. Assignment operators  : +=,-=,*=,/=,%=, **=
//2. Arithmetic Operators : +,-,*,/,**, %, ++,--
//3. Comparison Operators : ==, !=. ===, !==, < ,> <=, >=
//4. Logical Operators : &&, || , !
//5. Bitwise Operators : &,|,^,~,<< , >> , >>>
//6. String Operators : concatination
//7. Other Operators : , , ?: ,delete, typeof, void, inn, instanceof

let xnumber=2;
let ynumber=2;
let zstring= "abc"
console.log(xnumber==ynumber) //true
console.log(xnumber===ynumber)//true '===' returns true if only if datatypes are must from the same data
// if the operands are equals of the same type
console.log(xnumber===zstring)
console.log(x==z)

var number=10;
var stringg="Sachinabcd"
console.log(number===stringg)
console.log(number==stringg)