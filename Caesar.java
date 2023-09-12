import java.util.Scanner;

public class Caesar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die zu verschlüsselnde Phrase ein!");
        String inputVerschluesslung = scanner.nextLine();

        System.out.println("Geben Sie die Verschiebung ein (1-25)!");
        int inputVerschiebung = scanner.nextInt();

        scanner.close();

        if (inputVerschiebung < 0) {
            System.out.println("Eingabe zu klein. Programm beendet");
            return;
        }

        if (inputVerschiebung > 25) {
            inputVerschiebung = inputVerschiebung % 26;
        }

        if (inputVerschiebung == 0) {
            System.out.println("Schlüssel ist ein vielfaches von 26. Verschlüsselung ist das Abbild der Eingabe.");
            System.out.println("Verschlüsselter Text: " + inputVerschluesslung);
        }

        char[] inputVerschluesslungChars = inputVerschluesslung.toCharArray();

        int[] inputVerschluesslungIntegers = new int[inputVerschluesslungChars.length];

        System.out.print("Verschlüsselter Text: ");

        for (int i = 0; i < inputVerschluesslungChars.length; i++) {
            inputVerschluesslungIntegers[i] = (int) inputVerschluesslungChars[i];
            if (inputVerschluesslungIntegers[i] >= 65) {
                inputVerschluesslungIntegers[i] += inputVerschiebung;
            }
            System.out.print((char) inputVerschluesslungIntegers[i]);
        }
    }
}
