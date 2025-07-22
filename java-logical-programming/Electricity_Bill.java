package leetcode;
import java.util.Scanner;

class BillCalculator{
	private double bill;
	private int units;
	private double subcharge;
	private double totalbill;
	
	public void CalculateBill() {
		if(units<=50) {
			bill=units*0.50;
		}else if(units<=150) {
			bill=(50*0.50)+((units-50)*0.75);
		}else if(units<=250) {
			bill=(50*0.50)+(100*0.75)+((units-150)*1.20);
		}else if(units>250) {
			bill=(50*0.50)+(100*0.75)+(100*1.20)+((units-250)*1.50);
		}
		subcharge=bill*0.20;
		totalbill=bill+subcharge;
	}
	public void inputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter electricity consumed in units ");
		units =sc.nextInt();
	}
	public void displayresults() {
		System.out.println("The total Electricity bill is "+ totalbill);
	}
}
public class Electricity_Bill {
	public static void main(String[] args) {
		BillCalculator eb = new BillCalculator();
		eb.inputs();
		eb.CalculateBill();
		eb.displayresults();
	}

}
