package Viikko9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ohjelmaan on toteutettu valmiina pohja, joka lukee k�ytt�j�lt� lukuja
 * listalle. Sy�tteiden lukeminen p��tet��n kun k�ytt�j� sy�tt�� luvun -1.
 * 
 * Lis�� ohjelmaan toiminnallisuus, joka lukujen lukemisen j�lkeen tulostaa
 * k�ytt�j�n sy�tt�m�t luvut. Sy�tteen lukemisen p��tt�misest� ilmoittavaa lukua
 * ei tulosteta.
 * 
 * T�m�n teht�v�n on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhm�. Teht�v� on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssill� ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */
public class ListanLuvut {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> luvut = new ArrayList<Integer>();

        System.out.println("Sy�t� kokonaislukuja listalle (-1 lopettaa):");
        while (true) {
            int syote = lukija.nextInt();

            if (syote == -1) {
                break;
            } else {
                luvut.add(syote);
            }
        }
        lukija.close();

        System.out.println(); // Tyhj� rivi tulosteeseen

        for (int i = 0; i < luvut.size(); i++) {
        	System.out.println(luvut.get(i));
		}
        
    }
}