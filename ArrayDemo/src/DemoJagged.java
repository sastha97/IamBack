
public class DemoJagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] values = new int[3][];
		
		values[0] = new int[4];
		values[0][0] = 1;
		values[0][1] = 2;
		values[0][2] = 1;
		
		values[1] = new int[2];
		values[1][0] = 4;
		values[1][1] = 1;
		
		values[2] = new int[5];
		values[2][0] = 3;
		values[2][1] = 3;
		values[2][2] = 3;
		values[2][3] = 3;
		values[2][4] = 3;
		
		values[1] = new int[1];
		
		
		System.out.println(values);
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		for(int[] arr:values) {
			for(int v:arr) {
				System.out.print(v+"\t");
			}
			System.out.println();
		}
 
	}

}
