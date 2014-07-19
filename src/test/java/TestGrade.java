import static org.junit.Assert.*;

import org.junit.Test;

import com.jenkin.GradeCalCulator;

import CalculatorSum.CalculatorSum;


public class TestGrade {

	@Test
	public void testGrade_F0() {		
		GradeCalCulator cal = new GradeCalCulator();
		assertEquals("F", cal.showGrade(0));
        // TODO: Remove this later
	}
	
	@Test
	public void testGrade_F39() {		
		GradeCalCulator cal = new GradeCalCulator();
		assertEquals("F", cal.showGrade(39));
        // TODO: Remove this later
	}


	@Test
	public void testGrade_FP40() {		
		GradeCalCulator cal = new GradeCalCulator();
		assertEquals("F+", cal.showGrade(40));
        // TODO: Remove this later
	}
	
	@Test
	public void testGrade_FP49() {		
		GradeCalCulator cal = new GradeCalCulator();
		assertEquals("F+", cal.showGrade(49));
        // TODO: Remove this later
	}
	
	
   @Test
    public void testGrade_C() {
        GradeCalCulator cal = new GradeCalCulator();
        assertEquals("C", cal.showGrade(69));
    }

    @Test
    public void testGrade_D() {
        GradeCalCulator cal = new GradeCalCulator();
        assertEquals("D", cal.showGrade(59));
    }

    @Test
    public void testGrade_DPlus() {
        GradeCalCulator cal = new GradeCalCulator();
        assertEquals("D+", cal.showGrade(64));
    }

    @Test
    public void testGrade_DMinus() {
        GradeCalCulator cal = new GradeCalCulator();
        assertEquals("D-", cal.showGrade(54));
    }


}
