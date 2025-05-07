public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;
    public DynamicArray(){
        this.array = new Object[capacity];
    }
    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }   
    public void add(Object data){
        if(size>=capacity){
            grow();
        }
        array[size] = data;
        size++;
    }
    public void insert(int index, Object data){
        if(size>=capacity)
        {
            grow();
        }
        for(int i = size; i>index;i--){
            array[i] = array[i-1];
        }
        array[index]  = data;
        size++;
    }
    public void delete(Object data){
        for(int i = 0; i<size;i++){
           if (array[i] == data ){
            for(int j = 0 ; j<size-i -1 ; j++)
            {
                array[i+j] = array[i+j+1];
            }
            array[size-1] = null;
            size--;
            if(size <=  (int) (capacity/3))
            {
                shrink();
            }
            break;
           }
        }
    }
    public int search(Object data){
        // just a for loop for finding the element and if found that
        // return the index of it or return -1 for not found that (classic) 
        return -1;
    }
    private void grow(){
        int newCapacity  = (int)(capacity*2);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0 ;i<size ; i++){
            newArray[i] = array[i];
        }
        array = newArray;
        capacity = newCapacity; // updating the new capacity
    }
    private void shrink(){
        int newCapacity  = (int)(capacity/2);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0 ;i<size ; i++){
            newArray[i] = array[i];
        }
        array = newArray;
        capacity = newCapacity;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    // this naming is very important when prit called 
    // explicilty this toStrig will call, it's d name so
    // something that do same but another name won't

    public String toString() {
        String string = "";
        for(int i = 0 ; i<size ; i++ )
        {
            string+=array[i]+", ";
        }
        if (string != "")
        {
            string = "[" +string.substring(0,string.length()-2)+ "]";
        }
        return string;
    }
    

    // just for demonstration perposes called this in own file, 
    // 
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(4);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C"); 
        dynamicArray.add("C"); 
        dynamicArray.add("C"); 
        dynamicArray.delete("A");
        dynamicArray.delete("C"); 
        
        
        System.out.println(dynamicArray);
            
    }
}


