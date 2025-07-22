package leetcode;
import java.util.Scanner;
class Number{
	int n;
	public void inputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		n=sc.nextInt();
	}
	public void Print() {
		while(n>=1) {
			System.out.println(n);
			n--;
		}
		n--;
	}
}

public class Natural_Numbers_Reverse {
	public static void main(String[] args) {
		Number m=new Number();
		m.inputs();
		m.Print();
	}

}
