public class LinearSearch {
    /*
     * linear search : iterate through a collection , one element at a time
     * 
     * runtime complexity - O(n)
     * Disadvantages: Slow for large data sets
     * Advantages: Fast for small data sets
     *             Does not need to sorted
     *             Usefull for data sets that does not have random access
     *             (Linked lists)  
     */
    public static void main(String[] args) {
        int[] numbers = {42, 87, 15, 93, 56, 78, 12, 67, 99, 23, 34, 71, 5, 88, 29, 61, 47, 90, 14, 39};
        int index = linearSearch(numbers,14);
        if(index != -1 )
        {
            System.out.println("element has found");
        }        

    }

    private static int linearSearch(int arr[], int x){

        for (int i = 0 ; i<arr.length;i++)
        {
            if (arr[i]==x) {
                return i;
            }
        }
        return -1;
    }

}
