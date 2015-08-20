The three Euler problems that I choose for the Adobe's Programming Test are Problem #2, Problem #20 and Problem #22. I spent about 2 hours on this exercise. The only reference used was the Javadocs.

Problem #2
===================================
Question:
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

Algorithm :
1. Calculate the next number in the Fibonacci sequence.
2. Check if the next number in the sequence is less than 4M and if it is an even number.
3. If next number in the sequence is even then add to the sum.

Output:
Sum of the even terms in the Fibonacci sequence whose value is less than 4M is : 4613732
Execution time: 58.922133 ms


Problem #20
===================================
Question:
n! means n × (n − 1) × ... × 3 × 2 × 1
For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
Find the sum of the digits in the number 100!

Algorithm:
1. Compute the factorial of 100. Note: BigInteger is used here to store the result of the factorial.
2. Split the digits of the result from (1) .
3. Add each digit to get the desired output.

Output:
The sum of the digits of 100! is: 648
Execution time: 9.330029 ms


Problem #22
========================================
Question:
Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
What is the total of all the name scores in the file?

Algorithm:
1. Read all the names from the given input files stripping the commas and quotes.
2. Store it in an array
3. Sort the array alphabetically.
4. Compute the worth of each name and multiply it with the rank(position) of the name in the array to yield the desired output.

Output:
The total of all the names scores in the given input file is: 871198282
Execution time: 59.489094 ms


How to run the program?
===================================
1. Download the Euler.jar from the dist directory on Github.
2. Make sure you installed JDK8.
3. To run , execute the following 
java -cp D:\dist\Euler.jar solutions.Problem2
java -cp D:\dist\Euler.jar solutions.Problem20
java -cp D:\dist\Euler.jar solutions.Problem22
