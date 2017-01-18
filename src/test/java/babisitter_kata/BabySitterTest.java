package babisitter_kata;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BabySitterTest {

	private BabySitter testObject;
	
	@Before
	public void executeThisBeforeEachTest(){
		testObject = new BabySitter();
	}
	
	
	@Test
	public void shouldValidateLengthFromRegularStartTimeToMidNight(){
		assertEquals(0,testObject.validateShiftLengthfromRegularStartTimeToMidnight());
	}
	
	@Test
	public void shouldValidateEarliestStartTime(){
		assertEquals(5, testObject.validateEarliestStartTime());
	}
}
