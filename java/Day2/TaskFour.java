public class TaskFour{
public static boolean getPump(int gallon, int miles){
int  milesNew = miles + miles;

if(milesNew == gallon){
	return true;
} else {
	return false;
}
}

public static void main(String[] args){
System.out.print(getPump(30, 20));
}
}