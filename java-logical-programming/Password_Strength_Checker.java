package leetcode;
import java.util.Scanner;
class Conditions{
	public String CheckStrength(String pass) {
		int strength=0;
		if(pass.length()>=8) 
		{
			strength++;
		if(hasUppercase(pass)) 
			strength++;
		if(hasLowercase(pass)) 
			strength++;
		if(hasDigit(pass)) 
			strength++;
		if(hasSpecialChar(pass)) 
			strength++;
		if(strength==5)
			return "Strong";
		else if(strength>=3)
			return "Moderate";
		else
			return "Weak";
		}
		return "Invalid Password";
		
		
		
	}
	public boolean hasUppercase(String pass) {
		return pass.matches("[A-Z]");
	}
	public boolean hasLowercase(String pass) {
    	return pass.matches("[a-z]");
    }
	public boolean hasDigit(String pass) {
		return pass.matches("[0-9]");
	}
	public boolean hasSpecialChar(String pass) {
		return pass.matches("[!@#$%^&*(),.?\";{}<>]");
	}
}

public class Password_Strength_Checker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a password");
		String pass=sc.nextLine();
		Conditions check = new Conditions();
		String result = check.CheckStrength(pass);
	    System.out.println("Password Strength: "+result);	
	}

}
