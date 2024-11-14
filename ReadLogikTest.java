package Programmering;

 import static org.junit.jupiter.api.Assertions.*;
 import org.junit.jupiter.api.Test;

 public class ReadLogikTest {

     @Test
     public void testLaggTillRad() {

         ReadLogik logik = new ReadLogik(); // Skapar ett nytt objekt av ReadLogik klassen

         logik.laggTillRad(); // Lägger till en rad
         logik.laggTillRad(); // Lägger till en till rad
         assertEquals(2, logik.getAntalRader(), "Antalet rader borde vara 2 ");
     }

     @Test
     public void testLaggTillTecken() {

         ReadLogik logik = new ReadLogik(); // Skapar ett nytt objekt av ReadLogik klassen

         logik.laggTillTecken(10); // Lägger till 10 tecken
         logik.laggTillTecken(20); // Lägger till 20 tecken till
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
         // Samt om båda räknarna (antalRader och antalTecken) uppdateras rätt
     }




}