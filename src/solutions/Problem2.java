package solutions;

import util.MathUtils;

/**
 * This class solves Problem 2 in the Euler challenge.
 * @author vivsrini
 */
public class Problem2
{
    public static void main(String[] args) 
    {
        long start = System.nanoTime();   
	int evenSum = 0;
	for (int i = 1; ; i++) 
        {
            int fibonacci = MathUtils.computeFibonacci(i);
            if (fibonacci > 4000000)
                break;
            if (fibonacci % 2 == 0)
                evenSum += fibonacci;
	}
        System.out.println("Sum of the even terms in the Fibonacci sequence "
                + "whose value is less than 4M is : " + Integer.toString(evenSum));
        Long stop = System.nanoTime();
        System.out.println("Execution time: " + ((stop - start) / 1e+6) + " ms");
    }     
}
