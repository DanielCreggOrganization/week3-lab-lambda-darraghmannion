package ie.atu.lambda;

public class ToUpperCase{
    public static void main(String[] args) {
        // Replace ToUpperCase with a lambda expression that converts the string to uppercase
        StringOperation toUpperCase = s -> s.toUpperCase();

        // Test the lambda with a sample string
        String result = toUpperCase.apply("hello world");
        System.out.println(result);  // Output: HELLO WORLD
    }
}
