
public class DemoCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("num of arguments:-"+args.length);
		//System.out.println("argument:-"+args[0]);
		int sum = 0;
		for(String x:args) {
			System.out.println(x);
			sum = sum + Integer.parseInt(x);
			System.out.println(sum);
			
			
		}

	}

}
