import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String choiceOne = "a";
        String choiceTwo = "b";
        String choiceThree = "c";
        System.out.println("What is your Openet account?");
        System.out.println("a) Porto Rico");
        System.out.println("b) Republica Dominicana");
        System.out.println("c) Chile");
        System.out.println("Type your answer: ");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        if (choiceTwo.equals(answer.toLowerCase())){
            System.out.println("That's correct!");
        } else {
            System.out.println("Wrong choice.");
        }
    }
}
