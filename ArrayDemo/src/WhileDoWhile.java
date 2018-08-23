
public class WhileDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 34, 44, 54, 34, 55,65,78,90,23,90};
		
		int i = 0;
		while(i < arr.length) {
			System.out.print(arr[i]+",");
			i++;
		}
		i = 0;
		System.out.println();
		do {
			System.out.print(arr[i]+",");
			i++;			
		} while (i < arr.length);

		i = 0;
		int search = 54;
		boolean flag = false;
		while(i<arr.length) {
			if(arr[i] == 54)
				flag = true;
			i++;
		}
		i = 0;
		if(flag = false)
			System.out.println("yo bro");
		else
			System.out.println("Hard luck :(");
		int data = 0;

	}

}
