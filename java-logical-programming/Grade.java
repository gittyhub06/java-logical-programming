package leetcode;
import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter marks of Physics");
		int phy = s.nextInt();
		System.out.println("Enter marks of Chemistry");
		int chem = s.nextInt();
		System.out.println("Enter marks of Biology");
		int bio = s.nextInt();
		System.out.println("Enter marks for Math");
		int math = s.nextInt();
		System.out.println("Enter marks for Computers");
		int cmp = s.nextInt();
		int TMarks = phy+chem+bio+math+cmp;
		int percent = (TMarks/5);
		char grade='i';
		switch(percent/10) {
		case 9:
			grade='A';
		break;
		case 8:
			grade='B';
		break;
		case 7:
			grade='C';
		break;
		case 6:
			grade='D';
		break;
		case 4:
			grade='E';
		break;
		case 3:
			grade='F';
		break;
			}
		System.out.println("Total marks are "+TMarks);
		System.out.println("Grade is "+grade);
		System.out.println("Percentage is "+percent);
	}

}
