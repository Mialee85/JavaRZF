import java.util.Scanner;
public class Aufgabe1_33333 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        //Aufgabe 1
        //Es soll eine rechteckige Fläche und ein Quader berechnet werden.
        //Es sind einzeln 3 Eingabewerte abzufragen.
        //Die ersten beiden sind als Integer zu speichern, der dritte als double.
        //Die Fläche soll aus den beiden Integern berechnet werden. Das Volumen entsprehend aus allen 3.
        //Anschließend sollen die Eingabewerte und die berechneten Werte ausgegeben werden.
    	int laenge;
    	int breite;
    	double hoehe;

    	
    	System.out.println("Laenge eingeben");
    	laenge = sc.nextInt();
    	System.out.println("Breite eingeben");
    	breite = sc.nextInt();
    	System.out.println(laenge * breite + "qm" + " Bitte Hoehe eingeben");
    	hoehe = sc.nextDouble();
    	System.out.println(laenge * breite * hoehe+" qm ");
    	System.out.println(" Laenge: " + laenge + " m ");
    	System.out.println(" Breite: " + breite + " m ");
    	System.out.println(" Hoehe " + hoehe + " m ");
    
    }
}


