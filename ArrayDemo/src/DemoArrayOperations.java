import java.util.Arrays;

public class DemoArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {24, 15, 97, 55, 6, 89, 90};
		Arrays.fill(numbers, 0);
		
		for(int num: numbers)
			System.out.println(num);
		
		Arrays.fill(numbers, 1, 4, 100);
		
		System.out.println();

		for(int num: numbers)
			System.out.println(num);
		
		int [] arr_copy = Arrays.copyOf(numbers, 5);
		
		
		
		System.out.println();
		
		for(int num: arr_copy)
			System.out.println(num);
		System.out.println("--------");
		
		String[] names = { "Sas","Dd","Ro","Li"};
		String[] names1 = { "Sas","Dd","Ro","Li"};
		
		boolean data =Arrays.equals(names, names1);
		if(data)
			System.out.println("Yo Bro");
		
		
		int[] numbers1 = {24, 15, 97, 55, 6, 89, 90};
		
		Arrays.sort(numbers1);
		for(int num: numbers1)
			System.out.println(num);
		System.out.println("------");
		int index = Arrays.binarySearch(numbers1, 24);
		System.out.println(index);
		
	}

}
