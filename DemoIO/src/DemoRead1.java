import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoRead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Please enter your name");
			String name = br.readLine();
			System.out.println("Hi "+name+"!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			int a  = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			System.out.println("Bigger Bro is "+Math.max(a, b));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("Sorry Bro");
		}

	}

}
