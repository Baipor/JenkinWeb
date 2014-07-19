import static org.junit.Assert.*;

import org.junit.Test;

import com.jenkin.GradeCalCulator;

import CalculatorSum.CalculatorSum;


public class TestGrade {

	@Test
	public void testGrade_F() {		
		GradeCalCulator cal = new GradeCalCulator();
		assertEquals("F", cal.showGrade(39));
        // TODO: Remove this later
	}
	
	@Test
	public void testGrade_FPluss() {		
		GradeCalCulator cal = new GradeCalCulator();
		assertEquals("F+", cal.showGrade(39));
        // TODO: Remove this later
	}

}
