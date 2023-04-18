package FileWriter;

public class SumOfArgs {
    public static void main(String[] args) {
        // Write a program that prints the sum of the numbers from all arguments
        // Example: java SumOfArgs 1 2 3 4 5 asf
        // Output: 15 not a numeric value

        int sum = 0;
    //
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                System.out.println("not a numeric value");
            }
        }
        System.out.println(sum);
    }
    }

