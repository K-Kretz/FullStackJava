window.onload{
	
}
const div = document.querySelector('div')
const spanOne = document.getElementById('one')
const spanTwo = document.getElementById('two')

console.log(spanOne.getAttribute('name'))

spanOne.setAttribute('name', 'abcd')
spanOne.removeAttribute('name')

spanOne.id = 'eawfawe'

spanTwo.classList.add('new-class')
spanTwo.classList.remove('new-class')
spanTwo.removeAttribute('class')

spanOne.style.color = 'red'
spanOne.style.backgroundColor = '#e0eb93'