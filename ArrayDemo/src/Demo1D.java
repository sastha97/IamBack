
public class Demo1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers;
		numbers = new int[3];
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 100;
		//numbers[3] = 1000;
		
		System.out.println("0th element :-"+numbers[0]);
		System.out.println("1th element :-"+numbers[1]);
		System.out.println("2th element :-"+numbers[2]);
		
		int[] five;
		five = new int[5];
		five[1] = 15;
		five[2] = 24;
		five[3] = 78;
		five[4] = 7890;
		five[0] = 123;
		
		int sum = five[0]+five[1]+five[2]+five[3]+five[4];
		System.out.println(five[0]+3);
		System.out.println("abc"+(five[0]+five[1]+five[2]+five[3]+five[4]));
		System.out.println("sum:"+ sum);
		
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for(int x:numbers) {
			System.out.println(x);
		}

	}

}
