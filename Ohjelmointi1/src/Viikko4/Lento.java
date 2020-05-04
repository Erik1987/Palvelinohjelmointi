package Viikko4;

import java.util.Scanner;

/**
 * Tee ohjelma Lento, jolla voidaan selvitt�� lennon numerosta, onko kyseess� Finnairin lento. 
 * Jos lennon numeron alussa on AY, kyseess� on Finnairin lento. 
 * Jos kyseess� on Finnairin lento, selvitet��n lis�ksi, 
 * onko kyseess� kaukolento, kotimaan lento vai Ven�j�n lento. 
 * Jos lennon numeron kolmas merkki on 1, kyseess� on kaukolento, 2-6 kotimaan lento, 7 Ven�j�n lento. 
 * Merkkijonon voi muuntaa numeroksi

int numero = Integer.parseInt(merkkijono);

Example output:
Anna lennon numero: AY105
Kaukolento

 *
 */
public class Lento {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		char tyyppi;
		System.out.print("Anna lennon numero: ");
		String lento = scan.nextLine();
		tyyppi = lento.charAt(2);
		
		
		if(lento.startsWith("AY")) {
			
			if(tyyppi == '1') {
				System.out.println("Kaukolento");
			}if (tyyppi >= '2' && tyyppi <= '6') {
				System.out.println("Kotimaan lento");
			}if (tyyppi == '7') {
				System.out.println("Ven�j�n lento");
			}
		}else {
			System.out.println("Ei ole Finnairin lento");
		}
		
	}
	
}
