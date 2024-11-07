//Strings are a sequence of chars but there is no char datatype
//can use either '' "" or ``
let str1 = 'HelloWorld';
let str2 = "HelloWorld";
let str3 = `123`; //let us embbed any expression int the string


console.log(`1 + 2 = ${1+2}`); // the first 1 + 2 is jsut visual
//but the ${1+2} will do the calculation with the evalueted expression


//.length property gives length in number
console.log(str1.length);

//Access individual chars in a string using []
console.log(str1[0]);

//STRINGS ARE IMMUTABLE, CAN't BE chagned in JS 
//CAnt do str2[0] = 'h';