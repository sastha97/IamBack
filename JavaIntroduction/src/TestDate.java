
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1 = new Date();
		Date date2 = new Date(15, 1, 1997);
		date1.display();
		date2.display();
		date1.setDay(7);
		date1.setMonth(9);
		date1.display();

	}

}