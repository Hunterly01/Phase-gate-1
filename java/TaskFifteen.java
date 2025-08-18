public class TaskFifteen {

public static int findNaturalNumber(int number){
int sum = 0;
for(int count = 1; count <= number; count++){
sum += count;
}
return sum;
}

public static void main(String [] args){
int number = 100;
System.out.println(findNaturalNumber(number));
}
}
