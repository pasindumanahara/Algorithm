public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {2,1,3,4,6,5,8,7,9};
        bubbleSort(array);
        for (int i : array){
            System.out.print(i+ " " );
        }
        
    }
    public static void bubbleSort(int array[]){
        for (int i = 0 ; i< array.length ; i++){
            for (int j = 0 ; j<array.length -i-1 ; j++){
                if (array[i]<array[j]){
                    int temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }        
}
