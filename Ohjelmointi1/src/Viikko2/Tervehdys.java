package Viikko2;

import java.util.Scanner;

/**
 * Tee ohjelma Tervehdys, joka tulostaa kellonajasta riippuen erilaisen
 * tervehdyksen. Ohjelma kysyy tunnit ja kertoo sen perusteella tervehdyksen.
 * 
 * Aikav�li Tervehdys
 * 
 * 7:00 - 9:59 Hyv�� huomenta! 
 * 10:00 - 16:59 Hyv�� p�iv��! 
 * 17:00 - 21:59 Hyv�� iltaa! 
 * 22:00 - 6:59 Hyv�� y�t�!
 * 
 * Example output: Anna tunnit: 8 Hyv�� huomenta!
 *
 * 
 */
public class Tervehdys {

	public static void main(String[] args) {
		// olisihan t�m�n voinut tehd� Date luokkaakin k�ytt�m�ll�
		
		System.out.print("Anna tunnit: ");
		Scanner scan = new Scanner(System.in);
		double tunnit = scan.nextDouble();
		if(tunnit >= 7.00 && tunnit <= 9.59) {
			System.out.println("Hyv�� huomenta!");
		}else if (tunnit >= 10.00 && tunnit <= 16.59) {
			System.out.println("Hyv�� p�iv��!");
		}else if (tunnit >= 17.00 &tunnit <= 21.59) {
			System.out.println("Hyv�� iltaa!");
		}else if (tunnit >= 22.00 && tunnit <= 23.59) {
			System.out.println("Hyv�� y�t�!");
		}else if (tunnit >= 0.00 && tunnit <= 6.59) {
			System.out.println("Hyv�� y�t�!");
		}
		else {
			System.out.println("Virthe tuli! Back to basics");
		}

	}

}
