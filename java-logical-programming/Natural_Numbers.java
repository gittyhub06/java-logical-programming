package leetcode;
import java.util.Scanner;

class Numbers{
	int n;
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		n=sc.nextInt();
	}
	public void Print() {
		int i=1;
	 while(i<=n) {
		 System.out.println(i);
		 i++;
	 }
	 n++;
	}
}

public class Natural_Numbers {
	public static void main(String[] args) {
		Numbers m=new Numbers();
		m.input();
		m.Print();
	}
	
	

}
