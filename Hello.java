
//MUSS angegeben werden, damit Java weiß, dass wir genau diesen "Scanner" (Java Klasse mit diesem Namen) verwenden und ansprechen wollen
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello World");

		// Initialisiert einen Scanner zum Einlesen von Dateien
		Scanner scanner = new Scanner(System.in);
		// Verwenden des Scanners zum einlesen einer Ganzzahl (int)
		// int ist ein Integer, nextInt ließt nur integer ein
		int zahl = scanner.nextInt();
		// Schließt den Scanner, kann auch weggelassen werden
		// Aber: wenn hier so angwednet, kann nach ausführen dieses Befehls dieser
		// Scanner mit namen scanner nicht mehr verwendet werden
		scanner.close();
	}
}
