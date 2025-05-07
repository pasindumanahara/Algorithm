public class Recrusion {
    /*
     * a recrusion method will call itself. can be substitute for iteration,
     * Advantages - easier to read / write
     * Disadvantages - sometimes slower / uses more money
     * 
     *  THERE'S A HIGH CHANCE TO RUN OUT OF MEMORY
     *  
     */

     // this is the example for iteration
    private static void walk(int steps){
        for (int i = 0 ; i < steps ; i++ ){
            System.out.println("You take a step");
        }
    }
    // for recrusion demonstration
    private static void run(int steps){
        if (steps < 1)
            return;
        System.out.println("You took a step");
        run(steps-1);
    }
    // another example for recrusion
    public static int  factorial(int num){
        if (num < 1)
            return 1;
        return num*factorial(num-1);
    }
    
    public static void main(String[] args) {
        walk(4); // iteration example
        run(4); // recrusion
        System.out.println(factorial(4));
        
    }

}
