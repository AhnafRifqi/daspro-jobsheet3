import java.util.Scanner;

public class Salaryweek3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of hours worked: ");
        int hoursWorked = scanner.nextInt();
        System.out.print("Enter the hourly wage: ");
        double hourlyWage = scanner.nextDouble();
        double basicSalary = hoursWorked * hourlyWage;
        double bonus = 0.1 * basicSalary;
        double totalSalary = basicSalary + bonus;
        double tax = 0.05 * totalSalary;
        double finalSalary = totalSalary - tax;
        System.out.println("The final salary is: Rp " + finalSalary);
    }
}

