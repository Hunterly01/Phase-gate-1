new_array = [];
def add_my_item(add_item):
	new_array.append(add_item);
	return new_array;

def remove_my_item(remove_item):
	new_array.remove(remove_item);
	return new_array;

def to_show_item():
	if not new_array:
		return "List is empty";
	for count in new_array:
		new_array[count];



while(True):
	name = """ 
			WELCOME TO YOUR GROCERY STORE
		   
		  
		  	1.Add item
		  	2.Remove item
		  	3.Show Available item
		  	0.exit
			""";
	print(name);
	option = int(input("Enter a option:"))
	match(option):
		case 1:
			userInput = input("1.Add item:"); 
			add_my_item(userInput);
			break;

		case 2:
			userInput = input("2.Remove item:"); 
			remove_my_item(userInput);
			break;

		case 3:
			to_show_item();
			break;
		case 0:
			while False:
				print("bye bye");
			break;
			 
			
		
