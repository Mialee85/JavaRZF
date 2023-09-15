import java.util.Scanner;

public class Aufgabe1_33326 {
    public static void main(String[] args) {
        //Aufgabe 1
        //Es soll eine rechteckige Fläche und ein Quader berechnet werden.
        //Es sind einzeln 3 Eingabewerte abzufragen.
        //Die ersten beiden sind als Integer zu speichern, der dritte als double.
        //Die Fläche soll aus den beiden Integern berechnet werden. Das Volumen entsprehend aus allen 3.
        //Anschließend sollen die Eingabewerte und die berechneten Werte ausgegeben werden.
    	
    Scanner sc = new Scanner(System.in);
    System.out.println("Bitte Laenge eingeben");
    int laenge = sc.nextInt();
    System.out.println("Bitte Breite eingeben");
    int breite = sc.nextInt();
    System.out.println("Bitte Hoehe eingeben");
    double hoehe = sc.nextDouble();
    int flaeche = laenge*breite;
    double volumen = laenge*breite*hoehe;
    
    System.out.println("Laenge "+ laenge +" mal Breite " + breite + " mal Hoehe " + hoehe + " = ");
System.out.println(volumen);
System.out.println("Laenge "+ laenge +" mal Breite " + breite + " = ");
System.out.println(flaeche);

    }
}

