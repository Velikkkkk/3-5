import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        
        String word = JOptionPane.showInputDialog("Enter num:");
        System.out.println(word);
        
        //Parse the input as an int.
        //Print its value +1
        int num = Integer.parseInt(word);
        System.out.println(num+1);
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter num:"));
        System.out.println(number+1);

    }
}
