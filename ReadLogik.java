package Programmering;

public class ReadLogik { // Logikklassen

    private int antalRader; //Denna räknar antal rader
    private int antalTecken; //Denna räknar antal tecken

    public void laggTillRad() { //Den här raden ökar antalet rader med 1
        antalRader++;
    }

    public void laggTillTecken (int antal) {
        antalTecken += antal;
    }

    public int getAntalRader() {
        return antalRader;
    }

    public int getAntalTecken() {
        return antalTecken;
    }

}
