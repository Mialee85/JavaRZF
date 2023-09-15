import java.util.Scanner;

public class Aufgabe1_33456
{
    public static void main(String[] args) {
        //Aufgabe 1
        //Es soll eine rechteckige Fläche und ein Quader berechnet werden.
        //Es sind einzeln 3 Eingabewerte abzufragen.
        //Die ersten beiden sind als Integer zu speichern, der dritte als double.
        //Die Fläche soll aus den beiden Integern berechnet werden. Das Volumen entsprehend aus allen 3.
        //Anschließend sollen die Eingabewerte und die berechneten Werte ausgegeben werden.
    int a;
    int b;
    double c;
    
    Scanner sexarbeit = new Scanner(System.in);
    a = sexarbeit.nextInt();
    b = sexarbeit.nextInt();
    c = sexarbeit.nextDouble();
    int flaecherechteck = a * b;
    double quadervolumen = flaecherechteck * c;
    System.out.println("Das ist die Flaeche du HS: " + flaecherechteck);
    System.out.println("Das ist das Volumen vom Quader du HS: " + quadervolumen);
    
    
    
    
    
  
    	
    	
    	
    }
}
