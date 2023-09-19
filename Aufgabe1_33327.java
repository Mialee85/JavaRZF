import java.util.Scanner;

public class Aufgabe1_33327 {
	public static void main(String[] args) {
		// Aufgabe 1
		// Es soll eine rechteckige Fläche und ein Quader berechnet werden.
		// Es sind einzeln 3 Eingabewerte abzufragen.
		// Die ersten beiden sind als Integer zu speichern, der dritte als double.
		// Die Fläche soll aus den beiden Integern berechnet werden. Das Volumen
		// entsprehend aus allen 3.
		// Anschließend sollen die Eingabewerte und die berechneten Werte ausgegeben
		// werden.

		System.out.println("Bitte die erste Seitenlaenge eingeben um die Flache zu berechnen");
		Scanner sc = new Scanner(System.in);
		int seitenlaenge1 = sc.nextInt();

		System.out.println("Bitte die zweite Seitenlaenge eingeben um die Flache zu berechnen");

		int seitenlaenge2 = sc.nextInt();

		System.out.println("Bitte die dritte Seitenlaenge eingeben um das Volumen zu berchnen");

		double seitenlaenge3 = sc.nextDouble();
		sc.close();

		int rechteckflaeche = seitenlaenge1 * seitenlaenge2;
		double quadervolumen = seitenlaenge3 * rechteckflaeche;

		System.out.println("Die Fläche des Rechtecks betraegt: " + rechteckflaeche);
		System.out.println("Das Volumen des Quaders beträgt: " + quadervolumen);
	}
}
