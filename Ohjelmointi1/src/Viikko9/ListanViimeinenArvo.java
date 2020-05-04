package Viikko9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Teht�v�pohjassa on ohjelma, joka lukee k�ytt�j�lt� sy�tteit� ja lis��
 * sy�tteet listalle. Sy�tteen lukeminen lopetetaan kun k�ytt�j� sy�tt�� tyhj�n
 * merkkijonon.
 * 
 * Muokkaa ohjelmaa siten, ett� kun sy�tteiden lukeminen lopetetaan, ohjelma
 * tulostaa viimeksi luetun arvon. Tulosta viimeksi luettu arvo listalta. K�yt�
 * t�ss� hy�dyksi listan koon kertovaa metodia.
 * 
 * T�m�n teht�v�n on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhm�. Teht�v� on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssill� ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */
public class ListanViimeinenArvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<String> lista = new ArrayList<String>();

        System.out.println("Sy�t� sanoja listalle. Tyhj� tai yhdysviiva (-) lopettaa:");

        while (true) {
            String syote = lukija.nextLine();

            if ("".equals(syote) || "-".equals(syote)) {
                break;
            } else {
                lista.add(syote);
            }
        }
        lukija.close();

        System.out.println(); // Tyhj� rivi tulosteeseen

        System.out.println(lista.get(lista.size()-1));
    }
}
