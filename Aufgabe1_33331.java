import java.util.Scanner;

public class Aufgabe1_33331 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	   	
    	
    	int seiteA;
    	seiteA = scanner.nextInt();
    	
    	int seiteB;
    	seiteB = scanner.nextInt();
    	
    	double seiteC;
    	seiteC = scanner.nextDouble();
    	
    	int rechteck;
    	
    	rechteck = seiteB * seiteA;
    	
    	double quader;
    	quader = seiteC * seiteB * seiteA;
    	
    	System.out.println(rechteck);
    	System.out.println(quader);
    
    	
        //Aufgabe 1
        //Es soll eine rechteckige Fläche und ein Quader berechnet werden.
        //Es sind einzeln 3 Eingabewerte abzufragen.
        //Die ersten beiden sind als Integer zu speichern, der dritte als double.
        //Die Fläche soll aus den beiden Integern berechnet werden. Das Volumen entsprehend aus allen 3.
        //Anschließend sollen die Eingabewerte und die berechneten Werte ausgegeben werden.
    }
}
