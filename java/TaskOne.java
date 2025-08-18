import java.util.Scanner;

public class TaskOne{

public static void main (String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter an integer:");
int numberOne = input.nextInt();

System.out.print("Enter an integer:");
int numberTwo = input.nextInt();


int squareNumberOne = numberOne * numberOne;
int squareNumberTwo = numberTwo * numberTwo;
int sum = squareNumberOne + squareNumberTwo;
int difference = squareNumberOne - squareNumberTwo;



System.out.println("square of first integer is " + squareNumberOne);
System.out.println("square of second integer is " + squareNumberTwo);
System.out.println("The sum of squared first and second integer is " + sum);
System.out.println("The difference squared of first and second integer is " + difference);



 }

}