
public class DemoPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Started:" + Thread.currentThread().getName());
		Thread t1 = new MyThread();
		t1.start();
		t1.setName("High");
		t1.setPriority(Thread.MAX_PRIORITY);

		System.out.println("Main Completed:" + Thread.currentThread().getName());
				
	}

}
