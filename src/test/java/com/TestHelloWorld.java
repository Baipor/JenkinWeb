import com.jenkin.Hello;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestHelloWorld {

	@Test
	public void test() {
		Hello hello = new Hello();
		assertEquals("Hello", hello.say());
        // TODO: Remove this later
	}

}
