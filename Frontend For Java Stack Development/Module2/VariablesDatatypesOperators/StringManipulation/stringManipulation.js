
//1. Concatenation is the process of joining two or
//more strings together to create a new string using + or .concat()

let a = "Hello";
let b = "world";

let c = a + " " + b;

let d = a.concat(" ",b);

console.log(c);
console.log(d);

//Either .slice() or .substring() you can use either the
//to get a part of a string
//.slice() extracts a section of string and returns a new 
//string without modifying original string
//.substring() extracts a section of string and returns a new 
//string without modifying original string

let e = c.substring(4,); // or c.substring(4); for all after 4
let f = c.slice(4,7); // or c.slice(4); for all after 4

console.log(e);
console.log(f);

//ALL methods with STrings will return a "NEW" string