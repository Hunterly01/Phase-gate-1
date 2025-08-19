public class difference2{
public static void main(String [] args){

double currentWorldPopulation = 8000_000_000.0;
double growthRate = 1.05/100;

double population = currentWorldPopulation;
double targetPopulation = currentWorldPopulation * 2;
int yearOfDoubling = 0;
System.out.println("year\tPopulation\tIncrease");

for(int year = 1; year <= 75; year++){
double increase = population * growthRate;
population += increase;
System.out.println(year + "\t" + population + "\t" + increase);
if(yearOfDoubling == 0 && population >= targetPopulation) {
yearOfDoubling = year;
}
}

System.out.println("The population will double in " + yearOfDoubling + "years");

}
}