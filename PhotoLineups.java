import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {

   // TODO: Write method to create and output all permutations of the list of names.
   public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
      if (nameList.isEmpty()) {
         // Print the current permutations.
         for (int i = 0; i < permList.size(); i++) {
            System.out.print(permList.get(i) + " ");
         }
         System.out.println();
      } else {
         for (int i = 0; i < nameList.size(); i++) {
            ArrayList<String> currPermList = new ArrayList<String>(permList);
            // Store current element of nameList
            currPermList.add(nameList.get(i));
            // Skip the current element of namelist and add rest elements to a new list
            ArrayList<String> newNameList = new ArrayList<String>(nameList);
            newNameList.remove(i);
            // Call function with the newNameList and currPermList
            allPermutations(currPermList, newNameList);
         }
      }
   } // End function
            
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> nameList = new ArrayList<String>();
      ArrayList<String> permList = new ArrayList<String>();
      String name ="";
      
      // TODO: Read in a list of names; stop when -1 is read. Then call recursive method.
      while (true) {
         name = scnr.next();
         if (name.equals("-1")) {
            break;
         } // end if
         nameList.add(name);
      } // end while
      allPermutations(permList, nameList);
   } // end main
} // end class