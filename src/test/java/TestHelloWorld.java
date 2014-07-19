import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.jenkin.Hello;


public class TestHelloWorld {

	@Test
	public void test() {
		Hello hello = new Hello();
		assertEquals("Hello4", hello.say());
        // TODO: Remove this later
	}

}
