package leetcode;
import java.util.Scanner;
public class Weekday {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter week number");
		int n = scanner.nextInt();
		String day;
		switch (n) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;
			default:
				day = "Invalid week number";
		}
		System.out.println(day);
	}

}
