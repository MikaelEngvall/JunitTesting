package se.lexicon;

// Main.java
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = calculator.add(3, 5);
        System.out.println("Addition result: " + result1);

        int result2 = calculator.subtract(10, 4);
        System.out.println("Subtraction result: " + result2);
    }
}
