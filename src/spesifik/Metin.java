package spesifik;

import java.util.Scanner;

public class Metin {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Lutfen iki basamakli tahmininizi giririz.");
	        int tahmin = scan.nextInt();
	        
	        int piyango = (int) ((Math.random() * 90) + 10);
	        
	        int piyangoBirlerBasamagi = piyango % 10;
	        int piyangoOnlarBasamagi = piyango / 10;
	        
	        int tahminBirlerBasamagi = tahmin % 10;
	        int tahminOnlarBasamagi = tahmin / 10;
	        
	        System.out.println("Poyango numarasi : " + piyango);
	        
	        if (piyango == tahmin) {
	            System.out.println(" Tebrikler 100.000 euro kazandiniz. ");
	        } else if (piyangoBirlerBasamagi == tahminOnlarBasamagi && piyangoOnlarBasamagi == tahminBirlerBasamagi) {
	            System.out.println("Iki rakami tutturdunuz 30.000 euro kazandiniz.");
	        } else if (piyangoBirlerBasamagi == tahminBirlerBasamagi || piyangoBirlerBasamagi == tahminOnlarBasamagi
	                || tahminOnlarBasamagi == piyangoOnlarBasamagi || tahminBirlerBasamagi == piyangoOnlarBasamagi) {
	            System.out.println("Bir rakam tutturdunuz 10.000 euro kazandiniz.");
	        } else {
	            System.out.println("Baska sefere artik :D");
	        }

	}

}
