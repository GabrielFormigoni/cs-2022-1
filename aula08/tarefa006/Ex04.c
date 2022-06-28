#include<stdio.h>

int main(void)
{

    float IPI, cod1, valor1, quant1, cod2, valor2, quant2, preco;
    
    scanf("%f %f %f %f %f %f %f", &IPI, &cod1, &valor1, &quant1, &cod2, &valor2, &quant2);
    preco = (valor1*quant1 + valor2*quant2) * (IPI/100 + 1);

    printf("O valor total a ser pago pelas pecas %.2f e %.2f: %.2f.\n", cod1, cod2, preco);

    return 0;
}