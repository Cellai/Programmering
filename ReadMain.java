package Programmering;

import java.util.Scanner;

public class ReadMain { // Main Klass

    public static void main(String[] args) {
        // Här skapar man en Scanner för att läsa in det användaren matar in
        Scanner scanner = new Scanner(System.in);

        // Den här raden skapar ett objekt av Readlogik klassen
        ReadLogik logik = new ReadLogik();


        System.out.println("Hej skriv in din text, skriv 'stop' för att avsluta ");

        while (true) {
            String input = scanner.nextLine(); // Läser in det användaren matar in, en rad

        // Kontrollera om man skrev ordet "stop", därefter avsluta loopen
        if (logik.isStop(input)) {
            break;
        }

            logik.laggTillRad(); //Den här raden ska öka antalet rader

            logik.laggTillTecken (input.length()); // Den här raden ökar antalet tecken

            logik.laggTillOrd(input); // Den här räknar antalet ord och hitta det längsta ordet

        }

        scanner.close(); // Stänger scanner då man inte behöver läsa in något mer

        // Skriv ut resultatet till användaren
        System.out.println(" Programmet Avlutades, Välkommen åter.");
        System.out.println("Antal rader: " + logik.getAntalRader()); // Total antal rader
        System.out.println("Antal tecken: " + logik.getAntalTecken()); // Total antal tecken
        System.out.println("Antal ord: " + logik.getAntalOrd());       // Total antal ord
        System.out.println(" Längsta ordet: " + logik.getLangstaOrd()); // Det längsta ordet

        //Efter att man skrivit stop så får man ut
        // Avslutninings medd, + antal rader, antal tecken inkl mellanslag,
        // antal ord och det längsta ordet
    }


}

