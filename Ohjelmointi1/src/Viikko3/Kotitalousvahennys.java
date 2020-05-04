package Viikko3;

import java.text.DecimalFormat;
import java.util.Scanner;



/**
 * Tee ohjelma Kotitalousvahennys, joka laskee k�ytt�j�n saaman kotitalousv�hennyksen m��r�n. 
 * Ty�korvausten eurom��ri� kysyt��n niin kauan, kunnes k�ytt�j� antaa korvauksen m��r�ksi nolla. 
 * Kotitalousv�hennyksen m��r� on 50 % ty�korvauksesta. 
 * Kotitalousv�hennyksen enimm�ism��r� on 2 400 euroa. 
 * V�hennyksen omavastuu on 100 euroa. 
 * Kotitalousv�hennys lasketaan ty�korvausten summa * 50 / 100.0 - omavastuu.

Example output:
Anna ty�korvauksen m��r� (0 lopettaa): 2000,0
Anna ty�korvauksen m��r� (0 lopettaa): 1000,0
Anna ty�korvauksen m��r� (0 lopettaa): 3000,0
Anna ty�korvauksen m��r� (0 lopettaa): 0
Kotitalousv�hennyksen m��r� on 2400,00 euroa

 *
 */
public class Kotitalousvahennys {

	
	public static void main(String[] args) {
		double luku = 1, summa = 0;
		double uusisumma = 0;
		Scanner scan = new Scanner(System.in);
		
		while (luku != 0) {
			System.out.print("Anna ty�korvauksen m��r� (0 lopettaa): ");
			luku = scan.nextDouble();
			if(luku >= 0) {
			summa = summa + luku;
			}
		}
		double ktv = summa*0.5-100;
		
		DecimalFormat form = new DecimalFormat("0.00");
		if (summa > 2400 && summa >= 100) {
			uusisumma = 2400;
		}
		else if(summa >= 100 && summa < 2400) {
		uusisumma = summa*0.5-100;
		}
		else {
			uusisumma = 0.00;
		}
		System.out.println("Kotitalousv�hennyksen m��r� on "+form.format(uusisumma) + " euroa");
	}

}
