//"let" Preferred way to declare a variable 
//that can be reassigned later in code, block-scope so exists only
//in block of code where initialized.
let name = 'john';

//"const" Preferred way to declare a variablee that 
//"Can't" be reassigned, block-scope, considered outdated since not
//blogged-scope
const PI = 3.14;

//"var" blogged-scope where avaible throughout the 
//entire function or global-scope, make harder to reason about your code
//and avoid bugs, is outdated and should be avoided if possible
var count = 0;
if(true){
	count = 1;
	console.log(count);
}
console.log(count);