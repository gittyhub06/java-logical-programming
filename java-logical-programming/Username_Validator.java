package leetcode;
import java.util.Scanner;

public class Username_Validator {
	private String username;
	
	public void validator(String username) {
		this.username=username;
	}
	public  String validateUser() {
		if(username.length()<6) {
			return "Invalid username (must contain at least 6 characters)";
		}else if(username.contains(" ")) {
			return "Invalid username (must not contain any space between characters)";
		}else {
			return "Valid username";
		}
	}
	

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a username");
	String user=sc.nextLine();
	Username_Validator h = new Username_Validator();
	h.validator(user);
	System.out.println(h.validateUser()); 
}
}