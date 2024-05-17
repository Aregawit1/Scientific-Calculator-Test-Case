Scientific Calculator Git collaboration and Testing demonstration

Description
This project demonstrates the process of testing and Test-Driven Development (TDD) using JUnit testing, as well as the collaboration workflow on Git and GitHub. The repository contains two Java classes: a `ScientificCalculaetor` class that implements various scientific calculator operations, and a `ScientificCalculaetorTest` class that includes JUnit test cases for the calculator methods.

Table of Contents
1. [Installation]
2. [Usage]
3. [Testing]
4. [Contributing]
5. [Credits]
6. [Contact](#contact)

Installation
To set up the project, follow these steps:

1. Clone the repository:
   ```
   git clone https://github.com/HenokGm/Scientific-Calculator-Test-Case
   ```
2. Ensure you have Java JDK installed and the environment variables set up correctly.

Usage
To use the project, you need to run the JUnit tests. Follow these steps:

1. Compile the `ScientificCalculatorTest.java` file:
   ```
   javac -cp ".;junit-4.13.2.jar" ScientificCalculaetorTest.java
   ```
2. Run the JUnit tests:
   ```
   java -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar;" org.junit.runner.JUnitCore ScientificCalculaetorTest
   ```
   This will execute the test cases and display the results.

Testing
The project uses JUnit 4.13.2 and Hamcrest Core 1.3 for testing the `ScientificCalculaetor` class. The `ScientificCalculaetorTest` class contains various test cases covering different scenarios and operations.

Contributing
The collaboration on this project was done through the following process:

1. Each contributor forked the repository.
2. Contributors made changes, fixes, or additions to the code.
3. Contributors created pull requests to the main repository.
4. The main repository owner reviewed the pull requests and merged them if they were approved.

There were a total of 5 contributors to this project, who were members of the group.

Credits
This project utilizes the following third-party libraries:
- JUnit 4.13.2
- Hamcrest Core 1.3

Contact us
For any questions or inquiries, please contact:
Henok G. Mariam
henokgmariam7@gmail.com
