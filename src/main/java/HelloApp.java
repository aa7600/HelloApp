/**
 * HelloApp.java
 * UC1: Display "Hello World"
 * UC2: Display Hello with command-line argument
 * UC3: Display Hello with command-line argument or default value
 */

public class HelloApp {

    public static void main(String[] args) {

        // Default name
        String name = "World";

        // Check if argument exists
        if (args.length > 0) {
            name = args[0];
        }

        System.out.println("Hello, " + name + "!");
    }
}