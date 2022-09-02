import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    
    public static void main(String[] args)  {

        try (Scanner sc = new Scanner(System.in)) {
            int num1 = 0, num2 = 1;

            try{
            System.out.println("Informe um número");
            num1 = sc.nextInt();
            System.out.println("Informe ouro número");
            num2 = sc.nextInt();
            int result = num1/num2;
            System.out.println("O resultado é: " + result);
            }
            catch (InputMismatchException e) {
                System.out.println("\nCaractere não é numérico.");
            }
            catch (ArithmeticException e) {
                System.out.println("\nNão tem como dividir por zero.");
            }
        }
    }
}
