package leetcode;
class Alphabets{
	char ch='a';
	public void Print() {
		while(ch<='z') {
			System.out.println(ch);
			ch++;
		}
	}
}

public class Print_Alphabets {
	public static void main(String[] args) {
		Alphabets p= new Alphabets();
		p.Print();
	}

}
