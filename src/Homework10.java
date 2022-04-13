package Class18;

import java.util.*;

public class Homework10 {
    public static void main(String[] args) {

        // Due Date -> Apr 12
        /**
         * Question-1:
         * Create a method that can return if a given-String-Array has duplicate values or not.
         *
         * Input: String-Array
         * Return type: boolean
         *
         *
         *
         * create String-List using given-String-Array
         * create a String-Set using String-List
         * compare size of Set and List
         */


String[] words= { "peace",  "grow", "joy", "lauGh", "happy", "laugh","joy","happy"};





    // First convert to String to List
       List<String> names = new ArrayList<String>(Arrays.asList(words));
          System.out.println(names.size());
        // Now List convert to Set
       Set<String> setNames = new HashSet<>(names);

        int  arrayLength = words.length; // Array Length
        int setNamesSize = setNames.size(); // Set Length
         // Now compare both length
        if (arrayLength >= setNamesSize){
            System.out.println("Duplicate values present in given Array" );

        }else {
            System.out.println("No duplicate values present in given Array");

        }





        /**
         * Question-2:
         * Create a method that would return the duplicate values of given-String-array (ignore the case)
         *
         * Input: String-Array
         * Return type:     (one of these -> Array, List, Set)
         *
         *
         * String[] names = {"abc" , "abc" , "DEF", "ABC", XYZ", "def"}
         *
         * "abc", "def"
         */







        System.out.println(duplicateValue(words));





    }

    // # 1
    public static boolean duplicateOrNot (String[] givenArray ){
        List<String> names = new ArrayList<String>(Arrays.asList(givenArray));
        // Now List convert to Set
        Set<String> setNames = new HashSet<>(names);

        int  arrayLength = givenArray.length; // Array Length
        int setNamesSize = setNames.size(); // Set Length
        // Now compare both length
        if (arrayLength >= setNamesSize){
            System.out.println(" Duplicate values present in given Array" );

        }else {
            System.out.println(" No duplicate values present in given Array");

        }

        return true ;
    }




    //#2

public static boolean duplicateValue(String[] givenArray){
    Set<String> setNames = new HashSet<>();

    for (String names : givenArray){
        if (setNames.add(names)==false){

                        System.out.println("duplicate -> "+names);
        }
    }
    return true;

  


}









}
