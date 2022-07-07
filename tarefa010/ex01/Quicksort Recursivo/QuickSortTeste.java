
import java.util.Random;

public class QuickSortTeste {
    
    public static void main(String args[])
    {
        Random random = new Random();
        recursiveQuickSort teste1 = new recursiveQuickSort();
        recursiveQuickSort teste2 = new recursiveQuickSort();
        recursiveQuickSort teste3 = new recursiveQuickSort();
        int vetor1[] = new int[100];
        int vetor2[] = new int[1000];
        int vetor3[] = new int[10000];
        long tempoInicial1 = System.currentTimeMillis();



        for (int i=0; i<vetor1.length; i++) {
            vetor1[i] = random.nextInt(100);
       }
        System.out.println("Vetor de 100 elementos:\n");
        teste1.sort(vetor1);
        printvetor(vetor1, vetor1.length);
        System.out.println("\n\nO método foi executado em " + (System.currentTimeMillis() - tempoInicial1) + " ms.");


        long tempoInicial2 = System.currentTimeMillis();
        for (int i=0; i<vetor2.length; i++) {
            vetor2[i] = random.nextInt(1000);
       }

        System.out.println("\n\n\nVetor de 1000 elementos:\n");
        teste2.sort(vetor2);
        printvetor(vetor2, vetor2.length);
        System.out.println("\n\nO método foi executado em " + (System.currentTimeMillis() - tempoInicial2) + " ms.");

        long tempoInicial3 = System.currentTimeMillis();
        for (int i=0; i<vetor3.length; i++) {
            vetor3[i] = random.nextInt(1000);
       }

        System.out.println("\n\n\nVetor de 10000 elementos:\n");
        teste3.sort(vetor3);
        printvetor(vetor3, vetor3.length);
        System.out.println("\n\nO método foi executado em " + (System.currentTimeMillis() - tempoInicial3) + " ms.");
    }


    public static void printvetor(int vetor[], int n)
    {
      int i;

     for (i = 0; i < n; ++i)


        if(i == n - 1) {
          System.out.print(vetor[i] + ".");
        }
        else {
          System.out.print(vetor[i] + ", ");
        }
    }

}
