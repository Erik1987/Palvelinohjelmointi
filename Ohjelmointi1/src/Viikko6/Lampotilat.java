package Viikko6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Tee ohjelma Lampotilat, joka kysyy maksimissaan 100 l�mp�tilaa ja tulostaa ne suuruusj�rjestyksess�.

Example output:
Anna l�mp�tila: -12
Anna l�mp�tila: 0
Anna l�mp�tila: 3
Anna l�mp�tila: -20
Anna l�mp�tila: -17
Anna l�mp�tila: -5
Anna l�mp�tila: -999
Annoit l�mp�tilat: -20 -17 -12 -5 0 3 
 *
 */
public class Lampotilat {

	public static void main(String[] args) {
		// kysy tunnilla ett� miten onnistuu sort taulukossa, jonka alustusta ei ole
		// m��ritelty
		
		int luku = 0; final int MAX = 100;
		int i = 0; int [] taulukko = new int[MAX];
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> taul = new ArrayList<Integer>();
		while (luku != -999 && i < MAX) {
			
			System.out.print("Anna l�mp�tila: ");
			luku = scan.nextInt();
			if(luku != -999) {
			taul.add(luku);
			taulukko[i] = luku;
			i++;
			}
		}
		System.out.print("Annoit l�mp�tilat: ");
		Arrays.sort(taulukko);
		Collections.sort(taul);
		
		for (int j = 0; j < taul.size(); j++) {
			System.out.print(taul.get(j) + " ");	
		}
		
		

	}

}
