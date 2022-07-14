import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor {
    
    public static void main(String args[])  {

        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        int num = 1, i = 0;

        try {
            while(num != 0) {
                System.out.print("Informe o valor " + (i+1) + ": ");
                vetor[i] = sc.nextInt();
                num = vetor[i];
                i++;
            }
        } 
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("\nMais valores do que o tamanho do vetor.");
        }
        catch (InputMismatchException e) {
            System.out.println("\nCaractere não é numérico.");
        }
    }
}
