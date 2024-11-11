function divide(numerator,denominator) {
	if(denominator===0)
	{
		throw new Error('Division by Zero')
	}

	return numerator

	try {
		const result = divide(10,0)
		console.log(result);
	} catch(error) {
		// statements
		console.log(error.message);
	}