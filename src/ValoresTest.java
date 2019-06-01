import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;


public class ValoresTest extends TestCase {
	
	private Valores val;

	@Test
	public void setUp() throws Exception {
		super.setUp();
		val = new Valores();
		val.ins(2);
		val.ins(2);
		val.ins(2);
		val.ins(2);
		val.ins(2);
		val.ins(2);
		val.ins(2);
		val.ins(2);
		//val.ins(300000);
		val.ins(2);
			
	}
	public void testIns(){
		assertEquals("Consegui inserir!",true,val.ins(2));
	}
	public void testSize() {
		assertEquals(9,val.size());
	}
//	public void testMedia() {
//		assertEquals(9,val.mean());
//	}
	public void testDel() {
		assertEquals(2,val.del(2));
	}
//	public void testMaior() {
//		assertEquals(2,val.greater());
//	}
//	public void testLower() {
//		assertEquals(2,val.lower());
//	}
	
	
	
		

}
