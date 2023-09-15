import java.util.Scanner;

public class Aufgabe1_33328 {
    public static void main(String[] args) {
        int zahl1;
        int zahl2;
        double zahl3;
       Scanner sc = new Scanner(System.in);
    	System.out.println("Berechne bitte die erste Zahl");
    	zahl1 = sc.nextInt();
       System.out.println("Berechne bitte die zweite Zahl");
       zahl2 = sc.nextInt();
       System.out.println("Berechne bitte die dritte Zahl");
       zahl3 = sc.nextDouble();

       
       int flaeche = zahl1 * zahl2;
       double volumen = flaeche * zahl3;
       
    		   System.out.println("Die Flaeche ist: " + flaeche);
    		   System.out.println("Das Volumen ist: "+ volumen);
    		   
       
       
    	//Aufgabe 1
        //Es soll eine rechteckige Fläche und ein Quader berechnet werden.
        //Es sind einzeln 3 Eingabewerte abzufragen.
        //Die ersten beiden sind als Integer zu speichern, der dritte als double.
        //Die Fläche soll aus den beiden Integern berechnet werden. Das Volumen entsprehend aus allen 3.
        //Anschließend sollen die Eingabewerte und die berechneten Werte ausgegeben werden.
    }
}
