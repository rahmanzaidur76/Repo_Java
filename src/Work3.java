package Work3;

public class Work3 {
    public static void main(String[] args) {

        System.out.println("\nConvert degree-Celsius into deg-Fahrenheit and Kelvin:");
        double cTemp = 45.1D;
        double fTemp = cTemp * 9 / 5 + 32;
        System.out.println("\n" + cTemp + "C is equale to " + fTemp + "F");

        double kTemp = cTemp + 273.15;
        System.out.println(cTemp + "C is equale to " + kTemp + "K");

        System.out.println("\nConvert degree-Fahrenheit into Celsius and Kelvin:");

        fTemp = 45;
        cTemp = (fTemp - 32) / 1.8;
        System.out.println("\n" +fTemp + "F is equale to " + cTemp + "C");


        kTemp = (fTemp + 459.67) * 5 / 9;
        System.out.println(fTemp + "F is equale to " + kTemp + "K");

        System.out.println("\nConvert Kelvin into deg-Celsius and Fahrement:");

        kTemp = 280;
        cTemp = kTemp - 273.15;
        System.out.println("\n" + kTemp + "K is equale to " + cTemp + "C");

        fTemp = kTemp * 9/5 - 459.67;
        System.out.println(kTemp + "k is equale to " + fTemp + "F");

    }
}
