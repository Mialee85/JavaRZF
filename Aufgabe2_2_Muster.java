import java.util.Scanner;

public class Aufgabe2_2_Muster {
	public static void main(String[] args) {
		// Berechnen Sie den kleinsten gemeinsamen Teiler aus 2 veschiedenen Ganzzahlen, die eingegeben werden, und geben Sie das Ergebnis aus.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("Bitte geben Sie die 1. Zahl ein (Ganzzahl).");
		int Zahl1 = sc.nextInt();
		System.out.println("Bitte geben Sie die 2. Zahl ein (Ganzzahl).");
		int Zahl2 = sc.nextInt();
		sc.close();
		
		int temp = 0;
		
		if (Zahl2 > Zahl1){
			temp = Zahl2;
			Zahl2 = Zahl1;
			Zahl1 = temp;
		}
		
		int rest = Zahl1 % Zahl2;
		
		while (rest != 0){
			Zahl1 = Zahl2;
			Zahl2 = rest;
			rest = Zahl1 % Zahl2;
		}
		
		System.out.println("Der größte gemeinsame Teiler ist " + Zahl2);
	}
}