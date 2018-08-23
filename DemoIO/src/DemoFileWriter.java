import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fileWr = new FileWriter("txt.txt",true);
			fileWr.write("Who let the dogs out?");
			System.out.println("Don't know");
			fileWr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
