public class Fortgeschritten_2_Boerse_Max {
	public static void main(String[] args) {
		//Das folgende Array stellt den Kurswert einer Aktie zu verschiedenen Zeitpunkten dar.
		//Ermitteln Sie den maximalen Gewinn für beliebig viele Transaktionen.
		//1 Transaktion stellt dabei den Kauf und späteren Verkauf einer Aktie dar.
		//Es kann sich immer nur 1 Aktie gleichzeitig in ihrem Besitz befinden. Es muss also erst verkauft werden, bevor erneut gekauft werden kann.
		
		int[] werte = {13, 51, 74, 136, 148, 140, 162, 22, 30, 168, 113, 16, 86, 37, 135, 21, 156, 82, 44, 0, 76, 157, 172, 68, 93, 20, 48, 44, 85, 75, 98, 34, 83, 40, 11, 120};
		
		//Erwarter Wert 1053.

		int overallDiff = 0;
		int currentMax = werte[0];
		int currentMin = werte[0];

		for (int i = 1; i < werte.length; i++) {
			if (werte[i] > currentMin) {
				overallDiff = overallDiff + werte[i] - currentMin;
			}

			currentMin = werte[i];
		}

		System.out.println("Maximaler Gewinn: " + overallDiff + ".");
	}
}