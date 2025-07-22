package leetcode;
import java.util.Scanner;
class CharacterCheck{
	 public static String CheckCharacter(char ch){
		 if(ch>=65 && ch<=90 || ch>=97 && ch<=122) {
			 return ch+" is an Alphabet";
		 }else {
			 return ch+" is not an Alphabet";
		 }
	 }
}
public class Alphabet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character");
		char m = scanner.next().charAt(0);
		String result=CharacterCheck.CheckCharacter(m);
		System.out.println(result);
	}

}
