public class TaskFourteen {

public static int findFactorial(int number){
int factorial = 1;
for(int count = 1; count <=number; count++){

factorial *= count;
}
return factorial;
}



public static void main(String [] args){
int number = 5;
System.out.println(findFactorial(number));
}
}