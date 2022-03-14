import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitsTest {
    @Test
    public void testIfMario() {
        String expected = "Mario";
        String actual = "Mario";

        assertEquals(expected, actual);
    }

    @Test
    public void checkIfChangeIsCorrect(){
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertEquals(4.9, price - discount, 0.9);
    }
}
