import static org.junit.Assert.*;

import org.junit.Test;

import com.jenkin.Hello;


public class TestHelloWorld {

	@Test
	public void test() {
		Hello hello = new Hello();
		assertEquals("Hello", hello.say());
	}

}
