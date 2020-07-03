
import java.util.Scanner;

public class DescendingOrder {
   // TODO: Write a void method selectionSortDescendTrace() that takes 
   //       an integer array and the number of elements in the array as arguments, 
   //       and sorts the array into descending order.
   public static void selectionSortDescendTrace(int [] numbers, int numElements) {
      for(int i = 0; i < numbers.length-1; i++) {
         
         int currentMax = numbers[i];
         int index=i;
         for(int j = i + 1; j < numbers.length; j++){
            if (numbers[j] > currentMax) {
               currentMax = numbers[j];
               index = j;
            } //end if
         } //end for
         
         int temp = numbers[i];
         numbers[i] = numbers[index];
         numbers[index] = temp;
            
         for (int Index = 0; Index < numbers.length; Index++) {
            if (numbers[Index] != 0) {
               System.out.print(numbers[Index]);
               if (Index < numbers.length - 1) {
                  System.out.print(" ");
               }
            }
         }
         System.out.println(" ");
      } // End outer for
   } // End class

   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int input, i = 0;
      int numElements = 0;
      int [] number = new int[10];

      // TODO: Read in a list of up to 10 positive integers; stop when
      //       -1 is read. Then call selectionSortDescendTrace() method.
      do {
         input = scnr.nextInt();
         if(input!=-1){
            number[i] = input;
            i++;
            numElements++;
         }
      }while(input!=-1);
      
      int [] numbers = new int[numElements];
      for (i = 0; i < numElements; i++){
         numbers[i] = number[i];
      }
      
      selectionSortDescendTrace(numbers, numElements);
      

   }
}

