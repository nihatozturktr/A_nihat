package spesifik;

import java.util.Scanner;

public class SwitcCase2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1-8 arası bir sayı girin");
		int num1 = scan.nextInt();
		
				
		switch (num1) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sali");
			break;
		case 3 :
			System.out.println("Carsamba");
			break;
		case 4 :
			System.out.println("Persembe");
			break;
		case 5 :
			System.out.println("Cuma");
			break;
		case 6 : 
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			default:
				System.out.println("Yanlış sayı girdiniz");
		}

	}

}
