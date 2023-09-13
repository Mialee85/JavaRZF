import java.util.Scanner;

public class Aufgabe2_1_Muster {
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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie die Punktzahl ein.");
		
		int inputPunkte = sc.nextInt();
		sc.close();
		
		if (inputPunkte >= 91){
			System.out.println("Note 1");
		} else if (inputPunkte >= 81){
			System.out.println("Note 2");
		} else if (inputPunkte >= 66){
			System.out.println("Note 3");
		} else if (inputPunkte >= 51){
			System.out.println("Note 4");
		} else {
			System.out.println("Note 5");
		}
	}
}