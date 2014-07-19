import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.jenkin.GradeCalCulator;

public class TestGradeAB {
	
	GradeCalCulator obj = null;
	
	@Before
    public void setUp() {
		obj = new GradeCalCulator();
    }
	
	@Test
	public void test_Grade_A_Plus_101() {
		assertEquals("error", obj.showGrade(101));
	}
	
	@Test
	public void test_Grade_A_Plus_100() {
		assertEquals("A+", obj.showGrade(100));
	}
	
	@Test
	public void test_Grade_A_Plus_99() {
		assertEquals("A+", obj.showGrade(99));
	}
	
	@Test
	public void test_Grade_A_Plus_95() {
		assertEquals("A+", obj.showGrade(95));
	}
	
	@Test
	public void test_Grade_A_94() {
		assertEquals("A", obj.showGrade(94));
	}
	
	@Test
	public void test_Grade_A_85() {
		assertEquals("A", obj.showGrade(85));
	}
	
	@Test
	public void test_Grade_A_Minus_84() {
		assertEquals("A-", obj.showGrade(84));
	}
	
	@Test
	public void test_Grade_A_Minus_80() {
		assertEquals("A-", obj.showGrade(80));
	}
	
	@Test
	public void test_Grade_B_79() {
		assertEquals("B", obj.showGrade(79));
	}
	
	@Test
	public void test_Grade_B_70() {
		assertEquals("B", obj.showGrade(70));
	}

}
