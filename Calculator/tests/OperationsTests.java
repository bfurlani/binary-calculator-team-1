
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationsTests {

    @Test
    public void squareRootTest(){
        Operations operation = new Operations();
        double result = operation.doSquareRoot(100);
        Assertions.assertEquals(result,10);
    }

    @Test
    public void doSquareTest(){
        Operations operation = new Operations();
        int result = operation.doSquare(12);
        Assertions.assertEquals(result, 144);
    }

    @Test
    public void testBackAndForth(){
        Operations operation = new Operations();
        double root = operation.doSquareRoot(100);
        int square = operation.doSquare(((int) root));
        Assertions.assertEquals(square,100);
    }

    @Test
    public void doAdditionTest(){
        Operations operation = new Operations();
        int result = operation.doAddition(40, 60);
        Assertions.assertEquals(result, 100);
    }

    @Test
    public void doSubtractionTest(){
        Operations operation = new Operations();
        int result = operation.doSubtraction(100, 60);
        Assertions.assertEquals(result, 40);
    }

    @Test
    public void multiplyTest(){
        Operations operation = new Operations();
        int result = operation.doMultiply(77, 89);
        Assertions.assertEquals(result, 77 * 89);
    }

    @Test
    public void DivideJustAboveOneTest(){
        Operations operation = new Operations();
        int result = operation.doDivide(90, 89);
        Assertions.assertEquals(result, 1);
    }

    @Test
    public void DivideOneTest(){
        Operations operation = new Operations();
        int result = operation.doDivide(90, 90);
        Assertions.assertEquals(result, 1);
    }

    @Test
    public void DivideJustBelowOneTest(){
        Operations operation = new Operations();
        int result = operation.doDivide(89, 90);
        Assertions.assertEquals(result, 0);
    }

    @Test
    public void DivideByZeroTest(){
        Operations operation = new Operations();
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            operation.doDivide(1, 0);
        });

        String expectedMessage = "Divide by 0 Error";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void DivideZeroBySomethingTest(){
        Operations operation = new Operations();
        int result = operation.doDivide(0, 12);
        Assertions.assertEquals(result, 0);
    }
}
