import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("pls throw a number");
		int num = s.nextInt();
		
		System.out.println("pls throw another number");
		int num1 = s.nextInt();
		
		System.out.println("combine:="+(num+num1));

	}

}
