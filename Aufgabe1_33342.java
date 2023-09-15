import java.util.Scanner;

public class Aufgabe1_33342 {
    public static void main(String[] args) {
        //Aufgabe 1
        //Es soll eine rechteckige Fläche und ein Quader berechnet werden.
        //Es sind einzeln 3 Eingabewerte abzufragen.
        //Die ersten beiden sind als Integer zu speichern, der dritte als double.
        //Die Fläche soll aus den beiden Integern berechnet werden. Das Volumen entsprehend aus allen 3.
        //Anschließend sollen die Eingabewerte und die berechneten Werte ausgegeben werden.
    	
    	//Deklarieren der Variablen, die benutzt werden sollen
    	//Boxen wo das eingelesene rein kommt
    	int a;
    	int b;
    	double c;
    	
    	//Deklarieren eines Objektes vom Typ "Scanner" mit dem namen scanner, damit etwas von der Konsole eingelesen werden kann
    	Scanner scanner = new Scanner(System.in);
    	
    	//Werte einlesen
    		//Ausgabe zum anzeigen, was eingegeben werden soll:
    		System.out.println("Bitte Wert a eingeben: ");
    	a = scanner.nextInt();
    		System.out.println("Bitte Wert b eingeben: ");
    	b = scanner.nextInt();
    		System.out.println("Bitte Wert c eingeben: ");
    	c = scanner.nextDouble();
    	
    	//Rechteck berechnen
    	//hier kann int für die "Box" benutzt werden, da zwei int-Werte miteinander multipliziert werden
    	int rechteckFlaeche = a * b;
    	System.out.println("Die Flaeche des Rechtecks betraegt: " + rechteckFlaeche);
    	
    	//Quader berechnen
    	//hier muss double statt int benutzt werden, weil int und double multipliziert werden, weil ein double "größer" ist
    	double quaderFlaeche = a * b * c;
    	System.out.println("Das Volumen des Quaders betraegt: " + quaderFlaeche);
    	
    	//Schließen des scanners, kann aber auch weg gelassen werden
    	scanner.close();
    }
}
