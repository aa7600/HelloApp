\# HelloApp



HelloApp is a simple Java console application developed step-by-step using multiple use cases. The project demonstrates core Java concepts such as command-line arguments, conditional logic, loops, and string handling.



\---



\## 📌 Features (Use Cases)



\### UC1: Display "Hello World"

Prints a basic greeting message to the console.



\### UC2: Display Hello with Name

Accepts a single command-line argument and displays:

Hello, <name>!



\### UC3: Default Greeting

Handles missing input by displaying:

Hello, World!



\### UC4: Multiple Names

Accepts multiple names and displays them in a single greeting:

Hello, Alice, Bob, Charlie!



\### UC5: Enhanced For Loop

Uses an enhanced for loop (for-each) to process multiple arguments efficiently.



\---



\## ⚙️ Technologies Used



\- Java (JDK 17)

\- Maven (Build Tool)

\- Git \& GitHub (Version Control)



\---



\## ▶️ How to Run



\### Compile the project



mvn compile



\### Run the application



With no arguments:

mvn exec:java



With one argument:

mvn exec:java -Dexec.args="Alice"



With multiple arguments:

mvn exec:java -Dexec.args="Alice Bob Charlie"



\---

