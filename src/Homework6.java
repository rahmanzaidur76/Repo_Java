import java.util.Locale;

public class Homework6 {
    public static void main(String[] args) {

        System.out.println("Create the abbreviation");

        String name = "make America great again";
        String[] words = name.split(" ");

        for (int x=0 ; x <= words.length - 1 ; x++) {
            String words1 = words[x].substring(0,1).toUpperCase()+words[x].substring(1).toLowerCase() ;
            System.out.println(words1);
        }




     for ( int x = 0 ; x <= words.length - 1 ; x++){
         String words1 = words[x].substring(0,1).toUpperCase();
         System.out.println(words1);


     }



        for (int y=0 ; y <= words.length - 1 ; y++) {
            int  lastindex = words.length-1;

            System.out.println(words[lastindex- y]);
        }




    }
}
