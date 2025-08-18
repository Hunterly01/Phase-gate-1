import java.util.Scanner;

public class TaskTwo{

public static void main (String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer:");
int numberOne = input.nextInt();

System.out.print("Enter second integer:");
int numberTwo = input.nextInt();

System.out.print("Enter third integer:");
int numberThree = input.nextInt();

int sum = numberOne + numberTwo + numberThree;
int average = sum / 3;
int product = numberOne * numberTwo * numberThree;
int largest = numberOne;
int smallest = numberOne;



if(numberOne > largest){
largest = numberOne;
}
 else if(numberTwo > largest){
largest = numberTwo;
} else if(numberThree > largest){
largest = numberThree;
}

if(numberOne < smallest){
smallest = numberOne;
}
 else if(numberTwo < smallest){
smallest = numberTwo;
} else if(numberThree < smallest){
smallest = numberThree;	
}


System.out.println("sum of three integer " + sum);
System.out.println("Average of three integer " + average);
System.out.println("product of three integer " + product);
System.out.println("largest " + largest);
System.out.println("smallest " + smallest);

}
}