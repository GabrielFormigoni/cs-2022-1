#include<stdio.h>

int main(void)
{

    float media1, media2, media3;

    media1 = (7 + 8 + 9) / 3;
    media2 = (4 + 5 + 6) / 3;
    media3 = (media1 + media2) / 2;

    printf("%.2f\n%.2f\n%.2f", media1, media2, media3);
    
    return 0;
}