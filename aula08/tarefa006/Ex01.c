#include<stdio.h>

int main(void)
{

    int anos, meses, dias, res;

    
    scanf("%d %d %d", &anos, &meses, &dias);

    res = anos*365 + meses*30 + dias;
    printf("%d dias.\n", res);

    return 0;
}