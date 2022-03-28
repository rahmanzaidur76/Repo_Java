public class Homework7 {
    /**
     * Q1:
     * Create a method to make abbreviation for a given sentence
     * Method should return
     *
     * Questions to answer before creating a method:
     *  1. what is the purpose of the method?   -   makeAbbreviation
     *  2. do I need any input from user?   -   1 (String)
     *  3. should we return any value in the end of method? - Yes
     *      If yes, then what is the datatype of returned value? - String
     *
     * make America great again -> MAGA
     * outfit of the day -> OOTD
     * happy birthday to you -> HBTY
     * Good morning -> GM
     * Happy new Year -> HNY
     * Happy birthday to you dear -> HBTYD
     * happy new year to you dear -> HNYTYD
     *
     * public static String makeAbbreviation(String inputStr) {
     *      // code
     * }
     */


    public static String makeAbbreviation (String name){
        String[] name1Split = name.split(" ");
        String abbre = "";

        for (int x = 0; x <= name1Split.length-1; x++ ) {
            String words2 = name1Split[x].substring(0,1).toUpperCase();
            abbre  +=  words2;
        }
        System.out.println(abbre.length());
        abbre += abbre.trim();
        System.out.println(abbre);
        System.out.println(abbre.length());
        return abbre += abbre.trim();

    }


    /**
     * Q2:
     * Create a method that will change the given sentence in Titlecase
     * Method should return
     *
     * HappY nEW YEAR to YoU dEAr -> Happy New Year To You Dear
     * gooD morNING -> Good Morning
     * make AMERICA GreAT AgAIn -> Make America Great Again
     *
     */




    public static String makeTitleCase(String name ){
        String[] words = name.split(" ");
        String ans = "";
        for (int x = 0; x <= words.length-1; x++ ) {
         String words1 = words[x].substring(0,1).toUpperCase()+words[x].substring(1).toLowerCase() ;
         ans += words1 + " " ;
        }
       System.out.println( ans);
       return  ans += ans.trim();

    }



    /**
     * Q3:
     * Create method to find the maximum value from given int-array
     * Method should return
     *
     * int[] = {23, 54, 76, 12, 67, 90, 23}     ->  90
     *
     * int[] = {23, 54, 76, 12}     ->  76
     *
     * int[] = {-2, -9, -4, -7, -9, -55}     ->  -2
     *
     * Questions to answer before creating a method:
     *  1. what is the purpose of the method? - findMaxInArray
     *  2. do I need any input from user? - 1 (int[])
     *  3. should we return any value in the end of method? - yes
     *      If yes, then what is the datatype of returned value? - int
     *
     * int maxNum = inputArray[0]
     *
     * if (inputArray[1] > maxNum)
     *      maxNum = inputArray[1]
     * if (inputArray[2] > maxNum)
     *      maxNum = inputArray[2]
     */

    // public int findMaxInArray(int []) {}


    public static int findMaxInArray (int[] numbers)  {
        int max = numbers[0];
        for (int i = 0; i <= numbers.length; i++) {
        if (numbers[i] > max) ;
         max =  numbers[i];
        }
        return max;

    }



    /**
     * Q5:
     * Create a method to find the longest String in the given String-array
     * Method should return (String)
     *
     * ["happy", "Happy new year", "peaceful" , "king kong"]    ->    "Happy new year"
     *
     * Questions to answer before creating a method:
     *  1. what is the purpose of the method? - findMaxString
     *  2. do I need any input from user? - 1 (String[])
     *  3. should we return any value in the end of method? - yes
     *      If yes, then what is the datatype of returned value? - String
     */












/** * int maxNum = inputArray[0]
            *
     * if (inputArray[1] > maxNum)
            *      maxNum = inputArray[1]
            * if (inputArray[2] > maxNum)
            *      maxNum = inputArray[2]
            */





    public static void main(String[] args) {


        makeTitleCase("HappY nEW YEAR to YoU dEAr");


        makeAbbreviation("HappY nEW YEAR to YoU dEAr");









    }



}
