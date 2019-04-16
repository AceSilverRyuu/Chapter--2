import java.util.Scanner;

public class NauticalMilesInteractive {

    public static void main (String [] args){

        double numberOfKilometers = 1.852;
        double numberOfMiles = 1.150779;
        int nauticalMiles;
        final double MILES_IN_A_NAUTICAL_MILE;
        final double KILOMETERS_IN_A_NAUTICAL_MILE;

        Scanner keyboard = new Scanner (System.in);

        System.out.println ("Please enter nautical mile >>> ");

        nauticalMiles = keyboard.nextInt ();

        KILOMETERS_IN_A_NAUTICAL_MILE = nauticalMiles * numberOfKilometers;

        MILES_IN_A_NAUTICAL_MILE = nauticalMiles * numberOfMiles;

        System.out.println ("The number of miles in a nautical mile is " + MILES_IN_A_NAUTICAL_MILE +
                " and the number of kilometers in a nautical mile is " + KILOMETERS_IN_A_NAUTICAL_MILE);
    }
}
