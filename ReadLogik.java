package Programmering;

public class ReadLogik { // Logikklassen

    //Variabler här nede som...
    private int antalRader; //Denna räknar antal rader

    private int antalTecken; //Denna räknar antal tecken

    private int antalOrd; // Räknar antal ord

    //Lagra det längsta ordet
    private String langstaOrd = ""; // Den börjar som en tom sträng


    public void laggTillRad() { //Det här är en Metod som ökar antalet rader med 1
        antalRader++;
    }
    // En Metod som ökar antalet tecken, baserat på det antal som skickas in till metoden
    public void laggTillTecken (int antal) {
        antalTecken += antal;
    }

    // En Metod som räknar antalet ord och hittar det längsta ordet
    public void laggTillOrd(String rad) {

        // Om raden är tom eller bara innehåller mellanslag, så gör den ingenting
        if ( rad == null || rad.trim().isEmpty()) {
            return;
        }
        // Den här delar upp raden i ord baserat på mellanslag
        String[] ord = rad.split(" ");

                // Den här lägger till antalet ord i den totala ord räknaren
                antalOrd += ord.length;
        //
        for (String o : ord) {

            // Om ordet är längre än det nuvarande längsta ordet, så uppdaters det längsta ordet
            if (o.length() > langstaOrd.length()) {
                langstaOrd = o;
            }
        }

    }
    //Här är Metoden som kontrollerar om en text är 'stop'
    public boolean isStop(String input) {
        return "stop" .equals(input);
    }
    // En Metod för att hämta antalet rader
    public int getAntalRader() {
        return antalRader;
    }

    // Metod för att hämta antalet tecken
    public int getAntalTecken() {
        return antalTecken;
    }

    // Metod för att hämta antalet ord
    public int getAntalOrd() {
        return antalOrd;
    }

    // Metod för att hämta det längsta ordet
    public String getLangstaOrd() {
        return langstaOrd;
    }

}