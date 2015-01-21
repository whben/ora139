import java.net.Socket;
import java.util.Scanner;

public class HelloClient {
	public static void main(String[] args) throws Exception {
		Socket client = new Socket("localhost", 9999); // l½ӷþÎÆ¶Ë		
                Scanner scan = new Scanner(client.getInputStream());
		scan.useDelimiter("\n");
		if (scan.hasNext()) {
			System.out.println("·þÎÆ¶˷µ»Øý + scan.next());
		}
                System.out.print();
                System.out.prinln();
		scan.close();
		client.close();
	}
}
