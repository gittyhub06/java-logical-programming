package leetcode;

public class Maxbet3num {
	public static void main(String[] args) {
		int a = 6;
		int b = 3;
		int c = 11;
		if(a>b && a>c) {
			System.out.println(a+" is the greatest");
		}else if(b>a && b>c) {
			System.out.println(b+" is the greatest");
		}else if(c>a && c>b) {
			System.out.println(c+" is the greatest");
		}
	}

}
