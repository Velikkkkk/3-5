import javax.swing.*;
import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        System.out.println("Enter number:");
        int num1 = sc.nextInt();
        System.out.println("Enter number:");
        int num2 = sc.nextInt();
        System.out.println("Enter number:");
        int num3 = sc.nextInt();

        int sum = num1+num2+num3;

        System.out.println("Sum = "+ sum);
        sc.close();
        //Remember to close the Scanner
        
    }
}
