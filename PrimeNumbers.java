import java.util.ArrayList;
/**
 * Thinking Outside the Box - Prime Number Finder
 * 4-26-2021
 * Ryan Wagner
 */
public class PrimeNumbers
{
    private int upperLimit;
    private int lowerLimit;
    
    //Class for the set of numbers to find prime numbers in
    public PrimeNumbers(int lowerLimit, int upperLimit)
    {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public int getLowerLimit(){
        return lowerLimit;
    }
    
    public int getUpperLimit(){
        return upperLimit;
    }
    //Method to find prime numbers
    public void findPrimeNumbers(int lower, int upper){
        ArrayList<Integer> set = new ArrayList<Integer>();
        for(int i = lower; i < upper + 1; i++){
            set.add(i);
        }
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        int count = 0;
        for(int i = 0; i < set.size(); i++){
            boolean prime = true;
            int newLower = set.get(i);
            for(double j = 2.0; j < Math.sqrt(newLower); j++){
                if(newLower % j == 0 || Math.sqrt(newLower) % 1.0 == 0){
                    prime = false;
                }
            }
            if(prime && newLower != 1 && newLower != 4){
                primeNumbers.add(newLower);
                count ++;
            }
        }
        System.out.println("Prime Numbers between " + lower + " and " + upper + "\n");
        for(Integer i: primeNumbers){
            System.out.println(i);
        }
        System.out.println("There are " + count + " prime numbers between " + lower + " and " + upper);
    }
}
