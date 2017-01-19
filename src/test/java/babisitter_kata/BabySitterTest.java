package babisitter_kata;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BabySitterTest {

	/*private BabySitter testObject;
	
	@Before
	public void executeThisBeforeEachTest(){
		testObject = new BabySitter();
	}
	*/
	
	@Test
	public void shouldValidateLengthFromEarliestStartTimeToMidNight(){
		
		BabySitter testObject = new BabySitter();
		assertEquals(7,testObject.validateShiftLengthfromRegularStartTimeToMidnight());
	}
	
	@Test
	public void shouldValidateLengthFromMidnightToLatestEndTime(){
		
		BabySitter testObject = new BabySitter();
		assertEquals(4,testObject.validateShiftLengthfromMidnightToLatestEndTime());
	}
	
	
}
