
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
    


}
