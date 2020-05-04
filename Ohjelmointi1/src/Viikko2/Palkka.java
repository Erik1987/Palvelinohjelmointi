package Viikko2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Tee ohjelma Palkka, joka kysy k�ytt�j�lt� bruttopalkan, veroprosentin ja i�n.
 * Ohjelma laskee k�teen j��v�n osuuden palkasta sek� verojen,
 * ty�tt�myysvakuutuksen (1.5%) ja ty�el�kemaksun. Ty�el�kemaksu on 53-62
 * vuotiaalla 8.25% ja muilla 6.75%.
 * 
 * Veron osuus on palkka * veroprosentti / 100.0
 * 
 * Ty�el�kevakuutusmaksun osuus on palkka * XX, miss� XX on joko 0.0835 tai
 * 0.0675 riippuen i�st�
 * 
 * Ty�tt�myysvakuutuksen osuus on palkka * 0.015
 * 
 * K�teen j��v� osuus on palkka - vero - ty�tt�myysvakuutus -
 * ty�el�kevakuutusmaksu
 * 
 * Example output: Anna palkka: 
 * 3000 Anna veroprosentti: 20 
 * Anna ik�: 25
 * Bruttopalkka 3000 
 * Veron osuus 600,00 
 * Ty�el�kevakuutusmaksun osuus 202,50
 * Ty�tt�myysvakuutuksen osuus 45,00 
 * K�teen j�� 2152,50
 * 
 */
public class Palkka {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("0.00");
		double tyel;
		System.out.print("Anna palkka: ");
		int palkka = scan.nextInt();
		System.out.print("Anna veroprosentti: ");
		int veroprosentti = scan.nextInt();
		System.out.print("Anna ik�: ");
		int ika = scan.nextInt();
		System.out.println("Bruttopalkka " + palkka);
		double vero = palkka*veroprosentti/100;
		System.out.println("Veron osuus " + form.format(vero));
		if(ika >= 53 && ika <= 62) {
			tyel = palkka * 0.0835;
		}else {
			tyel = palkka * 0.0675;
		}
		System.out.println("Ty�el�kevakuutusmaksun osuus " + form.format(tyel));
		double tyot = palkka * 0.015;
		System.out.println("Ty�tt�myysvakuutuksen osuus "+ form.format(tyot));
		System.out.println("K�teen j�� "+ form.format(palkka-vero-tyel-tyot));
		
	}

}
