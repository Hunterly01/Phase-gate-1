public class TaskThirteen {

public static int SecondLargest(int [] array){
int secondLargest = 0;
int largest = 0;

for(int count = 0; count < array.length; count++){
if(array[count] > largest){
secondLargest = largest;
largest = array[count];
}
if(secondLargest > largest && array[count] != largest){
secondLargest = array[count];
}
}
return secondLargest;

}

public static void main(String [] args){
int [] array = {1, 2, 3, 4, 5, 6, 7};
System.out.println(SecondLargest(array));
}
}
