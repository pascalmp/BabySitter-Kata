package babisitter_kata;

import org.junit.Before;
import org.junit.Test;

public class BabySitterTest {

	private BabySitter testObject;
	
	@Before
	public void executeThisBeforeEachTest(){
		testObject = new BabySitter();
	}
	
	/*To avoid the midnight disruption on time counting,
	 *I create a method that coverst time to a 0 to 11 scale
	 */
	@Test
	public void shouldConvertTime5to0(){
		assertEquals(0, testObject.convertTime(5));
	}
}
