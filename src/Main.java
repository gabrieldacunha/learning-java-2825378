import java.util.Scanner;

public class Main {
    public static double calculateSalary(double hoursWeek, double moneyHour, int vacationDays) {
        double yearlySalary;
        yearlySalary = hoursWeek * moneyHour * 52 - vacationDays * 5 * moneyHour;
        return yearlySalary;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the number of hours the employee works per week?");
        double hoursWeek = input.nextDouble();
        System.out.println("What is the amount of money the employee makes per hour?");
        double moneyHour = input.nextDouble();
        System.out.println("How many vacation days the employee took?");
        int vacationDays = input.nextInt();
        double yearlySalary = calculateSalary(hoursWeek, moneyHour, vacationDays);
        System.out.println("Employee's gross yearly salary is " + yearlySalary);
    }

}
