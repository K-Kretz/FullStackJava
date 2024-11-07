
let x = 5; //Number that can be int or float

//BigInt used for ints of arbitary length, rarely needed, but 
//applying 'n' at end of int means it a big int
const bigInt = 12344152423543521531521363411236543645745736753463457n;

//'typeof' How find out the type through console
console.log(typeof bigInt);

//String is ued when a sequances of chars
let name = 'John';

//Boolean that means true or false, they represented in js by
//Boolean keyword
let isTrue = true;

//Null is the intential abscence of an objects value
let isNull = null;

//Undefined is when not initialzed and only declared
var age;
console.log(typeof age);

//object is complex type where used for arrays such as shown below
let person = {
	name: 'john',
	age: 30,
}

//symbol built-in object whose constructor returns a symbol primitive,
//that's guaranteed to be unique
let id = Symbol('id');
