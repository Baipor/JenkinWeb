import com.jenkin.Multiplication;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMultiplicationX {
    @Test
    public void test() {
        Multiplication multiplication = new Multiplication();
        assertEquals(8, multiplication.multiply(2,4));
    }
}
