package solutions;

import util.MathUtils;
import java.math.BigInteger;

/**
 * This class solves problem 20 in the Euler challenge.
 * @author vivsrini
 */
public class Problem20
{

    public static void main(String[] args)
    {
        long start = System.nanoTime();
        BigInteger factorial = MathUtils.computeFactorial(100);
        String temp = factorial.toString();
        int sum = 0;
        for(int i = 0; i < temp.length(); i++)
        {
            int digit = (int) (temp.charAt(i) - '0');
            sum = sum + digit;
        }
        System.out.println("The sum of the digits of 100! is: " + Integer.toString(sum));
        Long stop = System.nanoTime();
        System.out.println("Execution time: " + ((stop - start) / 1e+6) + " ms");
    }   
}
