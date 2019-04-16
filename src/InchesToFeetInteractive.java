import java.util.Scanner;

public class InchesToFeetInteractive {

   public static void main (String[] args){

       int inches;
       int inchesInFeet =12;
       final int FOOT_ANSWER;
       final int INCHES_ANSWER;

       Scanner keyboard = new Scanner (System.in);



       System.out.println ("Please enter number of inches >>> ");

       inches = keyboard.nextInt ();

       FOOT_ANSWER = inches / 12;

       INCHES_ANSWER = inches % inchesInFeet;

       System.out.println ("The number of feet is " + FOOT_ANSWER + " and " + INCHES_ANSWER +" inches.");

   }
}
