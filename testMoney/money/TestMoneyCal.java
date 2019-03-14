
package money;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestMoneyCal {
	 private static Moneycal cal = new Moneycal();
	 @Test
	 public void testMoney(){
	        cal.moneycal(10);
	        assertEquals(1, cal.getReuslt());
	        cal.clear();
	        cal.moneycal(100);
	        assertEquals(0, cal.getReuslt());
	        cal.clear();
	        cal.moneycal(73);
	        assertEquals(1, cal.getReuslt());
	        cal.clear();
	        cal.moneycal(62);
	        assertEquals(1, cal.getReuslt());
	        cal.clear();
	        cal.moneycal(81);
	        assertEquals(1, cal.getReuslt());
	        cal.clear();
	        cal.moneycal(12);
	        assertEquals(1, cal.getReuslt());
	        cal.clear();
	        cal.moneycal(79);
	        assertEquals(0, cal.getReuslt());
	        cal.clear();
	        cal.moneycal(29);
	        assertEquals(0, cal.getReuslt());
	        cal.clear();
	        cal.moneycal(26);
	        assertEquals(1, cal.getReuslt());
	        cal.clear();
	        cal.moneycal(0);
	        assertEquals(0, cal.getReuslt());
	        cal.clear();
	        cal.moneycal(9);
	        assertEquals(0, cal.getReuslt());
	        cal.clear();
	        }
}
