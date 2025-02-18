public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = 0;
        try {
            z = x / y;
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero!");
            // Handle the exception appropriately.  Log it, return a default value, or perform other recovery actions.
            z = Integer.MAX_VALUE; //Example of setting a default value
        }
        System.out.println(z);
    }
}