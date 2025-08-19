def return_the_display(array):
	if count == 0:
		return "no one like this";
	elif count == 1:
		return f"(array)[0]",'like this';
	elif count == 2:
		return f"(array)[0],(array)[1]",'like this';
	elif count == 3:
		return f"(array)[0]",f"(array)[1],(array)[2]",'like this';
	elif count > 3:
		return f"(array)[0],(array)[1] and (len(array) -2)", 'others like this`;

array = ["peter", "Hunter", "Muhammed", "ibrahim"];
print(returnDisplay(array)
	
