package leetcode;
import java.util.Scanner;
public class Upper_Lower_Case {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Character");
		char m = scanner.next().charAt(0);
		if(m>=65 && m<=90) {
			System.out.println("The character is Uppercase");
		}else if(m>=97 && m<=122) {
			System.out.println("The character is Lowercase");
		}
	}

}
