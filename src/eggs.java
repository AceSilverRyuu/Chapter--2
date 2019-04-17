import java.util.Scanner;

public class eggs {

    public static void main (String[] args) {

        int userEggs;
        int dozen;
        int lastEggs;
        int oneDozen = 12;
        double perDozen = 3.25;
        double singleEgg = .45;
        final double TOTAL;

        Scanner keyboard = new Scanner (System.in);

        System.out.println ("Enter number of eggs ordered >>> ");

        userEggs = keyboard.nextInt ();

        dozen = userEggs / 12;
        lastEggs = userEggs % 12;
        TOTAL = (dozen * perDozen) + (lastEggs * singleEgg);

        System.out.println("You ordered " + userEggs + " eggs. That's " + dozen + " dozen at $3.25 per dozen and " +
                lastEggs + " loose eggs at 45 cents each for a total of $" + TOTAL + ".");
    }
}
