package leetcode;
import java.util.Scanner;
public class Div_5_or_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scanner.nextInt();
		if(a%5==0) {
			System.out.println(a+" is divisible by 5");
		}else if(a%7==0) {
			System.out.println(a+" is divisible by 7");
		}else if(a%5!=0 && a%7!=0) {
			System.out.println(a+" is not divisible by 5 or 7");
		}
	}

}
