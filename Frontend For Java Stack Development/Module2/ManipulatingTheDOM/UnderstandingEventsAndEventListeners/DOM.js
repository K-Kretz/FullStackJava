document.addEventListener('load', () =>{

	//click event listeners
	const button = document.querySelector('#mybutton');

	button.addEventListener('click', () => {
		alert("Hello World");
	})

	//Key event press Listener
	const searchBox = document.querySelector('#searchBox');

	searchBox.addEventListener('keyup', () => {
		console.log('Event Triggered');
	})	
})
