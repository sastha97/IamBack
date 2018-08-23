
public class DemoWait {
	
	public static void main(String[] args) {
		DemoNotify t1 = new DemoNotify();
		t1.start();
		try
		{
			synchronized (t1) {
				t1.wait();
				System.out.println();
				System.out.println("sum: " + t1.sum);
			}
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Sum: " + t1.sum);
	}
}
