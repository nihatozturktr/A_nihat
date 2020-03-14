package spesifik;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the gender");
		String gender=  scan.nextLine();
		
		//String gender = "male";

		switch (gender) {
		case "female":
			System.out.println("This is a girl");
			break;
		case "male":
			System.out.println("This is a boy");
			break;

		default:
			System.out.println("Enter a valid gender");
		}

	}

}
