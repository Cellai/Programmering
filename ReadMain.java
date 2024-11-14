package Programmering;

import java.util.Scanner;

public class ReadMain { // Main Klass

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReadLogik logik = new ReadLogik(); // Den här raden skapar ett objekt av Readlogik klassen

        String input = ""; // Här sparas det användaren skriver in

        System.out.println("Hej skriv in din text, skriv 'stop' för att avsluta ");

        // En while loop som körs, tills man skriver ordet stop
        while (!input.equals("stop")) {

            //Läser in en rad från den som skriver
            input = scanner.nextLine();


            //Om det inte är stop så skriver den ut text
            if (!input.equals("stop")) {

                System.out.println("Hallå du har skrivit: " + input);

                logik.laggTillRad(); //Den här raden ska öka antalet rader
                logik.laggTillTecken (input.length()); // Den här raden ökar antalet tecken


            }
        }


        System.out.println("Ha en fin dag ");
        System.out.println("Antal rader: " + logik.getAntalRader());
        System.out.println("Antal tecken: " + logik.getAntalTecken());

        //Efter att man skrivit stop så får man ut
        // Avslutninings medd, + antal rader och antal tecken inkl mellanslag
    }


}

