//Add/remove style to html through event listeners
const toDoList = document.querySelectorAll('li');

toDoList.forEach(item => {
	item.addEventListener('click', () => {
		item.classList.toggle('completed');
	})
})