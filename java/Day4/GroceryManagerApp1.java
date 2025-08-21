import java.util.Scanner;
import java.util.ArrayList;

public class GroceryManagerApp1{
public static ArrayList<String> itemList = new ArrayList<>();
public static void main(String[] args){
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
		String userInput = input.next();
		GroceryManagerApp1.addMyItem(userInput);
		break;
	case 2: System.out.println("2.remove item:");
		String userInput2 = input.next();
		GroceryManagerApp1.removeMyItem(userInput2);
		break;
	case 3: System.out.println("3.Show Available item:");
		GroceryManagerApp1.showItem();
	case 0:
	hunterly = false;
	System.out.print("bye bye");
	break;
		


}
}
}



public static String addMyItem(String addItem){
		itemList.add(addItem);
		System.out.println(itemList);
return "boo";
}
public static String removeMyItem(String removeItem){
		itemList.remove(removeItem);
		System.out.println(itemList);
return "boo";
}
public static void showItem(){
for(int count = 0; count < itemList.size(); count++){
System.out.println(itemList.get(count));

}
}
}

