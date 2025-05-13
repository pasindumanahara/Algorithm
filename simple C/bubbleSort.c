#include <stdio.h>

void bubbleSort(int *array, int length) {
    for (int i = 0; i < length; i++) {
        for (int j = 0; j < length - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}

void printArray(int *array, int length){
    for (int i = 0 ; i < length ; i++){
        printf("%d\n",array[i]);
    }
}

int main(void){
    int numbers[] = {9,8,7,6,5,4,3,2,1};
    int length = sizeof(numbers)/sizeof(numbers[0]);
    bubbleSort(numbers, length);
    printArray(numbers, length);
    return 0;
}