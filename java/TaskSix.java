public class TaskSix {

public static int largest(int [] array){
int largest = array[0];

for(int count = 1; count < array.length; count++){
if(array[count] > largest){
largest = array[count];
}
}
return largest;
}

public static void main(String [] args){
int [] array = {1, 2, 3, 4, 5, 6, 7};
System.out.println(largest(array));
}
}



