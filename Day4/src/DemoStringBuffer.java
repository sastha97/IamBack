/**
 * 
 */

/**
 * @author Grad57
 *
 */
public class DemoStringBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder builder = new StringBuilder("city 1");
		//builder.append("city1");
		System.out.println(builder);
		StringBuilder builder1 = new StringBuilder("city 1");
		if(builder.equals(builder1)) { 
			System.out.println("Bullseye");
			}
		else {
			System.out.println("Missed it");
		}

	}

}
