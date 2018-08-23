
public class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread started s"+Thread.currentThread().getName());
		System.out.println("Hello");
	}
	
}
