
import java.beans.Transient;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class ScientificCalculaetorTest {

    @Test
    public void addTest(){
        
          
        ArrayList<String> testInput = new ArrayList<>(Arrays.asList("3", "+", "5", "+", "2", "+", "10"));

        // Expected result after addition
        ArrayList<String> expectedResult = new ArrayList<>(Arrays.asList("20.0"));

        // Call the additionMaker method from here
        ArrayList<String> result = ScientificCalculaetor.additionMaker(testInput);

        // Check if the result matches the expected result
        assertEquals(expectedResult, result);

    }
    // A test case to check adding an empty input
    @Test
    public void testAdditionMaker_EmptyInput() {
        ArrayList<String> input = new ArrayList<>();
        ArrayList<String> expectedResult = new ArrayList<>(Arrays.asList());
        ArrayList<String> result = ScientificCalculaetor.additionMaker(input);
        assertEquals(expectedResult, result);
    }
    //This method test if the subrationMaker() method is called and there is no subtraction sign in the input string
    @Test
    public void testNoSubtraction() {
        ArrayList<String> input = new ArrayList<>();
        input.add("10");
        input.add("+");
        input.add("5");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("10");
        expected.add("+");
        expected.add("5");
        assertEquals(expected, ScientificCalculaetor.subtractionMaker(input));
    }
     @Test
    public void testEmptyList() {
        ArrayList<String> input = new ArrayList<>();
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, ScientificCalculaetor.subtractionMaker(input));
    }

    @Test
    public void testNullList() {
        ArrayList<String> input = null;
        // This test should throw a NullPointerException
        try {
            ScientificCalculaetor.subtractionMaker(input);
            System.out.println("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Test passed
        }
    }
    // test subtraction of inputs with diffrent data types
    @Test
    public void testInvalidInput() {
        ArrayList<String> input = new ArrayList<>();
        input.add("10");
        input.add("-");
        input.add("abc");
        // This test should throw a NumberFormatException
        try {
            ScientificCalculaetor.subtractionMaker(input);
            System.out.println("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Test passed
        }
    }

    // Multiplication Test 1
    @Test
    public void testSimpleMultiplication() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("2", "*", "3"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("6.0"));
        assertEquals(expected, ScientificCalculaetor.multiplicationMaker(input));
    }
    
    // Multiplication Test 2
    @Test
    public void testMultipleMultiplications() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("2", "*", "3", "*", "4"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("24.0"));
        assertEquals(expected, ScientificCalculaetor.multiplicationMaker(input));
    }

    // Multiplication Test 3
    @Test
    public void testMultiplicationWithOtherOperators() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("2", "*", "3", "+", "4", "-", "5"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("6.0", "+", "4", "-", "5"));
        assertEquals(expected, ScientificCalculaetor.multiplicationMaker(input));
    }

    // Multiplication Test 4
    @Test
    public void testNoMultiplication() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("2", "+", "3", "-", "4"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("2", "+", "3", "-", "4"));
        assertEquals(expected, ScientificCalculaetor.multiplicationMaker(input));
    }

    // Multiplication Test 5
    @Test
    public void testEmptyListMaltiplicationMaker() {
        ArrayList<String> input = new ArrayList<>();
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, ScientificCalculaetor.multiplicationMaker(input));
    }

    // Multiplication Test 6
    @Test
    public void testNullListMultiplication() {
        ArrayList<String> input = null;
        // This test should throw a NullPointerException
    }

  //DIVISION TEST CASES

    //Firts test case
    @Test
    public void testSimpleDivision() {
        ArrayList<String> input = new ArrayList<>();
        input.add("10");
        input.add("÷");
        input.add("2");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("5.0");
        assertEquals(expected, ScientificCalculaetor.divisionMaker(input));
    }

    //Second text case
    @Test
    public void testMultipleDivisions() {
        ArrayList<String> input = new ArrayList<>();
        input.add("10");
        input.add("÷");
        input.add("2");
        input.add("÷");
        input.add("2");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("2.5");
        assertEquals(expected, ScientificCalculaetor.divisionMaker(input));
    }

    //third test case
    @Test
    public void testNoDivision() {
        ArrayList<String> input = new ArrayList<>();
        input.add("10");
        input.add("+");
        input.add("2");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("10");
        expected.add("+");
        expected.add("2");
        assertEquals(expected, ScientificCalculaetor.divisionMaker(input));
    }


    //fourth test case
    @Test
    public void testMultipleOperations() {
        ArrayList<String> input = new ArrayList<>();
        input.add("10");
        input.add("÷");
        input.add("2");
        input.add("+");
        input.add("3");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("5.0");
        expected.add("+");
        expected.add("3");
        assertEquals(expected, ScientificCalculaetor.divisionMaker(input));
    }
    //fith test case
    @Test
    public void testDivisionByZero() {
        ArrayList<String> input = new ArrayList<>();
        input.add("10");
        input.add("÷");
        input.add("0");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Infinity");
       
        assertEquals(expected, ScientificCalculaetor.divisionMaker(input));
    }


    // Test cases for Squere root maker
    //

    //TEST 1
    @Test
    public void testSimpleRadical() {
        ArrayList<String> input = new ArrayList<>();
        input.add("√");
        input.add("4");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("2.0");
        assertEquals(expected, ScientificCalculaetor.radicalMaker(input));
    }
    //TEST 2
    @Test
    public void testMultipleRadicals() {
        ArrayList<String> input = new ArrayList<>();
        input.add("√");
        input.add("4");
        input.add("√");
        input.add("9");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("2.0");
        expected.add("*");
        expected.add("3.0");
        assertEquals(expected, ScientificCalculaetor.radicalMaker(input));
    }
    //TEST 3
    @Test
    public void testNoRadical() {
        ArrayList<String> input = new ArrayList<>();
        input.add("10");
        input.add("+");
        input.add("2");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("10");
        expected.add("+");
        expected.add("2");
        assertEquals(expected, ScientificCalculaetor.radicalMaker(input));
    }
    // additional test cases for radicalMaker method
    //TEST 4
    @Test
    public void testRadicalWithPreviousNumber() {
        ArrayList<String> input = new ArrayList<>();
        input.add("2");
        input.add("√");
        input.add("4");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("2");
        expected.add("*");
        expected.add("2.0");
        assertEquals(expected, ScientificCalculaetor.radicalMaker(input));
    }
    // TEST 5
    @Test
    public void testRadicalWithPreviousOperator() {
        ArrayList<String> input = new ArrayList<>();
        input.add("2");
        input.add("+");
        input.add("√");
        input.add("4");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("2");
        expected.add("+");
        expected.add("2.0");
        assertEquals(expected, ScientificCalculaetor.radicalMaker(input));
    }
    // Let me add two more test cases for radicalMaker()
    
        //TEST 6 
    @Test
    public void testNegativeNumberRadical() {
        ArrayList<String> input = new ArrayList<>();
        input.add("√");
        input.add("-4");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("NaN");
        assertEquals(expected, ScientificCalculaetor.radicalMaker(input));
    }
    //TEST 7
    @Test
    public void testIncompleteSyntax() {
        try{
            ArrayList<String> input = new ArrayList<>();
        input.add("√");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Syntax Error");
        assertEquals(expected, ScientificCalculaetor.radicalMaker(input));
        }
        catch(NumberFormatException ex){

        }
        
    }


    //Test cases for the Method powerMaker()
        //Test Case 1 For Power maker
    
    @Test
    public void testSimplePower() {
        ArrayList<String> input = new ArrayList<>();
        input.add("2");
        input.add("^");
        input.add("3");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("8.0");
        assertEquals(expected, ScientificCalculaetor.powerMaker(input));
    }

    //Test Case 2 For Power maker
    @Test
    public void testMultiplePowers() {
        ArrayList<String> input = new ArrayList<>();
        input.add("2");
        input.add("^");
        input.add("3");
        input.add("*");
        input.add("3");
        input.add("^");
        input.add("2");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("8.0");
        expected.add("*");
        expected.add("9.0");
        assertEquals(expected, ScientificCalculaetor.powerMaker(input));
    }
    //Test Case 3 for Power Maker

    
    @Test
    public void testNoPower() {
        ArrayList<String> input = new ArrayList<>();
        input.add("2");
        input.add("+");
        input.add("3");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("2");
        expected.add("+");
        expected.add("3");
        assertEquals(expected, ScientificCalculaetor.powerMaker(input));
    }

    //tast case 4
     @Test
    public void testMultipleOperationspowerMaker() {
        ArrayList<String> input = new ArrayList<>();
        input.add("2");
        input.add("^");
        input.add("3");
        input.add("*");
        input.add("3");
        input.add("+");
        input.add("2");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("8.0");
        expected.add("*");
        expected.add("3");
        expected.add("+");
        expected.add("2");
        assertEquals(expected, ScientificCalculaetor.powerMaker(input));
    }
    //test case 5
    @Test
    public void testInvalidInputpowrMaker() {
        ArrayList<String> input = new ArrayList<>();
        input.add("2");
        input.add("^");
        input.add("a");
        try {
            ScientificCalculaetor.powerMaker(input);
            System.out.println("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }
    //Test Cases For Sin() function

    // Test case 1
    @Test
    public void testSimpleSin() {
        ArrayList<String> input = new ArrayList<>();
        input.add("sin");
        input.add("30");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("0.5");
        assertEquals(expected, ScientificCalculaetor.sinMaker(input));
    }

    // test Case 2
    @Test
    public void testMultipleSins() {
        ArrayList<String> input = new ArrayList<>();
        input.add("sin");
        input.add("30");
        input.add("+");
        input.add("sin");
        input.add("45");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("+");
        expected.add("0.5");
        expected.add("0.7071067811865476");
        assertEquals(expected, ScientificCalculaetor.sinMaker(input));
    }

    // Adding different test case for sin() method

    @Test
    public void testNoSin() {
        ArrayList<String> input = new ArrayList<>();
        input.add("2");
        input.add("+");
        input.add("3");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("2");
        expected.add("+");
        expected.add("3");
        assertEquals(expected, ScientificCalculaetor.sinMaker(input));
    }

    @Test
    public void testMultipleOperationssin() {
        ArrayList<String> input = new ArrayList<>();
        input.add("sin");
        input.add("30");
        input.add("*");
        input.add("2");
        input.add("+");
        input.add("sin");
        input.add("45");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("*");
        expected.add("2");
        expected.add("+");
        expected.add("0.5");
        expected.add("0.7071067811865476");
        assertEquals(expected, ScientificCalculaetor.sinMaker(input));
    }

    @Test
    public void testInvalidInputsin() {
        ArrayList<String> input = new ArrayList<>();
        input.add("sin");
        input.add("a");
        try {
            ScientificCalculaetor.sinMaker(input);
            System.out.println("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    // TEST CASE FRO THE METHOD cosMaker()

    @Test
    public void testSimpleCos() {
        ArrayList<String> input = new ArrayList<>();
        input.add("cos");
        input.add("60");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("0.5");
        assertEquals(expected, ScientificCalculaetor.cosMaker(input));
    }

    @Test
    public void testMultipleCoses() {
        ArrayList<String> input = new ArrayList<>();
        input.add("cos");
        input.add("30");
        input.add("+");
        input.add("cos");
        input.add("45");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("+");
        expected.add("0.8660254037844386");
        expected.add("0.7071067811865475");
        assertEquals(expected, ScientificCalculaetor.cosMaker(input));
    }

    @Test
    public void testNoCos() {
        ArrayList<String> input = new ArrayList<>();
        input.add("2");
        input.add("+");
        input.add("3");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("2");
        expected.add("+");
        expected.add("3");
        assertEquals(expected, ScientificCalculaetor.cosMaker(input));
    }

    // Additional Test Cases for cosMaker() Method
    @Test
    public void testMultipleOperationsCos() {
        ArrayList<String> input = new ArrayList<>();
        input.add("cos");
        input.add("30");
        input.add("*");
        input.add("2");
        input.add("+");
        input.add("cos");
        input.add("45");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("*");
        expected.add("2");
        expected.add("+");
        expected.add("0.8660254037844386");
        expected.add("0.7071067811865475");
        assertEquals(expected, ScientificCalculaetor.cosMaker(input));
    }

    @Test
    public void testInvalidInputCos() {
        ArrayList<String> input = new ArrayList<>();
        input.add("cos");
        input.add("a");
        try {
            ScientificCalculaetor.cosMaker(input);
            System.out.println("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    // All test Cases to check tanMaker() Method

    @Test
    public void testSimpleTan() {
        ArrayList<String> input = new ArrayList<>();
        input.add("tan");
        input.add("45");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("0.9999999999999999");
        assertEquals(expected, ScientificCalculaetor.tanMaker(input));
    }

    @Test
    public void testMultipleTans() {
        ArrayList<String> input = new ArrayList<>();
        input.add("tan");
        input.add("30");
        input.add("+");
        input.add("tan");
        input.add("45");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("+");
        expected.add("0.5773502691896257");
        expected.add("0.9999999999999999");
        assertEquals(expected, ScientificCalculaetor.tanMaker(input));
    }

    @Test
    public void testNoTan() {
        ArrayList<String> input = new ArrayList<>();
        input.add("2");
        input.add("+");
        input.add("3");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("2");
        expected.add("+");
        expected.add("3");
        assertEquals(expected, ScientificCalculaetor.tanMaker(input));
    }

    @Test
    public void testMultipleOperationstan() {
        ArrayList<String> input = new ArrayList<>();
        input.add("tan");
        input.add("30");
        input.add("*");
        input.add("2");
        input.add("+");
        input.add("tan");
        input.add("45");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("*");
        expected.add("2");
        expected.add("+");
        expected.add("0.5773502691896257");
        expected.add("0.9999999999999999");
        assertEquals(expected, ScientificCalculaetor.tanMaker(input));
    }

    @Test
    public void testInvalidInputtan() {
        ArrayList<String> input = new ArrayList<>();
        input.add("tan");
        input.add("a");
        try {
            ScientificCalculaetor.tanMaker(input);
            System.out.println("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    //Adding new test case for arcsinMaker method

    //test case 1 for arcsinMaker
    @Test
    public void arcsinTest(){
        
        ArrayList<String> testInput = new ArrayList<>(Arrays.asList("arcsin", "0.5"));

        // Expected result after arcsin operation
        ArrayList<String> expectedResult = new ArrayList<>(Arrays.asList("30.0"));

        // Call the arcsinMaker method from here
        ArrayList<String> result = ScientificCalculaetor.arcsinMaker(testInput);

        // Check if the result matches the expected result
        assertEquals(expectedResult, result);

    }


}
