package ders_2;

import java.util.Scanner;

public class WhileAndIf {

	public static void main(String[] args) {
		
		/*Kullanıcıdan alınan 2 sayı arasındaki sayıları yazdırın.
		 *  
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen 1. sayıyı girin");
		int num1 = scan.nextInt();
		System.out.println("Lütfen 2. sayıyı girin");
		int num2 = scan.nextInt();
		
		
		
		
		if(num1<num2) {
			while(num1<num2) {
				System.out.print(" " +num1);
				num1++;
			}
		}
		if(num2<num1) {
			while(num2<num1) {
				System.out.print(" " +num2);
				num2++;
			}
		}

		
	}

}
