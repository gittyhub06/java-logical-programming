package leetcode;
import java.util.Scanner;
public class Vowel_consonant {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a letter");
		char m = scanner.next().charAt(0);
		if(m=='a' || m=='e' || m=='i' || m=='o' || m=='u' || m=='A' || m=='E' || m=='I' || m=='O' || m=='U') {
			System.out.println(m+" is a vowel");
		}else {
			System.out.println(m+" is not a vowel");
		}
		
	}

}
