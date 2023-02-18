/*SHUBH SUDAN
21070126089 AIML B1*/

//importing librarieS
import java.math.*;
//our class name should be same as the file name
public class Calculator {
    double[] result =new double[1]; 
   //DECLARING ARRAYS WHICH WILL CONTAIN 2 ELEMENTS
    double[] result_array=new double[7]; 
    //RESULTANT ARRAY

    //CALCULATOR FILE BASICALLY CONTAINS THE ARRAY OPERATIONS SUCH AS
    // ADDITION/SUBTRACTION/MULTIPLICATION/DIVISION/VARIANCE AND STANDARD DEVIATION
    public double[]  performAdditionoperation(double[] numbers)
    //numers[0] and [1] are my array elements on which operation has to be performed
    {   
        result[0]=numbers[0]+numbers[1];
        
       
       return result; 
        // result is an array form beacuse the addition of array elements in this case the numbers can only be saved in an array
    }
    public double[] performSubtractionoperation(double[] numbers)
    {   
        result[0]=numbers[0]-numbers[1];
        
       
        
        return result;
    }
    public double[] performMultiplicationoperation(double [] numbers )
    {   
        result[0]=numbers[0]*numbers[1];
        
       
        
        return result;

    }
    public double[] performDivisionoperation(double [] numbers){
        
            result[0]=numbers[0]/numbers[1];
            
           

    
    
    return result;
    }
    public double[] performArrayoperation(double []numbers){
        int size=numbers.length;
        result_array[0]=0;
         // initialized to 0 for addition operations
        result_array[2]=1;
         // initialized to 1 for multiplication operations

        //BASIC FOR FORMATION OR ARRAY-TRAVERSING AND ASSIGNING ELEMENT TO A SPECIFIC POSITION
        for (int i=0;i<size;i++)
        { result_array[0]=result_array[0]+numbers[i];
          result_array[2]=result_array[2]*numbers[i];

        };
        result_array[1]=numbers[0];
         //RESULT[0]=ADDITION,1=SUBTRACTION,2=MULTIPLICATION,3=DIVISION,4=MEAN,5=VARIANCE,6=STANDARD DEVIATION
        result_array[3]=numbers[0];
         
        for (int i=1;i<size;i++)
        {
            result_array[1]=result_array[1]-numbers[i];
            result_array[3]=result_array[3]/numbers[i];


        };
        result_array[4]=result_array[0]/size;
        double sqdiff=0;
        for (int i=0;i<size;i++)
        {
            
            sqdiff=sqdiff+((numbers[i]-result_array[4])*(numbers[i]-result_array[4]));
            // summation of square of differences from mean

        };
        //FOR CALCULATING VARIANCE 
        result_array[5]=sqdiff/size; 
        //FOR CALCULATING STANDARD DEVIATION
        result_array[6]=Math.sqrt(result_array[5]); 

        return result_array;
        

        
             
    }
    
}