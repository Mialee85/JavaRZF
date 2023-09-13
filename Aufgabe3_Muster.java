public class Aufgabe3_Muster {
	public static void main(String[] args) {
		//Aufgabe 3
		//Es soll ein Array mit dem Inhalt eines 52-Blatt-Kartenspiels erstellt werden.
		//Anschließend soll das Spiel gemischt werden, so dass jede Karte mindestens 1 mal den Platz wechselt.
		//Abschließend sollen die ersten 4 Karten gezogen und ausgegeben werden.
		
		
		//Die folgenden drei Arrays dürfen nicht verändert werden.
		
		String[] farbe = {"Karo", "Herz", "Pik", "Kreuz"};
		String[] zahl = {"Ass","2","3","4","5","6","7","8","9","10","Bube","Dame","König"};
		int[] deck = new int[52];
		
		//Lösung ab hier einfügen
		
		//Deck aufbauen mit ids: 0-51
		//Karte 0 ist Karo Ass, Karte 51 Kreuz König
		for(int i = 0; i < 52; i++){
			deck[i] = i;
		}
		
		//Mischen
		for (int i = 0; i < 52; i++){
			int temp = deck[i];
			int zufall = (int)(Math.random()*52);
			deck[i] = deck[zufall];
			deck[zufall] = temp;
		}
		
		//Die ersten 4 Karten ausgeben
		for (int i = 1; i <=4; i++){
		System.out.println("Die " + i + ". Karte ist " + farbe[(deck[i-1]/13)] + " " + zahl[(deck[i-1]%13)]);
		}
	}
}