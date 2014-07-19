import static org.junit.Assert.*;

import org.junit.Test;


public class TestHelloWorld {

	@Test
	public void test() {
		Hello hello = new Hello();
		assertEquals("Hello", hello.say());
	}

}
