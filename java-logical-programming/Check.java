package leetcode;
import java.util.Scanner;
public class Check {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character");
		char m = scanner.next().charAt(0);
		if(m>=65 && m<=90 || m>=97 && m<=122) {
			System.out.println(m+" is an Alphabet");
			
		}else if( m>=48 && m<=57) {
			System.out.println(m+" is a number");
		}else if(!(m>=65 && m<=90 || m>=97 && m<=122 || m>=48 && m<=57)) {
			System.out.println(m+" is a special character");
		}
		
	}

}
