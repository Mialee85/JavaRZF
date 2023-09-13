import java.util.Scanner

public class Aufgabe1_00000 {
    public static void main(String[] args) {
        //Aufgabe 1
        //Es soll eine rechteckige Fläche und Kubus berechnet werden.
        //Es sind einzeln 3 Eingabewerte abzufagen.
        //Die ersten beiden sind als Integer zu speichern, der dritte als double.
        //Die Fläche soll aus den beiden Integern berechnet werden. Das Volumen entsprehend aus allen 3.
        //Anschließend sollen die Eingabewerte und die berechneten Werte ausgegeben werden.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Berechnung einer Fläche und eines Kubus.");
		
		System.out.println("Bitte geben Sie den ersten Wert ein (Ganzzahl).");
		int inputWert1 = sc.nextInt();
		
		System.out.println("Bitte geben Sie den zweiten Wert ein (Ganzzahl).");
		int inputWert2 = sc.nextInt();
		
		System.out.println("Bitte geben Sie den dritten Wert ein (Kommazahl).");
		double inputWert3 = sc.nextDouble();
		
		int flaeche = inputWert1 * inputWert2;
		double kubus = flaeche * inputWert3;
		
		sc.close();
		
		System.out.println("Die Fläche aus " + inputWert1 + " und " + inputWert2 +" beträgt: " + flaeche);
		System.out.println("Der Kubus aus " + inputWert1 + " und " + inputWert2 + " und " + inputWert3 +" beträgt: " + kubus);
		System.out.println("Programmende");
		
    }
}
