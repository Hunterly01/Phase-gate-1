public class TaskEight {

public static int sum(int [] array){
int sum = 0;
for(int count = 0; count < array.length; count++){
sum += array[count];
}
return sum;
}


public static void main(String [] args){
int [] array = {1, 2, 3, 4, 5, 6, 7};
System.out.println(sum(array));
}
}