import java.util.Scanner;

public class MathPractice {

    public static void main (String[] args){
        int num1;
        int num2;
        int num3;


        Scanner input = new Scanner(System.in);
        System.out.println("please enter a whole number>>>>");
        num2 = input.nextInt();

        num3 = num1 + num2;

        System.out.println(num3);

        num3 = num1 * num2;

        System.out.println(num3);

        num3 = num2 / num1;

        System.out.println(num3);

        num3 = num2 % num1;

        System.out.println(num3);

        num3 = num2 - num1;

        System.out.println(num3);

    }
}
