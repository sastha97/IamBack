
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnig:" + Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new MyRunnable();
		
		
		Thread t = new Thread(r);
		t.start();
	}

}
