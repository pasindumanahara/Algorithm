public class MergeSort {
    /*
     * run - time complexity - O(n log n ) 
     * space complexity - O(n)
     * this will use more memory 
     * 
     */

    public static void main(String[] args) {
        int numbers[] = {9,8,7,6,5,4,3,2,1};
        mergeSort(numbers); // calling merge sort
        for (int i : numbers){
            System.out.print(i+" ");
        }        
    }

    private  static  void mergeSort(int[] array){
        int length = array.length;
        if (length <= 1 )
            return; // base case 
        int middle = length / 2;
        int leftArray[] = new int[middle];
        int rightArray[] = new int[length - middle];
        int i = 0; // left array
        int j = 0; // right array
        // deviding array to right and left arrays
        for (;i  < length; i++ ){
            if (i < middle){
                leftArray[i]=array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray); // recrusionly calling merge method

        merge(leftArray, rightArray, array);
    }
    private  static  void merge(int[] leftArray,int[] rightArray,int[] array){
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; // for original array,left right

        // check the conditions for merging
        while (l < leftSize && r < rightSize) {
            // comparing elements 
            if (leftArray[l] < rightArray[r]){
                array[i] = leftArray[l]; 
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        
        while (l < leftSize) { 
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }  

    }
    
}


