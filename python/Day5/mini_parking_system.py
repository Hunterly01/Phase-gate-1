#1.create a an empty parking lots(list) 
#2.create a function to pack car;
#3.collect an input 
#4.store the input inside the parking lot
#5.return "car packed successfully"
#6.create a function to remove car packed
#7.remove an input in the parking lots  
#8.return "car has been removed successfully"
#9.create a function to show car park status
#10.if car pack is empty return "car pack is empty" else return the list of car in the parking lots


car_pack = [0] * 20;

def pack_my_car(park_car):
	car_pack .append(park_car);
	return f"'{park_car}' car packed successfully.";

def remove_my_car_from_car_pack(remove_car):
	car_pack.remove(remove_car);
	return f"'{remove_car}' has been removed successfully.";

def to_show_car_park_status():
	if not car_pack:
		return "car pack is empty";
	else:
		for car in car_pack:
			return car_pack;

def main():
	while(True):
		name = """ 
				WELCOME TO HUNTER CAR PACK
		   
		  
		  		1.Pack car
		  		2.Remove car packed
		  		3.Show Available space in the car pack
		  		0.exit
				""";
		print(name);
		option = int(input("Enter a option:"));
		match(option):
			case 1:
				userInput = input("1.Pack car:"); 
				print(pack_my_car(userInput));
			

			case 2:
				userInput = input("2.Remove car packed:"); 
				print(remove_my_car_from_car_pack(userInput));
			

			case 3:
				print(to_show_car_park_status());
			
			case 0:
				while False:
					print("Thank you for using our Packing space");
				break;
			case _:
				print(" Invalid option. Please try");

if __name__ == "__main__":
    main()