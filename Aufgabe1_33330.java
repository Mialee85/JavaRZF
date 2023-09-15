import java.util.Scanner;

public class Aufgabe1_33330 {
    public static void main(String[] args) {
        //Aufgabe 1
        //Es soll eine rechteckige Fläche und ein Quader berechnet werden.
        //Es sind einzeln 3 Eingabewerte abzufragen.
        //Die ersten beiden sind als Integer zu speichern, der dritte als double.
        //Die Fläche soll aus den beiden Integern berechnet werden. Das Volumen entsprehend aus allen 3.
        //Anschließend sollen die Eingabewerte und die berechneten Werte ausgegeben werden.
    	
    	
    	int length;
    	int width;
    	double hight;
    	int area;
    	double volume;
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Länge in m");
    	length = scanner.nextInt();
    	System.out.println("Breite in m");
    	width = scanner.nextInt();
    	System.out.println("Höhe in m");
    	hight = scanner.nextDouble();
    	scanner.close();
    	
    	area = length * width;
    	volume = length * width * hight;
    	
    	System.out.println("Fläche: "+area+" m²"+"\nVolumen in m³: "+volume+" m³");
    }
}
