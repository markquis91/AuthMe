import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		List<String> authLists = new ArrayList<String>();
		authLists.add("12345");
		authLists.add("password");
		authLists.add("passw0rd");
		authLists.add("s3cr3t");
		
		System.out.println("Please enter your password");
		Scanner scan = new Scanner(System.in);
		String firstPassword;
		firstPassword = scan.next();
		
		if (firstPassword.equals(authLists.get(0))) {
			System.out.println("Welcome to the app, you've received access to all applications");
			scan.close();
		}
	}
}
