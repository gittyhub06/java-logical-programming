package leetcode;
import java.util.Scanner;
class Convertnum{
	int n;
	 String[] ones= {"","one","two","three","four","five","six","seven","eight","nine"};
	 String[] tens= {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	public void inputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
	}

	public String convert(int num) {
		if(num==0) {
			return "zero";
		}
		if(num<0) {
			return "minus"+convert(-num);
		}
		String words="";
		if(num/100000>0) {
			words+=convert(num/100000)+" lakh";
			num%=100000;
		}
		if(num/1000>0) {
			words+=convert(num/1000)+" thousand";
			num%=1000;
		}
		if(num/100>0) {
			words+=convert(num/100)+" hundred";
			num%=100;
		}
		if(num<20) {
			 words+=ones[num];  
		}else {
			words+=tens[num];
//			System.out.println("word: " + words);
		}
		
//		System.out.println(n+" : "+(num));
		
		return words;
	}
}

public class Num_To_Words {
	public static void main(String[] args) {
		Convertnum w=new Convertnum();
		w.inputs();
		System.out.println(w.convert(w.n));
	}

}
