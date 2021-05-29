import java.util.ArrayList;
/**
 * Thinking Outside the Box - Prime Number Finder
 * 4-26-2021
 * Ryan Wagner
 */
public class Tester
{
    //Main class to run the tester
    public static void main(String[] args){
        PrimeNumbers set = new PrimeNumbers(1, 200);
        set.findPrimeNumbers(set.getLowerLimit(), set.getUpperLimit());
    }
}
