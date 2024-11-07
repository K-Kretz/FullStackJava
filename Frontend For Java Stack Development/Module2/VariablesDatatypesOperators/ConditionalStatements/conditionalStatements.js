//if(){}else{} is a populare conditional statement

let age = 18;

if(age > 17)
{
	console.log("Can drive");
}
else
	console.log("Cant Drive");

//switch(){case value1: "do this code" break; 
//case value2: "do this code" break; 
//default: "Do this code" break;}

switch(age>17)
{
case true: console.log("yes");
	break;
case false: console.log("No");
	break;
default: console.log("Something went wrong");
	break;
}