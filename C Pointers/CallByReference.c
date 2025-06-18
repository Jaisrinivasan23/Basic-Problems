#include <stdio.h>
void hi(int *p){
    *p+=1;
}
void hii(char *p){
    *p+=1;
}
int main(){
    int a = 10;
    char ch = 'D';
    hi(&a);
    hii(&ch);
    printf("%d",a);
    printf("%c",ch);
}