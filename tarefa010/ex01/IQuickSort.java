
public class IQuickSort {
    void trocar(int vetor[], int i, int j)
    {
     int t = vetor[i];
     vetor[i] = vetor[j];
     vetor[j] = t;
    }
    
    int particionar(int vetor[], int l, int b)
    {
     int a = vetor[b];
     int i = (l - 1);
    
     for (int j = l; j <= b - 1; j++) {
      if (vetor[j] <= a) {
       i++;

       trocar(vetor, i, j);
      }
     }

     trocar(vetor, i + 1, b);
     return (i + 1);
    }
    

    void QuickSort(int vetor[], int l, int b)
    {

     int empilhar[] = new int[b - l + 1];
    

     int topo = -1;
    
  
     empilhar[++topo] = l;
     empilhar[++topo] = b;
    

     while (topo >= 0) {

      b = empilhar[topo--];
      l = empilhar[topo--];
    

      int p = particionar(vetor, l, b);
    
      if (p - 1 > l) {
       empilhar[++topo] = l;
       empilhar[++topo] = p - 1;
      }
  
      if (p + 1 < b) {
       empilhar[++topo] = p + 1;
       empilhar[++topo] = b;
      }
     }
    }
    
    void printvetor(int vetor[], int n)
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