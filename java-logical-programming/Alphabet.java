package leetcode;
import java.util.Scanner;
public class Alphabet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character");
		char m = scanner.next().charAt(0);
		if((m>=65 && m<=90) || (m>=97 && m<=122)) {
			System.out.println(m+" is an Alphabet");
		}else {
			System.out.println(m+" is not an Alphabet");
		}
		
	}

}
