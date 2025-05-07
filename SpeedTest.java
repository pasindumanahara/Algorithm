
// THIS WILL CHECK THE SPEED DIFERENCE BETWEEN
// ARRAY LISTS AND LINKED LISTS
// **CONCLUSION**
// *accessing an element is always faster in array lists
// *removing element will take less time in linked lists
// (because in array lists we have to manually increment index in array lists
// when elements are less could be faster)


import java.util.ArrayList;
import java.util.LinkedList;

public class SpeedTest{
    public static void main(String[] args) {
      LinkedList<Integer> linkedList = new LinkedList<>();
      ArrayList<Integer> arrayList = new ArrayList<>();

      long startTime;
      long endTime;
      long elapsedTime;
      for(int i = 0 ; i  < 100; i++)
      { 
        linkedList.add(i);
        arrayList.add(i);
      }
      // for array lists
      startTime = System.nanoTime();
      
      arrayList.get(0);

      endTime = System.nanoTime();
      
      long elapsed = endTime-startTime; 
      System.out.println( "Array lists "+elapsed+"ns");
      
      // for linked lists
      startTime = System.nanoTime();
      //
      linkedList.get(0);
      endTime = System.nanoTime();
      //
      elapsed = endTime-startTime; 
      System.out.println( "Linked lists "+elapsed+"ns");
    }
}