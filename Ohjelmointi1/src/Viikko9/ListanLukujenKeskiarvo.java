package Viikko9;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Toteuta ohjelma, joka lukee k�ytt�j�lt� lukuja listalle. Sy�tteiden lukeminen p��tet��n 
 * kun k�ytt�j� sy�tt�� luvun -1.

Kun lukujen lukeminen lopetetaan, laske listalla olevien lukujen keskiarvo ja tulosta se. 
Tulostettua keskiarvoa ei tule muotoilla eik� py�rist��. Voit hy�dynt�� 
teht�v�n ratkaisemisessa teht�v�pohjaa.

 

T�m� teht�v� on lainattu Helsingin yliopiston ohjelmointikurssilta ja sen on laatinut Helsingin 
yliopiston Agile Education Research -tutkimusryhm�. Teht�v� on lisensoitu Creative 
Commons BY-NC-SA 4.0 -lisenssill�.

Example output:
Sy�t� kokonaislukuja listalle (-1 lopettaa):
72
2
8
11
-1

Keskiarvo: 23.25

 *
 */
public class ListanLukujenKeskiarvo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int luku = 0, summa = 0; double keskiarvo;
		System.out.println("Sy�t� kokonaislukuja listalle (-1 lopettaa): ");
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		while (luku != -1) {
			luku = scan.nextInt();
			if (luku != -1) {
				lista.add(luku);
			}
		}
		for (int d : lista) {
			summa += d;
		}
		keskiarvo = (double)summa/lista.size();
		DecimalFormat form = new DecimalFormat("0.00");
		System.out.println("Keskiarvo: "+form.format(keskiarvo));
		
		

	}

	

}
