package leetcode;
import java.util.Scanner;
class MTable{
	int n;
	public void inputs() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n to print its Mltiplication Table");
		n=sc.nextInt();
	}
	public void Table() {
		for(int i=1;i<=10;i++) {
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}
}

public class Multiplication_Table {
	public static void main(String[] args) {
		MTable t = new MTable();
		t.inputs();
		t.Table();
	}

}
