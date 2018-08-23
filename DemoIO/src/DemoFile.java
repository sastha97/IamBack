import java.io.File;
import java.io.IOException;

public class DemoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		File myFile = new File("myFile.txt");
		System.out.println("As you wish!");
		try {
			myFile.createNewFile();
			System.out.println("Misson accomplished!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
