import javax.swing.*;
import java.util.Scanner;

public class AddORMultiply {

    /*
    Write two methods, one that adds two numbers and second that multiplies them.
    Then, write a main method that prompts the user to enter 2 numbers.

    If the first one is larger than the second, multiply and display the result
    If not, add them and display the results.
     */
  /*  public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("what give your first number");
        int number1 = read.nextInt();

        System.out.println("what is your second number");
        int number2 =read.nextInt();


        if (number1 > number2){

            System.out.println(multiply(number1,number2));

        }
        if (number2 > number1){

            System.out.println(add(number1,number2));
        }


    }
    public static int add(int number1,int number2){

       return number1+ number2;

    }
    public static int multiply(int number1,int number2){

        return number1*number2;

    }

   */


    public static void main(String[] args) {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog("give your first number"));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("give your first number"));

        output(number1,number2);

    }
    public static int add(int number1,int number2){

        return number1 + number2;

    }
    public static int multiply(int number1,int number2){

        return number1*number2;

    }
    public static void output(int number1,int number2){

        String message = "";

        if (number1 > number2){

           message = "here are your results: " + multiply(number1,number2);
            JOptionPane.showMessageDialog(null,message);
        }
        if(number2 > number1){

           message = "here are your results: " + add(number1,number2);
            JOptionPane.showMessageDialog(null,message);

        }
    }





}
