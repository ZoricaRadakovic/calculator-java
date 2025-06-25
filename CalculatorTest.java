import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest{
    @Test
    public void testmultiplication(){
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(5,5);
        assertEquals(25, result,"5*5 should equal 25");
        }
    }