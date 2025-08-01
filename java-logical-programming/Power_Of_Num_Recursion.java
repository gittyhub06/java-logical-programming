package leetcode;
import java.util.Scanner;
class PowerRecur{
	int n,p,e;
	public void inputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.println("Enter the power");
		p=sc.nextInt();
	}
	public int power(int num,int p) {
		if(p==0) {
			return 1;
		}
		e=num*power(num,p-1);
		return e;
	}
	public void display() {
		System.out.println(n+" power "+p+" is "+e);
	}
}

public class Power_Of_Num_Recursion {
	public static void main(String[] arg) {
		PowerRecur r=new PowerRecur();
		r.inputs();
		r.power(r.n,r.p);
		r.display();
		
	}

}
