
import java.util.Scanner;


class Student {
    // Default constructor
    public Student() {
        System.out.println("Student object is created when the program is run");
    }
}

class Commission {
    // Data members
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    // Method to accept details of the sales employee
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Address: ");
        address = scanner.nextLine();
        System.out.print("Enter Phone: ");
        phone = scanner.nextLine();
        System.out.print("Enter Sales Amount: ");
        salesAmount = scanner.nextDouble();
    }

    // Method to calculate commission
    public void calculateCommission() {
        double commission = 0;
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0;
        }

        System.out.println("Commission for " + name + " is: " + commission);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student();

        // Create a Commission object
        Commission commission = new Commission();

        // Accept details and calculate commission
        commission.acceptDetails();
        commission.calculateCommission();
    }
}

