import java.util.Scanner;

public class Aufgabe2_3_Muster {
	public static void main(String[] args) {
		//Fragen Sie die Kantenlänge eines Würfels in cm vom Benutzer ab und geben Sie das Volumen des Würfels aus.
		
		System.out.println("Geben Sie die Kantenlänge des Würfels in cm ein");
		
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		sc.close();
		
		System.out.println("Das Volumen eines Würfels mit der Kantenlänge " + input + "cm ist " + Math.pow(input, 3) + "cm^3.");
	}
}