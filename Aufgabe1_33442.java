import java.util.Scanner;

public class Aufgabe1_33442 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie die erste Zahl ein:");
        int zahl1 = input.nextInt();
        System.out.println("Bitte geben Sie die zweite Zahl ein:");
        int zahl2 = input.nextInt();
        System.out.println("Bitte geben Sie die dritte Zahl ein:");
        double zahl3 = input.nextDouble();

        int area = zahl1 * zahl2;
        double volume = area * zahl3;

        System.out.println("Die Flaeche betraegt: " + area);
        System.out.println("Der Volumen betraegt: " + volume);
        System.out.println("die eingebenen Zahlen waren: " + zahl1 + " " + zahl2 + " " + zahl3);

        input.close();

        // Aufgabe 1
        // Es soll eine rechteckige Fläche und ein Quader berechnet werden.
        // Es sind einzeln 3 Eingabewerte abzufragen.
        // Die ersten beiden sind als Integer zu speichern, der dritte als double.
        // Die Fläche soll aus den beiden Integern berechnet werden. Das Volumen
        // entsprehend aus allen 3.
        // Anschließend sollen die Eingabewerte und die berechneten Werte ausgegeben
        // werden.
    }
}
