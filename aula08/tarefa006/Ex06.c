#include<stdio.h>

int main(void)
{

    int num;
  
    scanf("%d", &num);

    printf("Numero:%d\nAntecessor:%d\nSucessor:%d\n", num, (num-1), (num+1));

    return 0;
}