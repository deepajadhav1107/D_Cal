package Calculator;
public class DivisionOperation {
    public static void main(String[] args) {
        int a = 15;
        int b = 0;  // Change this to test divide-by-zero

        try {
            int div = a / b;
            System.out.println("Division: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
