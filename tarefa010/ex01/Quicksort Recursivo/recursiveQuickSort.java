public class recursiveQuickSort {

        private int[] numeros;
        private int numero;
    
        public void sort(int[] valor) {

            if (valor ==null || valor.length==0){
                return;
            }
            this.numeros = valor;
            numero = valor.length;
            quicksort(0, numero - 1);
        }
    
        private void quicksort(int esq, int dir) {
            int i = esq, j = dir;

            int pivo = numeros[esq + (dir-esq)/2];

            while (i <= j) {

                while (numeros[i] < pivo) {
                    i++;
                }

                while (numeros[j] > pivo) {
                    j--;
                }
    

                if (i <= j) {
                    troca(i, j);
                    i++;
                    j--;
                }
            }

            if (esq < j)
                quicksort(esq, j);
            if (i < dir)
                quicksort(i, dir);
        }
    
        private void troca(int i, int j) {

            int temp = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = temp;
        }


}
