package leetcode;
import java.util.Scanner;
class Character{
	public static String CheckCharacter(char ch) {
		if(ch>=65 && ch<=90 || ch>=97 && ch<=122) {
			return ch+" is an Alphabet";
		}else if(ch>=48 && ch<=57){
			return ch+" is a number";
		}else if(!(ch>=65 && ch<=90 || ch>=97 && ch<=122 || ch>=48 && ch<=57)) {
			return ch+" is a special character";
		}
		return "";
	}
}
public class Check {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character");
		char m = scanner.next().charAt(0);
		String result=Character.CheckCharacter(m);
		System.out.println(result);
	}

}
