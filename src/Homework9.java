package Class17;

import java.util.ArrayList;
import java.util.List;

public class Homework9 {

    // Due date: Sunday (Apr 10)

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Happy");         //  ["Happy"]
        names.add("GroW");          //  ["Happy", "GroW"]
        names.add("LeaRN");         //  ["Happy", "GroW", "LeaRN"]
        names.add("PeaCEfUL");      //  ["Happy", "GroW", "LeaRN", "PeaCEfUL"]
        names.add("Learning");      //  ["Happy", "GroW", "LeaRN", "PeaCEfUL", "Learning"]
        names.add("HAPPy");
        names.add("Growing");
        names.add("ListeN");
        names.add("PEACE");
        names.add("King KONG");
        names.add("happiness");
        names.add("greeN");
        names.add("SkiLLS");
        names.add("PRICELeSs");
        names.add("Health");
        names.add("NEW");
        names.add("LAUgh");
        names.add("QUeeN");
        names.add("YouNG");
        names.add("OLD");
        names.add("HAPPy");
        names.add("Growing");
        names.add("ListeN");
        names.add("PEACE");
        names.add("King KONG");
        names.add("happiness");
        names.add("greeN");
        names.add("SkiLLS");
        names.add("PRICELeSs");
        names.add("Health");
        names.add("NEW");
        names.add("LAUgh");
        names.add("King KONG");
        names.add("happiness");
        names.add("greeN");
        names.add("SkiLLS");
        names.add("PRICELeSs");
        names.add("Health");
        names.add("NEW");
        names.add("LAUgh");


        System.out.println(names.size());


        int lastIndexOf_HAPPY_IgnoringCases = 0;
        int namesLength = names.size() ;

        for (int i = 0; i >= namesLength;  i++) {
            String value = names.get(i);
            System.out.println(value);
            if (value.equalsIgnoreCase("HAPPY")) {
                lastIndexOf_HAPPY_IgnoringCases = i;

            }
        }
        System.out.println("Last index of 'HAPPY' (ignoring cases) -> " + lastIndexOf_HAPPY_IgnoringCases);






        // getCount("HAppY", names); should return 3
        // getCount("JAVA", names); should return 0



        // getContainsCount("HAp", names);  should returns 6
        // getContainsCount("A", names);  should returns 17


        System.out.println("new count -> "+ getCount( "new", names));




    }

    /**
     * Q1:
     *  Create method that will count (and return) the number of times a given String (ignoring the case) is present in given ArrayList
     *  name : getCount
     *  inputs : 2 (String, ArrayList<String>)
     *  return type : int
     */
    // public static int getCount(String valToCheck, ArrayList<String> arrayList) {
    //     // code
    // }

   // public static int getCount(String valToCheck, ArrayList<String> arrayList) {

      //   }

    public static int getCount(String valToCheck, ArrayList<String> arraylist) {
        int count = 0;
        for(int i = 0; i < arraylist.size(); i++)   {
        if(valToCheck.toLowerCase().equals(arraylist.get(i).toLowerCase()))
            {
                count++;
            }
        }
        return count;
    }





    /**
     * Q2:
     *  Create method that will return the number of ArrayList-values contains the given String (ignoring the case)
     *  name : getCount
     *  inputs : 2 (String, ArrayList<String>)
     *  return type : int
     */
    // public static int getContainsCount(String valToCheck, ArrayList<String> arrayList) {
    // // code
    // }

    /**
     * Q3:
     * Create a method to return an int-array after removing input-int-value from an input-int-array
     *
     * -> How to create List using Array and vice-versa
     *
     * create a List using values of input-int-array
     * remove the input-int-value from List
     * create an int-array using List-values
     * return int-array
     *
     */


    public static int[] removeIntValue(int[] myArray, Integer value) {

        List<Integer> myList = new ArrayList<>();
        for (int num:myArray) myList.add(num);
        myList.remove(new Integer(value ));
        int[] primitive = myList.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return primitive;
    }












}
