
public class Demo2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrays;
		arrays = new int[3][3];
		
	
		arrays[0][0] = 1;
		arrays[0][1] = 2;
		arrays[0][2] = 4;

		arrays[1][0] = 4;
		arrays[1][1] = 8;
		arrays[1][2] = 24;

		arrays[2][0] = 3;
		arrays[2][1] = 9;
		arrays[2][2] = 15;
		
		for(int i = 0; i < arrays.length; i++) {
			for(int j = 0; j < arrays[i].length; j++) {
				System.out.print(arrays[i][j] + "\t");
				
			}
			System.out.println();
		}


	}

}
