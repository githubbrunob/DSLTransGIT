import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			java.io.PrintWriter a = new PrintWriter("C:/Users/Sunday3s/Desktop/lal.pl");
			for (int i = 0; i < 10000000; i++) {
				a.println("value('var',"+i+").");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
