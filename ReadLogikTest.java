package Programmering;

 import static org.junit.jupiter.api.Assertions.*;
 import org.junit.jupiter.api.Test;

 public class ReadLogikTest {

     // Testar att antalet rader ökar på rätt sätt
     @Test
     public void testLaggTillRad() {

         ReadLogik logik = new ReadLogik(); // Skapar ett nytt objekt av ReadLogik klassen

         logik.laggTillRad(); // Lägger till en rad
         logik.laggTillRad(); // Lägger till en till rad

         // Kontrollerar om antal rader är 2
         assertEquals(2, logik.getAntalRader(), "Antalet rader borde vara 2 ");
     }

     // Testar att antalet tecken ökar rätt
     @Test
     public void testLaggTillTecken() {

         // Skapar ett nytt objekt av ReadLogik klassen
         ReadLogik logik = new ReadLogik();

         // Lägger till 10 tecken
         logik.laggTillTecken(10);

         // Lägger till 20 tecken till
         logik.laggTillTecken(20);

         // Kontrollerar om antalet tecken är 30
         assertEquals(30, logik.getAntalTecken(), "Antal tecken borde vara 30 ");
     }


     @Test
     public void testKombineraRaderOchTecken() {

         ReadLogik logik = new ReadLogik(); // Skapar ett nytt objekt av ReadLogik klassen

         // Lägger till 2 rader
         logik.laggTillRad();
         logik.laggTillRad();

         // Lägger till 10 tecken
         logik.laggTillTecken(10);

         //

         assertEquals(2, logik.getAntalRader()," Antalet rader 2");
         assertEquals(10, logik.getAntalTecken(), " Antalet tecken 10");

         // Det här testet ovan "kombinera rader och tecken". Den kombinerar två funktioner lägga till rad och tecken.
         // Samt om båda räknarna

     }

     // Testar så det längsta ordet lagras rätt
     @Test
     public void testLangstaOrd() {

         // Skapar ett nytt objekt av logikklasssen
         ReadLogik logik = new ReadLogik();

         // Lägg till en rad med flera ord
         logik.laggTillOrd( " Hej jag utbildar mig till mjukvarutestare");

         // Kontrollera att det längsta ordet är "univsersum"
         assertEquals( "mjukvarutestare", logik.getLangstaOrd(), "Längsta ordet borde vara 'mjukvarutestare'");
     }

     // Testar funktionen så att den känner igen "stop"
     @Test
     public void testStopKontroll() {

         // Skapar ett nytt objekt av logik klassen
         ReadLogik logik = new ReadLogik();

         // Kontrollera att "stop" returnerar true
         assertTrue(logik.isStop( "stop"), " 'stop' borde returnera true");

         // Kontrollerar att att andra ord returnerar false
         assertFalse(logik.isStop("forsätt"), " 'forsätt' borde returnera false");
     }

 }