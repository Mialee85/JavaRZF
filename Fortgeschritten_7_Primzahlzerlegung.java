public class Fortgeschritten_7_Primzahlzerlegung {
    public static void main(String[] args) {

        int input = 3564; // Integer.parseInt(args[0]);
        int arrayLength = (int) (Math.floor(Math.sqrt(input)) + 2);
        boolean[] primesToTestBoolean = new boolean[arrayLength];
        int[] primesToTest = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            primesToTestBoolean[i] = true;
            primesToTest[i] = 0;
        }

        primesToTestBoolean[0] = false;
        primesToTestBoolean[1] = false;

        for (int i = 0; i < arrayLength; i++) {
            if (!primesToTestBoolean[i]) {
                continue;
            }
            primesToTest[i] = i;

            for (int j = i * i; j < arrayLength; j = j + i) {
                primesToTestBoolean[j] = false;
            }
        }

        int[] solution = new int[arrayLength];
        int counterSolutionPosition = 0;
        int inputModified = input;

        for (int i = 0; i < arrayLength; i++) {
            while (primesToTest[i] != 0 && inputModified % primesToTest[i] == 0 && inputModified >= primesToTest[i]) {
                inputModified = inputModified / primesToTest[i];
                solution[counterSolutionPosition] = primesToTest[i];
                counterSolutionPosition++;
            }
        }

        System.out.println("Die Primzahlzerlegung für " + input + " lautet:");

        for (int i = 0; i < counterSolutionPosition - 1; i++) {
            System.out.print(solution[i] + " * ");
        }
        System.out.print(solution[counterSolutionPosition - 1]);
    }
}