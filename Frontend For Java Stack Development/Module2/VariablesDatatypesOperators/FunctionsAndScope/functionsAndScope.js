//Group of code that can reuse through calling the function
//function "functionName"(param1,param2){ return value; <- optional else returns undefined by default}
function addNumbers(num1,num2){
	let sum = num1 + num2;
	return sum;
}

console.log(addNumbers(5,10));

let globalScope = 10;

function minusScope(param1){
	let result = param1 - globalScope;
	return result;
}

console.log(minusScope(5));