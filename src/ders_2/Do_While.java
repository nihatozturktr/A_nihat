package ders_2;

import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {
		/*do while döngüsü koşulumuz false olsa bile en az bir kere çalışır.
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Br sayı girin");
		int num1 = scan.nextInt();
		 
		int kalan = 0;
		
		
		do {
			kalan += num1 %10;
			
			num1 = num1/10;
			
			System.out.println("Toplam = " + kalan + " num1 =" + num1);
			
		}
		while(num1> 0);
		
		
		

}
}