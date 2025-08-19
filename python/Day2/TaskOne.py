def calculateTwiceFathersAge(fathersAge, sonAge):
	if type(fathersAge and sonAge) == float:
		raise ValueError
	if type(fathersAge and sonAge) == str:
		raise ValueError
	multiply = sonAge * 2
	difference = fathersAge - multiply;
	return difference;



	