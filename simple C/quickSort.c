#include <stdio.h>

int partition(int *array, int start, int end) {
    int pivot = array[end];
    int i = start - 1;

    for (int j = start; j <= end - 1; j++) {
        if (array[j] < pivot) {
            i++;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    i++;
    int temp = array[i];
    array[i] = array[end];
    array[end] = temp;

    return i;
}

void quickSort(int *array, int start, int end) {
    if (end <= start) return;
    int pivot = partition(array, start, end);
    quickSort(array, start, pivot - 1);
    quickSort(array, pivot + 1, end);
}

void printArray(int *array, int length) {
    for (int i = 0; i < length; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");
}

int main(void) {
    int array[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    int length = sizeof(array) / sizeof(array[0]);
    int start = 0;

    quickSort(array, start, length - 1);
    printArray(array, length);

    return 0;
}
