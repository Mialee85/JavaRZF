public class Fortgeschritten_7_Primzahlzerlegung {
	public static void main(String[] args) {
		
		var input = ns.args[0];
    var primesToTestBoolean = [];
    var primesToTest = [];

    for (let i = 0; i < (Math.floor(Math.sqrt(input)) + 1); i++) {
        primesToTestBoolean[i] = true;
    }
    primesToTestBoolean[0] = false;
    primesToTestBoolean[1] = false;

    for (let i = 0; i < primesToTestBoolean.length; i++) {
        if (!primesToTestBoolean[i]) {
            continue;
        }
        primesToTest.splice(primesToTest.length, 0, i);

        for (let j = i * i; j < primesToTestBoolean.length; j = j + i) {
            primesToTestBoolean[j] = false;
        }
    }

    for (let i = 0; i < primesToTest.length; i++) {
        while (input % primesToTest[i] == 0 && input > primesToTest[i]){
            input = input / primesToTest[i];
        }
    }
	}
}