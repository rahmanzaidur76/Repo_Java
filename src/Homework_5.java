package Homework5;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("\n* Country name and length:");

        String country = "United States Of America ";
        System.out.println("\nCountry -> "+country );
        String country_LowerCase = country.toLowerCase();
        String[] country_Split = country_LowerCase.split(" ");
        int lenOfCountry = country_Split.length;
        System.out.println("\nLength Of Country Name - "+ lenOfCountry);

        System.out.println("\n* Print the number of words in the sentence-value :");
        String sentence = "Health was Earlier said to Be the ability of the body functioning WElL.";
        System.out.println(sentence);
        String sentence1 = sentence.toLowerCase();
        String[] sentence_split = sentence1.split(" ");
        int numberOfWords = sentence_split.length;
        System.out.println("\nnumber of words in the sentence-value -> " + numberOfWords);

        System.out.println("\n* Create the abbreviation for 4-word sentence:");

        String sentence3 = "Make America Great Again";

        System.out.println("Sentence ->"+sentence3);
        String[]  words = sentence3.split(" ");
        String words1 = words[0].toUpperCase().substring(0,1);
        String words2 = words[1].toUpperCase().substring(0,1);
        String words3 = words[2].toUpperCase().substring(0,1);
        String words4 = words[3].toUpperCase().substring(0,1);
        System.out.println("Make America Great Again -> "+ words1+words2 +words3+words4);
        /**String[] sentenceSplit = sentence3.split(" ");
        for ( int i = 0 ; i <= sentenceSplit.length-1; i++) {
        String words = sentenceSplit[i].toUpperCase().substring(0,1);
        System.out.println(i);}8*/




     //  System.out.println("\n* Create an int-variable and store any value in it");


        int  num =15;
        if (num%5==0){
            System.out.println(num+" = IS divisible by 5");
       }
       else if (num%3 == 0){
            System.out.println(num+" = IS divisible by 3");
        }
       else if (num%5==0
        && num%3==0){
            System.out.println(num + " = IS divisible by 5 and 3");
        }

        else if  (num%5!=0
        &&num%3!=0){
            System.out.println( num+ " = IS NOT divisible by 5 and 3");
        }




        //Q5
        int maximumScore = 160;
        double studentScore = 145;
        double  studentPercentage = (studentScore/maximumScore)*100;
        if (studentPercentage>=91
                && studentPercentage <=100) {
            System.out.println("Grade = A");
        }
        else if (studentPercentage>=81
                && studentPercentage <=90.99){
            System.out.println("Grade = B");
        }
        else if (studentPercentage>=71
                && studentPercentage <=80.99){
            System.out.println("Grade = C");
        }
        else if (studentPercentage>=61
                && studentPercentage<=70.99 ){
            System.out.println("Grade = D");
        }
        else if (studentPercentage<60.99){
            System.out.println("Grade = E");
        }
        else if (studentScore>maximumScore ){
            System.out.println("Invalid student score entered");
        }
        else if (studentScore<0){
            System.out.println("Invalid student score entered");
        }
        else if  (maximumScore> 160){
            System.out.println("Invalid max score entered");
        }





        String[] words5 = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard", "life"};

















        }




   }

