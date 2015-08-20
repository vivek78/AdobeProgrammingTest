package solutions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class solves problem 22 in the Euler challenge.
 * @author vivsrini
 */
public class Problem22
{
    public static void main(String[] args)
    {
        long start = System.nanoTime(); 
        BufferedReader br =null;
        try
        {
            //Read the data from the input file
            br = new BufferedReader(new InputStreamReader(ClassLoader.getSystemClassLoader().getResourceAsStream("input/p022_names.txt")));
            String line = null;
            String[] names = null;
            while ((line = br.readLine()) != null)
            {
                names = line.replace("\"","").split(",");
            }
            
            //Sort the names
            Arrays.sort(names);
            
            //Compute the name scores
            int sum = 0;
            for (int i = 0; i < names.length; i++)
            {
                int value = 0;
                for (int j = 0; j < names[i].length(); j++)
                    value += names[i].charAt(j) - 'A' + 1;
                sum += value * (i + 1);
            }
            System.out.println("The total of all the names scores in the given input file is: " +Integer.toString(sum));    
            
            Long stop = System.nanoTime();
            System.out.println("Execution time: " + ((stop - start) / 1e+6) + " ms");
        }
        catch (FileNotFoundException fne)
        {
            Logger.getLogger(Problem22.class.getName()).log(Level.SEVERE, "File p022_names.txt does not exist.", fne);
        }
        catch (IOException ioe)
        {
            Logger.getLogger(Problem22.class.getName()).log(Level.SEVERE, null, ioe);
        }
        finally {
            try
            {
                br.close();
            }
            catch (IOException ioe)
            {
                Logger.getLogger(Problem22.class.getName()).log(Level.SEVERE, null, ioe);
            }
        }
    }      
}
