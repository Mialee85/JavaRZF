import java.util.Scanner;

public class Aufgabe2_1_00000 {
	public static void main(String[] args) {
		//Es soll eine Eingabeabfrage geben, wo eine ganzzahlige Punktzahl zwischen 0 und 100 (beide inklusive) eingegeben wird.
		//Das Programm soll die dazugehörige Note ausgeben und sich dann beenden.
		//
		//Notenschlüssel:
		//100-91 = Note 1
		//90-81 = Note 2
		//80-66 = Note 3
		//65-51 = Note 4
		//50-0 = Note 5
		int a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte Wert eingeben");
		a = scanner.nextInt();
		if (a<=100 && a>=0) {
			if (a>=91) {
				System.out.println("Note 1. Herzlichen Glückwunsch!");
				
			}
			else if (a>=81) {
				System.out.println("Note 2. Sehr gut gemacht :)");
			}
			else if (a>=66) {
				System.out.println("Note 3. Nächstes mal ist bestimmt die 2 drin :)");
			}
			else if (a>=51) {
				System.out.println("Note 4. Ausreichend ist bestanden, also keine Sorge!");
			}
			else if (a>=0) {
				System.out.println("Note 5. GG Bruder");
			}
		} else {
			System.out.println("Max. 100 Notenpunkte");
		}
		
		
		
	}
}