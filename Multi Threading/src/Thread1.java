
public class Thread1 extends Thread {
	private int data;
	
	public Thread1(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread No:"+data);

	}
	
}
