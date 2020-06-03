import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        double grade = 3.7;
        String studentFirstName = "Gabriel";
        String studentLastName = "Rodrigues";
        System.out.println(studentFirstName + " " + studentLastName +
                ", your grade is: " + grade);
        System.out.println("What is the new grade?");

        Scanner input = new Scanner(System.in);
        double grade2 = input.nextDouble();
        double result = (grade+grade2)/2;
        System.out.println(studentFirstName + " " + studentLastName +
                ", now your grade is: " + result);

        if (result < 5){
            System.out.println("You failed this one... :(");
        } else {
            System.out.println("You passed the exams!");
        }
    }
}
