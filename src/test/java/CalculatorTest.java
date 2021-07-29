import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    CalculatorService service = Mockito.mock

    Calculator c = new Calculator(service);


    @Test
    void testAdd() {
        assertEquals(10,c.add(2,3));
    }
}