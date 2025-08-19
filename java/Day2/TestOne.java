import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestOne{

@Test

public void testTocheckIfTwoAgeAreInteger(){

int fathersAge = 30;
int multiply = 30 * 2;
int twiceFather  = fathersAge - multiply;

TaskOne taskOne = new TaskOne();
int result = taskOne.calculateTwiceFathersAge(fathersAge, sonAge);
assertEqual(result, twiceFather);

}
}