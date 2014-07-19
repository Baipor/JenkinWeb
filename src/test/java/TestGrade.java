import com.jenkin.GradeCalCulator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


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
