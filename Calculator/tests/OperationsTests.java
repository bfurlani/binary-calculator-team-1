
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
}