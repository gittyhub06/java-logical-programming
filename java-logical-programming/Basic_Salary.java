package leetcode;
import java.util.Scanner;

class SalaryCalculator {
    private double basicsalary;
    private double HRA;
    private double DA;

    // Constructor
    public SalaryCalculator(double basicsalary) {
        this.basicsalary = basicsalary;
    }

    // Method to calculate HRA and DA
    public void calculateAllowances() {
        if (basicsalary <= 10000) {
            HRA = basicsalary * 0.20;
            DA = basicsalary * 0.80;
        } else if (basicsalary <= 20000) {
            HRA = basicsalary * 0.25;
            DA = basicsalary * 0.90;
        } else {
            HRA = basicsalary * 0.30;
            DA = basicsalary * 0.95;
        }
    }

    // Method to calculate gross salary
    public double calculateGrossSalary() {
        return basicsalary + HRA + DA;
    }

    // Getter for HRA
    public double getHRA() {
        return HRA;
    }

    // Getter for DA
    public double getDA() {
        return DA;
    }
}

// Main class with main method
public class Basic_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary:");
        double basicsalary = sc.nextDouble();

        SalaryCalculator calc = new SalaryCalculator(basicsalary);
        calc.calculateAllowances();

        double grossSalary = calc.calculateGrossSalary();
        System.out.println("Gross salary is: " + grossSalary);
        System.out.println("HRA is: " + calc.getHRA());
        System.out.println("DA is: " + calc.getDA());

        sc.close();
    }
}
