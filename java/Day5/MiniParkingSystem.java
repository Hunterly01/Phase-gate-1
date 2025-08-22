/*1.create a an empty parking lots(list) 
2.create a function to pack car;
3.collect an input 
4.store the input inside the parking lot
5.return "car packed successfully"
6.create a function to remove car packed
7.remove an input in the parking lots  
8.return "car has been removed successfully"
9.create a function to show car park status
10.if car pack is empty return "car pack is empty" else return the list of car in the parking lots*/

import java.util.Scanner;
public class MiniParkingSystem {
public static ArrayList<String> carList = new ArrayList<>();
public static void main(String [] args){
Scanner input = new Scanner(System.in);
boolean hunterly = true;
while(hunterly){
System.out.println(""" 
		
		   
		  
		  1.pack your car
		  2.Remove your car
		  3.Show Available car
		  0.exit
		""");
int option = input.nextInt();
switch(option){
	case 1: System.out.println("1.pack your car:");
		int userInput = input.nextInt();
		toCheck(userInput);
		System.out.print("Successfuly Added");
		break;
	
	case 2: System.out.println("1.Remove your car:");
		int userInput = input.nextInt();
		removeMyCar(userInput);
		System.out.print("Successfuly removed");
		break;
	
	case 3: System.out.println("3.Show the status of the car packed :");
		showCarStatus();
	case 0:
	hunterly = false;
	System.out.print("bye bye");
	break;
		


}
}
}



public static int toCheck(int car_pack){
		carList.add(car_pack);
		System.out.println(carList);
return "boo";
}
public static int removeMyCar(int removeItem){
		carList.remove(removeItem);
		System.out.println(carList);
return "boo";
}
public static void showCarStatus(){
for(int count = 0; count < carList.size(); count++){
System.out.println(carList.get(count));

}
}
}


