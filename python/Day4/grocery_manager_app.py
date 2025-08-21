new_array = [];
def add_my_item(add_item):
	new_array.append(add_item);
	return f"'{add_item}' has been added to your grocery list.";

def remove_my_item(remove_item):
	new_array.remove(remove_item);
	return f"'{remove_item}' has been removed from your grocery list.";

def to_show_item():
	if not new_array:
		return "your grocery List is empty";
	else:
		for item in new_array:
			return new_array;


def main():
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
				print(add_my_item(userInput));
			

			case 2:
				userInput = input("2.Remove item:"); 
				print(remove_my_item(userInput));
			

			case 3:
				print(to_show_item());
			
			case 0:
				while False:
					print("bye bye");
				break;
			case _:
				print(" Invalid option. Please try");
			 
			
if __name__ == "__main__":
    main()
