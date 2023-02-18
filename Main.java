/*SHUBH SUDAN
21070126089
AIML B1*/

//IMPORTING LIBRARIES
import java.util.Scanner;
import java.io.*;
public class Main {

    static double[] numbers;
    static double[] result;
    //MAIN FUNCTION USING INPUT STRING WITH A SPECIFIC SPACE.
    public static void main(String[] args) {
        //MAIN FUNCTION CAN BE CALLED AS THE FATHER OF ALL FUNCTIONS AS IT HAS ALL THEIR OPERATIONS EMBEDDED IN IT
        //HENCE ALL DIFFERENT CLASSES'S FUNCTION HAS BEEN EMBEDDED TO ACCESS THEIR CODE
        //THATS WHY WE USE PUBLIC CLASS
        UserInput input = new UserInput();
        Calculator calculator = new Calculator();
        //SCANNING AND TAKING INPUT FROM SYSTEM
        Scanner scan = new Scanner(System.in);


        //WHAT OPERATION DOES USER WISH TO PERFORM??
        System.out.println("Enter Operator for Operaton: ");
        System.out.println("+ for Addition");
        System.out.println("- for Subtraction");
        System.out.println("* for multiplication ");
        System.out.println("/ for division ");
        System.out.println("! for array operations");

        //OPERATOR WHICH USER WILL PUT WILL BE SCANNED AND CARRIED FORWARD TO RESPECTIVE CLASS AHEAD 
        //IT READS INPUT CHARACTER AS 0
        char operator = scan.next().charAt(0);


        //USING SWITCH CASE FOR EASIER OPERATIONALITY
        switch (operator) {
            case '+':

                numbers = input.inputTwonumbers();
                result = calculator.performAdditionoperation(numbers);
                System.out.println("Sum is: " + result[0]);
                break;

            case '-':
                numbers = input.inputTwonumbers();
                result = calculator.performSubtractionoperation(numbers);
                System.out.println("Subraction is: " + result[0]);
            break;

            case '*':
            numbers = input.inputTwonumbers();
            result = calculator.performMultiplicationoperation(numbers);
            System.out.println("Product of two numbers  is: " + result[0]);
            break;

            case '/':
            numbers = input.inputTwonumbers();
            result = calculator.performDivisionoperation(numbers);
            System.out.println("Division of the two numbers is: " + result[0]);
            break;

            case'!':
            try{
            numbers=input.inputMultiplenumbers();
            result=calculator.performArrayoperation(numbers);
            }
            //IOException is the base class for exceptions 
            //thrown while accessing information using streams, files and directories.
            //e over here can be the name of any variable.
            catch(IOException e)
            {        
            // REASON OF USING IT WAS SIMPLY BECAUSE WE USED BUFFER READER
                System.out.println("Array is empty");
            }
            System.out.println("Addition of array elements is: "+result[0]);
            System.out.println("Subtraction of array elements is "+result[1]);
            System.out.println("Multiplication of array elements is "+result[2]);
            System.out.println("Division of array elements is "+result[3]);
            System.out.println("Mean of array elements is  "+result[4]);
            System.out.println("Variance of array elements is "+result[5]);
            System.out.println("Standard Deviation of array elements is "+result[6]);





        }

    }
}
