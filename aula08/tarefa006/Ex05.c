#include<stdio.h>

int main(void)
{

    float salario_min = 1045.00, salario_user, qtd;
    
    scanf("%f", &salario_user);
    qtd = salario_user/salario_min;

    printf("O salario do usuario equivale a %.2f salarios minimos.\n", qtd);

    return 0;
}