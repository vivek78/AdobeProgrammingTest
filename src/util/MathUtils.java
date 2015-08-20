package util;

import java.math.BigInteger;

/**
 * MathUtils is an utility class containing implementations of some 
 * common mathematical formulas. 
 * @author vivsrini
 */
public final class MathUtils
{

    /**
     * Calculates the factorial of a given number. 
     * @param number The factorial of the number to be computed.
     * @return The factorial of the given number.
     * @throws IllegalArgumentException for negative numbers.
     */
    public static BigInteger computeFactorial(int number)
    {
        if (number < 0)
            throw new IllegalArgumentException("Factorial of negative number is not valid.");
        
        if(number==0 || number==1)
            return BigInteger.ONE;
        else
            return computeFactorial(number-1).multiply(BigInteger.valueOf(number));
    } 
    
    /**
     * Calculates the next number in the fibonacci sequence.
     * @param number Sequence number in the series.
     * @return The next number in the fibonacci sequence.
     * @throws IllegalArgumentException for non-positive number and zero since the fibonacci 
     * sequence in the problem statement starts with a positive integer '1'.
     */
    public static int computeFibonacci(int number)
    {
       if(number <= 0)
           throw new IllegalArgumentException("Fibonacci of negative number is not valid.");
            
        if(number == 1 || number == 2)
        {
            return 1;
        }
        return computeFibonacci(number-1) + computeFibonacci(number -2);        
    }
}