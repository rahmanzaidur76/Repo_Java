package Class19;

import java.util.ArrayList;

public class Homework11 {
    /**
     *
     * Due Date: April-16 2022
     *
     * Question-1:
     * Create a HashMap with
     *      Integer as key and
     *      String as value
     *
     *  { (101 = "HAppy") , (102 = "King") , (103 = "HAPPY") , (104 = "live") , (105 = "Happy"), (106 = "Live") }
     *
     *  Create a method that will the HashMap<Integer, String> as Input
     *  print the keys with common values (ignoring cases)
     *
     *      "Happy" is present with keys = 101, 103, 105
     *      "Live" is present with keys = 104, 106
     *
     *  { (101 = "HAppy") , (102 = "King") , (103 = "HAPPiness") , (104 = "life") , (105 = "king and queen"), (106 = "Live") }
     *  When no keys are having common values, method should print,
     *      "No keys have common values"
     *
     *
     */

    /**
     * Question-2:
     * <p>
     * String[] colorNames = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
     * "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
     * "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
     * "green", "green"};
     * <p>
     * <p>
     * Create a method that will return the name(s) of color appearing max number of times in the array.
     * <p>
     * green - 7
     * blue - 5
     * red - 10
     * yellow - 8
     * grey - 6
     * <p>
     * method will return "red"
     * <p>
     * <p>
     * green - 7
     * blue - 10
     * red - 10
     * yellow - 8
     * grey - 6
     * <p>
     * method will return "red", "blue"
     */


    public static void main(String[] args) {

        String[] colorNames = {"green", "blue", "red", "green", "grey", "yellow", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "yellow", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};


        System.out.println(colorCount(colorNames));


    }
// Question-2:
    public static ArrayList<String> colorCount(String[] colorNames) {

        int countGreen = 0;
        int countBlue = 0;
        int countRed = 0;
        int countYellow = 0;
        int countGrey = 0;
        ArrayList<String> array = new ArrayList<>();

        for (int i = 0; i < colorNames.length; i++) {
            if (colorNames[i].equalsIgnoreCase("green")) {
                countGreen++;
            } else if (colorNames[i].equalsIgnoreCase("blue")) {
                countBlue++;
            } else if (colorNames[i].equalsIgnoreCase("red")) {
                countRed++;
            } else if (colorNames[i].equalsIgnoreCase("yellow")) {
                countYellow++;
            } else if (colorNames[i].equalsIgnoreCase("grey")) {
                countGrey++;
            }

        }


        System.out.println("Green " + countGreen);
        System.out.println("Blue " + countBlue);
        System.out.println("Red " + countRed);
        System.out.println("Yellow " + countYellow);
        System.out.println("Grey " + countGrey);


        if (countGreen >= countBlue && countGreen >= countRed && countGreen >= countYellow && countGreen >= countGrey) {
            array.add("green");
        }
        if (countBlue >= countGreen && countBlue >= countRed && countBlue >= countYellow && countBlue >= countGrey) {
            array.add("blue");
        }
        if (countRed >= countGreen && countRed >= countBlue && countRed >= countYellow && countRed >= countGrey) {
            array.add("red");
        }
        if (countYellow >= countGreen && countYellow >= countBlue && countYellow >= countRed && countYellow >= countGrey) {
            array.add("yellow");
        }
        if (countGrey >= countGreen && countGrey >= countBlue && countGrey >= countYellow && countGrey >= countRed) {
            array.add("grey");
        }
        return array;
    }


}
