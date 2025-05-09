import java.util.Hashtable;

public class  HashTablesDemo{
    public static void main(String[] args) {
        // initial capacity 11, dynamically spand 
        Hashtable<Integer,String> table = new Hashtable<>(10); 

        table.put(100,"brocode");
        table.put(123,"patrik");

        System.out.println(table.get(100));

        // iterate over all the elements
        // this will be an array of our keys - table.keys()
        for (Integer key : table.keySet() ){
            System.out.println(key + "\t"+table.get(key));
        }
        /**
         * IN HASH TABLES every element has it's own index value, it depend on the 
         * key % (size of the hash table), in this case there is a chance of multiple
         * elements having the same index. When that happen all of those element will 
         * include under the same index using Linked lists.
         * In this ex u can calculate the index by - key.hashCode()%10 this
         * 
         * TO AVOID COLLISIONS U CAN INCRESE THE SIZE OF THE HASH TABLE. YET THOSE WILL 
         * TAKE MORE SPACE.
         * 
         * Runtime complexity: Best case O(1)
         *                     Worst case O(n)
         * 
         */
        for (Integer key : table.keySet() ){
            System.out.println(key.hashCode()%10+ "\t"+table.get(key));
        }
        
    }
}