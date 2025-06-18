#include <stdio.h>
int main(){
    int a = 10;
    int *p = &a; // Pointer to integer
    printf("Value of a: %d\n", a);
    printf("Address of a: %p\n", (void*)&a);
    printf("Value pointed to by p: %d\n", *p);
    printf("Address stored in p: %p\n", (void*)p);
    
    *p = 20; // Changing the value of a using pointer
    printf("New value of a: %d\n", a);
    
    return 0;
}