public class SelectionSort {
    /*
     * selection sort algorithm has time complexity of O(n^2)
     * 
     * Selection Sort (Simple Notes) 
     * Find the smallest number in the list.
     * Swap it with the first position.
     * Move to the next position.
     * Repeat until the list is sorted.
     *     
     */

    public static void main(String[] args) {
        int array[] = {9,8,7,6,5,4,3,2,1}; 
        selectionSort(array);
        for (int i : array){
            System.out.println(i);
        }
        
    }
    public static void selectionSort(int[] array){        
        for (int i = 0 ; i < array.length -1 ; i++){
            int min = i;
            for (int j = i+1 ; j < array.length ; j++){
                if (array[min] > array[j]) {
                    min  = j;
                } 
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
