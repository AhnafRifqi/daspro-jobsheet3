import java.util.Scanner;

public class Electricweek3 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your electricity usage in kWh: ");
        double electricityUsage = scanner.nextDouble();
        double basicBill = electricityUsage * 1500;
        double surcharge = 0;
        if (electricityUsage > 500) {
            surcharge = (electricityUsage - 500) * 500;
        }
        double totalBill = basicBill + surcharge;
        System.out.println("Your total electricity bill is Rp " + totalBill);
    }
}  

    

