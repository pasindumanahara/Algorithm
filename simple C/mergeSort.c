#include <stdio.h>
#include <stdlib.h>
// merge arrays
void merge(int *left, int leftSize, int *right, int rightSize, int *array) {
    int i = 0, l = 0, r = 0;
    while (l < leftSize && r < rightSize) {
        if (left[l] < right[r]) {
            array[i++] = left[l++];
        } else {
            array[i++] = right[r++];
        }
    }
    while (l < leftSize) {
        array[i++] = left[l++];
    }
    while (r < rightSize) {
        array[i++] = right[r++];
    }
}
// recursively calling part
void mergerSort(int *array , int length){
  // base condition
  if (length <= 1) return;
  int middle = length / 2;
  int *lefttArray = malloc(middle*sizeof(int));
  int *rightArray = malloc((length-middle)*sizeof(int));
  
  for (int i = 0; i < middle; i++) {
        leftArray[i] = array[i];
    }
  for (int i = middle; i < length; i++) {
      rightArray[i - middle] = array[i];
  }
  mergeSort(leftArray, middle);
  mergeSort(rightArray, length-middle);
  merge(leftArray, middle, rightArray, length - middle, array);
  // freeing memory
  free(leftArray);
  free(rightArray);  
}
// prtin the array
void printArray(int *array, int length){
  for (int i = 0 ; i < length ; i++){
    printf("%d",array[i]);
  }
}
int main(void){
  // sample array 
  int array[] = {9,8,7,6,5,4,3,2,1};
  int length = sizeof(array)/sizeof(array[0]);
  mergeSort(array, length);
  printArray(array, length);
  
  return 0;
}
