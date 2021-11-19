import javax.swing.*;
import java.util.Random;

public class QuizGame {

    static int userAnswer, correctAnswer;
    static String displayProblem = "";
    public static void main(String[] args) {

        int choice = input ("Choose : Addition(1), Subtraction(2), Multiplication(2), Division(4)");

        createProblem(choice);
        

        System.out.println(displayProblem);
        System.out.println(correctAnswer);

    }
    public static void createProblem(int choice){
        if(choice >= 1 ){
            if(choice < 5){

                if(choice == 1){
                    addProblem();
                }

                if(choice == 2){
                    subtractProblem();
                }

                if (choice == 3){
                    multiplyProblem();
                }

                if (choice == 4){
                    divideProblem();
                }

            }else{
                System.out.println("wrong Input restart program, Try again");
                System.exit(0);
            }
        }else {
            System.out.println("wrong Input restart program, Try again");
            System.exit(0);
        }


    }
    public static void addProblem(){

        int number1 = random();
        int number2 = random();

        correctAnswer = number1 + number2;
        displayProblem = number1 + " + " + number2;

    }
    public static void subtractProblem(){

        int number1 = random();
        int number2 = random();

        correctAnswer = number1-number2;
        displayProblem = number1 + " - " + number2;


    }
    public static void multiplyProblem(){

        int number1 = random();
        int number2 = random();

        correctAnswer = number1 * number2;
        displayProblem = number1 + " x " + number2;

    }
    public static void divideProblem(){

        int number1 = random();
        int number2 = random();

        correctAnswer = number1 / number2;
        displayProblem = number1 + " / " + number2;

    }

    //HELPER METHODS
    public static int random(){
        Random random = new Random();
        return random.nextInt(20) + 1;
    }

    public static int input(String message){
        return Integer.parseInt(JOptionPane.showInputDialog(message));

    }
}
