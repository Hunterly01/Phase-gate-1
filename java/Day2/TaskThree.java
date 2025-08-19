import java.util.Arrays;
pubic class TaskThree {

public static String [] returnDisplay(String [] array){
let count = array.length();

if(count == 0){
	return "no one like this";
} else if(count === 1){
	return array[0] + "," + "like this";
} else if(count === 2){
	return array[0] + "," +array[1] + "," "like this`;
}else if(count === 3){
	return {array[0] + "," + {array[1]} + "," + "and " + array[2] + ", " + "like this`;
}else if(count > 3){
	return array[0] + "," + array[1] + "," + "and" + (array.length - 2) + "others like this`;
}
}



public static void main (String [] args){
array = {"peter", "Paul", "Mark", "Max"};
System.out.print(returnDisplay(array))
}
}