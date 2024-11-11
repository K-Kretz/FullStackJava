//below lists all the properties and methods under the document root
//console.dir(document);

//get domain
console.log(document.domain);

//get URL
console.log(document.URL);

//get title and change it
document.title = "This new title";

//get body and the html in it
console.log(document.body.innerHTML);

//add to body
const body = document.body;

body.append('YOYO');

//create a new element
const div = document.createElement('div')
//created a n empty div not yet "ADD" to document
console.log(div);

//lets add text to the div
div.innerText = 'javascript'



//adding element to document
body.append(div);


//removing an element 'div'
body.removeChild(div) //removes the child 
//Or
div.remove() //removes this particular div as well

//body.remove(div) removes all divs in body