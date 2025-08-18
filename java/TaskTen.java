
public class TaskTen {

public static int []  InMinimumMaximum(int [] array){
int largest= array[0];
int smallest = array[0];

for(int count = 1; count < array.length; count++){
if(array[count] > largest){
largest = array[count];
}
if(array[count] < smallest){
smallest = array[count];
}
}
return largest, smallest;
}

public static void main(String [] args){
int [] array = {1, 2, 3, 4, 5, 6, 7};
System.out.println(InMinimumMaximum(array));
}
}