import java.util.Scanner;

public class Fortgeschritten_5_Hamming_Encode {
	public static void main(String[] args) {
		// Es soll ein erweiterter 16-11 Hamming-Code für eine ganzzahlige Eingabe
		// erstellt werden. Zahlen die zu groß sind oder negativ sollen abgefangen
		// werden.
		// Als Informationsquelle zum Hamming-Code empfiehlt sich die entsprechende
		// Wikipedia-Seite, sowie verschiedene YouTube-Videos.
		// Empfehlenswert (englisch): https://www.youtube.com/watch?v=X8jsijhllIA
		// Hinweis: Die Nutzlast wird vom höchstwertigem zum niedrigwertigstem Bit
		// eingetragen und vorne mit 0 aufgefüllt.
		// Hinweis2: Paritybit 0 wird als letztes gesetzt.

		// Bsp: Der Hemmingcode für die Zahl 493 lautet 1000101111101101.

		System.out.println("Bitte geben Sie die zu codierende Zahl ein (0-2047)");

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();

		if (input > 2047 || input < 0) {
			System.out.println("Keine akzeptierte Eingabe. Programm beendet.");
			return;
		}

		if (input == 0){
			System.out.println("Der Hamming-Code lautet: 0000000000000000");
		}

		int[] convertingArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int position = 10;

		while (input > 1) {
			convertingArray[position] = input % 2;
			input = input / 2;
			position--;
		}
		convertingArray[position] = 1;

		int[] workingArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		position = 0;

		for (int i = 3; i < 16; i++) {
			if (i == 4 || i == 8) {
				continue;
			}

			workingArray[i] = convertingArray[position];
			position++;
		}

		int countOnes = 0;

		for (int i = 1; i < 16; i = i * 2) {
			countOnes = 0;
			for (int j = 0; j < 16; j++) {
				if (j % i == 0) {
					j = j + i;
				}
				if (workingArray[j] == 1) {
					countOnes++;
				}
			}

			if (countOnes % 2 == 1) {
				workingArray[i] = 1;
			}

		}

		countOnes = 0;
		for (int i = 1; i < 16; i++) {
			if (workingArray[i] == 1) {
				countOnes++;
			}
		}

		if (countOnes % 2 == 1) {
			workingArray[0] = 1;
		}

		System.out.print("Der Hamming-Code lautet: ");
		for (int i = 0; i < 16; i++) {
			System.out.print(workingArray[i]);
		}
	}
}