package Viikko9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Teht�v�pohjassa on ohjelma, joka lukee k�ytt�j�lt� sy�tteit�. 
 * Muokkaa ohjelman toimintaa siten, ett� kun sy�tteiden lukeminen lopetetaan, 
 * ohjelma tulostaa listalla olevien arvojen lukum��r�n.

Huom! K�yt� t�ss� listan valmiiksi tarjoamaa metodia size.

 

T�m� teht�v� on lainattu Helsingin yliopiston ohjelmointikurssilta ja sen on laatinut 
Helsingin yliopiston Agile Education Research -tutkimusryhm�. Teht�v� on lisensoitu 
Creative Commons BY-NC-SA 4.0 -lisenssill�.

Example output:
Sy�t� sanoja listalle. Tyhj� tai yhdysviiva (-) lopettaa:
Juno
Elizabeth
Mauri
Irene
Outi
Lauri
Iisa
Risto
Markus
Ville
Oskari
-

Yhteens�: 11

 *
 */
public class ListanKoko {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nimi =".";
		System.out.println("Sy�t� sanoja listalle. Tyhj� tai yhdysviiva (-) lopettaa: ");
		ArrayList<String> lista = new ArrayList<String>();
		
		while (!nimi.equalsIgnoreCase(" ") && !nimi.equalsIgnoreCase("-")) {
			nimi = scan.nextLine();
			if (!nimi.equalsIgnoreCase(" ") && !nimi.equalsIgnoreCase("-")) {
				lista.add(nimi);
			}
		}
		System.out.println("Yhteens�: "+lista.size());
		

	}

}
