package com.executors;
import java.util.concurrent.*;

class myapp implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		perform();
	}
	void perform() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello\t" + i +"\t" + Thread.currentThread());
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
public class ExecutorDemo1 {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(2);
		
		for(int i = 0; i < 3; i++) {
			exec.execute(new myapp());
		}
		System.out.println("After submitting tasks");
		
		System.out.println("After for loop");
		exec.execute(new myapp());
		
		
		exec.shutdown();
		System.out.println("done");
	}
}