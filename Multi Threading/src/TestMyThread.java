
public class TestMyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Started"+Thread.currentThread().getName());
		Thread t = new Thread1(1);
		t.start();
		System.out.println("T1 About to start"+Thread.currentThread().getName());
		Thread t1 = new Thread1(2);
		t1.start();
		System.out.println("Main completed"+Thread.currentThread().getName());
	}

}
