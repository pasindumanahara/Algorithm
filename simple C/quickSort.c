#include <stdio.h>

void quickSort(int *array, int start, int end){
    // base case
    if (end <= start) return ; 
    int pivot = partition(array, start, end);
    quickSort(array, start, pivot-1); // left partition
    quickSort(array, pivot+1 , end); // right partition
}
int partition(int *array, int start, int end){

}


int main(void){
    
    return 0; 
}