import java.util.Scanner;
import java.util.ArrayList;
public class GroceryManagerApp{
public static void main(String[] args){
ArrayList<String> itemList = new ArrayList<>();
Scanner input = new Scanner(System.in);
boolean hunterly = true;
while(hunterly){
String name = """ 
		WELCOME TO YOUR GROCERY STORE
		   
		  
		  1.Add item
		  2.Remove item
		  3.Show Available item
		  0.exit
		""";
System.out.println(name);
int option = input.nextInt();
switch(option){
	case 1: System.out.println("1.Add item:");
		String addItem = input.next();
		itemList.add(addItem);
		System.out.println(itemList);
		break;


	case 2: System.out.println("1.remove item:");
		String removeItem = input.next();
		itemList.remove(removeItem);
		System.out.println(itemList);
		break;

	case 3: System.out.println("1.Show Available item:");
			for(int count = 0; count < itemList.size(); count++){
				System.out.println(itemList.get(count));
			}			
		break;
	case 0:
	hunterly = false;
	System.out.print("bye bye");
	break;
		
	default: System.out.println("Invalid option."); break;
		

}	
}
}
}