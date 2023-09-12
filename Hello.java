import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Type in a number");
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();
        sc.close();
        
        System.out.println("The doubled amount of your number is: " + inputNumber * 2 + " " + 74 % -4);

        double a = 6.5;
        a += a + 1;
        System.out.println(a);
        a = 6;
        a /= 2;
        System.out.println(a);
        //Test
        System.out.println(Math.ceil(2.1));
    }
}
