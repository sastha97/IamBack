
public class Account {
	private int balance = 50;
	
	
	
	public int getBalance() {
		return balance;
	}



	public void withDraw(int amount) {
		// TODO Auto-generated method stub
		balance = balance - amount;
	}
}
