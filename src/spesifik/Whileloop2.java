package spesifik;

import java.util.Scanner;

public class Whileloop2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Bir sayı girin");

		int num1 = scan.nextInt();

		int sonuc = 0;
		int i =1;

		while (i < num1) {
			sonuc += i;
			i++;

		}
		System.out.println(num1 + sonuc);

	}

}
 