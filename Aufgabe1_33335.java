import java.util.Scanner;

public class Aufgabe1_33335 {
	public static void main(String[] args) {
		// Aufgabe 1
		// Es soll eine rechteckige Fläche und ein Quader berechnet werden.
		// Es sind einzeln 3 Eingabewerte abzufragen.
		// Die ersten beiden sind als Integer zu speichern, der dritte als double.
		// Die Fläche soll aus den beiden Integern berechnet werden. Das Volumen
		// entsprehend aus allen 3.
		// Anschließend sollen die Eingabewerte und die berechneten Werte ausgegeben
		// werden.
		int laenge;
		int breite;
		double hoehe;
		Scanner sc = new Scanner(System.in);

		System.out.print("Bitte geben Sie die Länge ein: ");
		laenge = sc.nextInt();
		System.out.print("Bitte geben Sie die Breite ein: ");
		breite = sc.nextInt();
		System.out.print("Bitte geben Sie die Höhe ein: ");
		hoehe = sc.nextDouble();

		System.out.println("Die Größe ist " + laenge + " x " + breite + " x " + hoehe + ". \nDie Fläche beträgt "
				+ laenge * breite + ".\nDas Volumen beträgt " + laenge * breite * hoehe + ".");
		sc.close();
	}
}
