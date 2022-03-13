package Homework4;

import java.util.Locale;

public class Homework4 {
    public static void main(String[] args) {

        System.out.println("\nTask1 -> length and value of New York:");
        String sentence1 = "New York";
    int len1 = sentence1.length();
    int result1 = len1 >= 5 ? 10 :  15;
        System.out.println("\nlength of New York = " +len1 + " ,Value of New York = " + result1);

        System.out.println("\nTask2 -> My name's length, ends with 'a' and contains 'a':");

        String name = "Mohammed Zaidur Rahman";
        int len2 = name.length();
        System.out.println("\nLength of my name = " + len2);
         name = name.toLowerCase();
        System.out.println("my name = " +name);
        boolean aInMyName = name.contains("a");
        System.out.println("Is 'a' in my name? = " +aInMyName);
        boolean  isMyNameEndsWithA = name.endsWith("a");
        System.out.println("Is my name ends with 'a'? = " +isMyNameEndsWithA);

        System.out.println("\nTask3 -> value contains 'king' and index of first occurrence of 'EW':");

        String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
        String task4= task3.toLowerCase();
       int  valueOfKing = task4.indexOf("king");
        System.out.println("Value of king = " + valueOfKing );
        String task5 = task3.toUpperCase();
        int firstIndexOfEW = task5.indexOf("EW");
        System.out.println("First index of 'EW'  = "+ firstIndexOfEW );

        System.out.println("\nTask4 -> Convert the value in variable into Titlecase:");

        String task6 = "KING";
        String task7 = task6.toLowerCase();
        String nameAfterReplace = task7.replace("k", "K");
        System.out.println("KING -> " +nameAfterReplace);























    }
}




