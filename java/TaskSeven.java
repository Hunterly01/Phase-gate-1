public class TaskSeven {

public static int smallest(int [] array){
int smallest = array[0];

for(int count = 1; count < array.length; count++){
if(array[count] < smallest){
smallest = array[count];
}
}
return smallest;
}

public static void main(String [] args){
int [] array = {1, 2, 3, 4, 5, 6, 7};
System.out.println(smallest(array));
}
}