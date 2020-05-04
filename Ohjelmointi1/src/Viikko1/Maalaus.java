package Viikko1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Tee ohjelma Maalaus, joka kertoo, paljonko maalia on ostettava. Ohjelma kysyy
 * huoneen leveyden, pituuden ja korkeuden sek� paljonko litralla maalia saadaan
 * maalattua. Ohjelma kertoo t�m�n j�lkeen maalin tarpeen litroina. Muotoile
 * vastaus kahdella desimaalilla.
 * 
 * Esimerkiksi huoneen leveys on 3.2 metri�, pituus on 3.0 metri� ja korkeus 2.5
 * metri�. Litralla maalia saadaan maalattua 7.0 neli�t�. Maalia tarvitaan koko
 * huoneen maalaamiseen 4.43 l ((leveys + leveys + pituus + pituus) * korkeus /
 * litralla).
 * 
 * Example output: 
 * Anna huoneen leveys, pituus ja korkeus: 3,40 3,00 2,50
 * Paljonko litralla saadaan maalattua neli�it�: 5 
 * Maalin tarve on 6,40 litraa
 *
 * 
 */
public class Maalaus {

	public static void main(String[] args) {
		System.out.print("Anna huoneen leveys, pituus ja korkeus: ");
		Scanner scan = new Scanner(System.in);
		double leveys = scan.nextDouble();
		double pituus = scan.nextDouble();
		double korkeus = scan.nextDouble();
		System.out.print("Paljonko litralla saadaan maalattua neli�it�: ");
		int litralla = scan.nextInt();
		double maalia = ((leveys + leveys + pituus + pituus) * korkeus / litralla);
		DecimalFormat form = new DecimalFormat("0.00");
		System.out.println("Maalin tarve on " + form.format(maalia) + " litraa");

	}

}
