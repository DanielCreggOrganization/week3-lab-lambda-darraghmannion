package ie.atu.lambda;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> trim = s -> s.trim();
        Function<String, String> replaceSpaces = s -> s.replace(" ", "-");
        Function<String, String> toLowerCase = s -> s.toLowerCase();

        // Combine the lambdas
        Function<String, String> combinedOperation = trim.andThen(replaceSpaces).andThen(toLowerCase);

        // Test the combined operation
        String result = combinedOperation.apply("   Hello World From Lambda   ");
        System.out.println("Result: " + result);
    }
}