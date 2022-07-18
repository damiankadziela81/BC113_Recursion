public class Main {

    // recursion = When a thing is defined in terms of itself. - Wikipedia
    //      Apply the result of a procedure, to a procedure.
    //      A recursive method calls itself. Can be a substitute for iteration.
    //      Divide a problem into sub-problems of the same type as the original.
    //      Commonly used with advanced sorting algorithms and navigating trees

    //      Advantages
    //      ----------
    //      easier to read/write
    //      easier to debug

    //      Disadvantages
    //      ----------
    //      sometimes slower
    //      uses more memory
    //      because of Call Stack (too many calls will cause stack overflow)

    //*****************************************************************
    //                      iteration               recursion
    //-----------------------------------------------------------------
    // implementation       uses loops              calls itself
    //-----------------------------------------------------------------
    // state                control index           parameter values
    //                      (int steps=0)           walk(int steps)
    //-----------------------------------------------------------------
    // progression          moves towards value     converge towards
    //                      in condition            base case
    //-----------------------------------------------------------------
    // termination          index satisfies         base case = true
    //                      condition
    //-----------------------------------------------------------------
    // size                 more code               less code
    //                      less memory             more memory
    //-----------------------------------------------------------------
    // speed                faster                  slower

    public static void main(String[] args){

        walkIterative(5);

        walkRecursive(5);

        System.out.println(factorial(7));

        System.out.println(power(2, 8));
    }

    private static int power(int base, int exponent) {
        if (exponent < 1) return 1;
        return base * power(base,exponent - 1);
    }

    private static int factorial(int num) {
        if (num < 1) return 1;  //base case
        return num * factorial(num - 1);  //recursive case

    }

    private static void walkRecursive(int steps) {
        if(steps<1) return; //base case
        System.out.println("You take a step.");
        walkRecursive(steps-1);  //recursive case
    }

    private static void walkIterative(int steps) {
        for(int i = 0; i < steps; i++){
            System.out.println("You take a step");
        }
    }
}
