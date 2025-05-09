public class QuickSort {
    /**
     * 
     * quick sort - moves all element to left of a pivot
     *              recursively divide in 2 partitions.
     * runtime complexity - Best case O (n log n )
     *                      Average case O (n log n)
     *                      worst case O (n^2)
     * space complexity - O (log (n)) due to recrusion
     */
    public static void main(String[] args) {
        int array[] = {8,2,4,7,1,9,6,5};
        quickSort(array,0,array.length-1);
        for (int i : array){
            System.out.print(i+" ");
        }
    }
    private static void quickSort(int[] array,int start,int end){
        if (end <= start){
            return; // base case
        } 
        int pivot = partition(array, start, end);  
        quickSort(array, start, pivot-1); // left partition
        quickSort(array, pivot+1 , end); // right partition

    }
    private static  int partition(int[] array,int start,int end){
        int pivot = array[end];
        int i = start -1;
        for(int j = start ; j <= end-1 ; j++){
            if (array[j]<pivot){
                i++;
                int temp  = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;        
        int temp  = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
}
