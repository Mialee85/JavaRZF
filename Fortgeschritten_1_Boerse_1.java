public class Fortgeschritten_1_Boerse_1 {
	public static void main(String[] args) {
		// Das folgende Array stellt den Kurswert einer Aktie zu verschiedenen
		// Zeitpunkten dar.
		// Ermitteln Sie den maximalen Gewinn für 1 Transaktion.
		// 1 Transaktion stellt dabei den Kauf und späteren Verkauf einer Aktie dar.
		// Es kann sich immer nur 1 Aktie gleichzeitig in ihrem Besitz befinden. Es muss
		// also erst verkauft werden, bevor erneut gekauft werden kann.

		int[] werte = {20, 133, 179, 140, 46, 102, 197, 14, 75, 84, 14, 194, 98, 195, 124, 15, 21, 55, 161, 48, 173, 34, 126, 28, 154, 35, 21, 17, 10};
		//Erwartet Lösung: 181

		int overallDiff = 0;
		int currentDiff = 0;
		int currentMax = werte[0];
		int currentMin = werte[0];

		for (int i = 1; i < werte.length; i++) {
			if (werte[i] > currentMax) {
				currentDiff = werte[i] - currentMin;
				currentMax = werte[i];
			}

			if (werte[i] < currentMin) {
				if (overallDiff < currentDiff) {
					overallDiff = currentDiff;
				}
				currentMin = werte[i];
				currentMax = werte[i];
			}
		}

		if (overallDiff < currentDiff) {
			overallDiff = currentDiff;
		}

		System.out.println("Maximaler Gewinn: " + overallDiff + ".");
	}
}