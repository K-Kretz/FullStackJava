const addButton = document.querySelector('#addButton');
const removeButton = document.querySelector('#removeButton');

const foodlist = document.querySelector('#foodlist');


//Creating, Adding, Removing Html into other elements
addButton.addEventListener('click', () =>{
	const newListItem = document.createElement('li')

	const newListItemText = document.createTextNode('Tacos');

	newListItem.append(newListItemText);
	newListItem.classList.add('taco');
	foodlist.appendChild(newListItem);	
})

removeButton.addEventListener('click',() => {
	const sushi =document.getElementById('sushi');

	foodlist.removeChild(sushi);
})