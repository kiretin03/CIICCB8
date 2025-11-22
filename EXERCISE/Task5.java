package EXERCISE;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number1 = scan.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = scan.nextInt();

        System.out.print("Enter number 3: ");
        int number3 = scan.nextInt();

        if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equal");  
        }
        else{
            int largest = number1;

            if (number2 > largest) {
                largest = number2;
            }
            if (number3 > largest) {
                largest = number3;
            }

            System.out.println("The Highest number is: " + largest);
        }
    }
}