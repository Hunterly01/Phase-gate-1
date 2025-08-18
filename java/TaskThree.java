import java.util.Scanner;

public class TaskThree{

public static void main (String [] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter an integer:");
int number = input.nextInt();



if(number % 3 == 0){
System.out.print("its divisible by three");
} else {
System.out.print("its not divisible by three");
}

}
}