public class InterpolationSearch {
    /*
     *  THIS REQUIRED A SORTD ARRAY
     * improvment over binary search best used for "uniformaly" ditributed data
     * "guesses" where a value might be based on calculated probe results
     * if probe is incorrect , search area is narrowed, and a new probe is 
     * calculated.
     * average cases: O(log( log (n) ) ) 
     * worst case: O(n) [value increase exponentially]
     */
    public static void main(String[] args) {
        
        int[] arr = {1,2,4,8,16,32,64,128,256};
        int index = interpolationSearch(arr,128);
        if (index != -1) {
            System.out.println("Element found at index "+index);            
        } else {
            System.out.println("Not found");
        }
        /*
        Probe 3
        Probe 5             this is one example i got, 4 probs to get, 
        Probe 6             also in one ex find the target in first prob
        Probe 7
        Element found at index 7
         */
    }
    private static int interpolationSearch(int[] array,int value){
        int high = array.length - 1;
        int low = 0;
        while (value >= array[low] && value <=array[high] && low <= high){
            // to understand this concept u should study this formula and
            // get the idea of data distribution
            int probe =low + (high-low)*(value - array[low])/(array[high]-array[low]);
            System.out.println("Probe "+probe);
            if (array[probe] == value) {
                return probe;
            }
            else if (array[probe] < value){
                low = probe + 1;
            } 
            else{
                high = probe - 1;
            }
        }
        return -1;
    }


}
