/*SHUBH SUDAN 
21070126089
AIML B1*/

//IMPORTING LIBRARIES
//SCANNER LIBRARY INVOKES SCANNER CLASS WHICH SCANS EVERY ELEMENT FROM THE USER
import java.util.Scanner;
import java.io.*;
//CREATING PUBLIC CLASS BECAUSE IT WILL BE ACCESSIBLE BY CALCULATOR AND MAIN CLASS AS WELL!!
public class UserInput
{
    Scanner scan = new Scanner(System.in); 
    //BUFFERREADER IS USED TO READ TEXT FROM CHARACTER STREAMS FOR EFFICIENT READING OF CHARACTERS
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double[] numbers = new double[2];
    //CREATING ATTRIBUTED numbers[0] and numbers[1] which will read the input
    //WE USE DOUBLE[] AS IT STORES FRACTIONAL INDICES

    public double[] inputTwonumbers()
    {
        System.out.println("Enter First Number:");
        numbers[0] = scan.nextDouble();

        System.out.println("Enter Second Number:");
        numbers[1] = scan.nextDouble();

        return numbers;

    }
    //MEANING FRACTIONS ALSO ACCEPTED ,MULTIPLE NUMBERS ALSO ACCEPTED.
    //IO EXCEPTION IS LIKE WORKING LIKE AN IDE-IT DOES NOT BOTHER ON SMALL ERRORS.
    public double[] inputMultiplenumbers() throws IOException   
    { 
    //IOEXCEPTION IS BECAUSE WE USE BUFFER READER WHICH COULD ACCESS DIFFERENT DATATYPES SUCH AS STREAMS,ETC.
        System.out.println("Enter Size of Array");
        int size = scan.nextInt();

        double array[] = new double[size];
        String str = br.readLine();
        String[] array_numbers = str.trim().split("\\s+");
        for(int i=0;i<size;i++)
        {
            array[i] = Double.parseDouble(array_numbers[i]);
        }
        return array;
    }
}