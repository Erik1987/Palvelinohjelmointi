package Viikko2;

import java.util.Scanner;

/**
 *	Tee ohjelma Katsastus, jolla voidaan selvitt�� katsastusasemalla k�ynnin hinta.

    pelkk� j�lkitarkastus maksaa 30. (T�ll�in ei mitata p��st�j�.)
    katsastus maksaa 50
    jos katsastuksessa mitataan p��st�, bensiiniautolla se on 22 ja dieselautolla 31.


Example output:
Onko 1=katsastus, 2=j�lkitarkastus: 1
Mitataanko p��st�t 0=ei, 1=kyll�: 1
Onko auto 0=bensa, 1=diesel: 1
Hinta on 81

 *
 */
public class Katsastus {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Onko 1=katsastus, 2=j�lkitarkastus: ");
		int eka = scan.nextInt();
		int hinta = 0, summa;
		switch (eka) {
		case 1:
			System.out.print("Mitataanko p��st�t 0=ei, 1=kyll�: ");
			eka = scan.nextInt();
			if (eka == 0) {
				hinta = 50;
				summa = hinta;
				System.out.println("Hinta on "+summa);
			}else {
				System.out.print("Onko auto 0=bensa, 1=diesel: ");
				eka = scan.nextInt();
				if (eka == 0) {
					summa = 50 + 22;
				}else {
					summa = 50 + 31;
				}
				System.out.println("Hinta on "+summa);
			}
			break;
		case 2:
			hinta = 30;
			System.out.println("Hinta on "+hinta);
		default:
			break;
		}

	}

}
