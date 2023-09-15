import java.util.Scanner;

public class Aufgabe2_1_33342 {
	public static void main(String[] args) {
		// Es soll eine Eingabeabfrage geben, wo eine ganzzahlige Punktzahl zwischen 0
		// und 100 (beide inklusive) eingegeben wird.
		// Das Programm soll die dazugehörige Note ausgeben und sich dann beenden.
		//
		// Notenschlüssel:
		// 100-91 = Note 1
		// 90-81 = Note 2
		// 80-66 = Note 3
		// 65-51 = Note 4
		// 50-0 = Note 5

		Scanner sc = new Scanner(System.in);

		int eingabe;

		System.out.println("Punktzsahl zum Bewerten eingeben: ");

		eingabe = sc.nextInt();

		// Eingabe muss Wert zwischen 
		if (eingabe > 100 || eingabe < 0) {
			System.out.println("Wert zwischen 0 und 100 eingeben");
		} else {
			//
			if (eingabe > 90) {
				System.out.println("Note 1");
			} else {
				// Groesser als 80 ist 2
				if (eingabe > 80) {
					System.out.println("Note 2");
				} else {
					// Groesser als 65 ist 3
					if (eingabe > 65) {
						System.out.println("Note 3");
					} else {
						// Groesser als 50 ist 4
						if (eingabe > 50) {
							System.out.println("Note 4");
						} else {
							System.out.println("Note 5");
						}
					}
				}
			}
		}
	}
}