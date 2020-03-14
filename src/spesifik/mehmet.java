package spesifik;

import java.util.Scanner;

public class mehmet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float with = scan.nextFloat();
		System.out.println("Enter the width as float");
		float length = scan.nextFloat();
		System.out.println("Enter the length as float");
		float heigth = scan.nextFloat();
		System.out.println("Enter the heigth as float");
		float height = scan.nextFloat();
		
		
		System.out.println("volume is " + with*length*height);

}
}