/**
 * HelloApp.java
 * UC1: Display "Hello World"
 * UC2: Display "Hello" with command-line argument
 */

public class HelloApp {

    public static void main(String[] args) {

        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World!");
        }

    }
}