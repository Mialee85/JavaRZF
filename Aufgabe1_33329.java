import java.util.Scanner;

public class Aufgabe1_33329 {
    public static void main(String[] args) {
        //Aufgabe 1
        //Es soll eine rechteckige Fläche und ein Quader berechnet werden.
        //Es sind einzeln 3 Eingabewerte abzufragen.
        //Die ersten beiden sind als Integer zu speichern, der dritte als double.
        //Die Fläche soll aus den beiden Integern berechnet werden. Das Volumen entsprehend aus allen 3.
        //Anschließend sollen die Eingabewerte und die berechneten Werte ausgegeben werden.
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int length;
    	length = sc.nextInt();
    	
    	int width;
    	width = sc.nextInt();
    	
    	double hight;
    	hight = sc.nextDouble();
    	
    	int rechteck;
    	rechteck = length * width;
    	
    	double quader;
    	quader = length * width * hight;
    	
    	System.out.println(quader);
    	System.out.println(rechteck);
    	
    	
    }
}
