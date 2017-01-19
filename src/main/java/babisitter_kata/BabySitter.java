package babisitter_kata;

public class BabySitter {

	public static void main(String[] args) {

	}
	private static final int EARLIEST_START_TIME_TO_MIDNIGHT_LENGTH_IN_HOURS = 7;
	private static final int MIDNIGHT_TO_LATEST_END_TIME_IN_HOURS = 4;
	private static final int EARLIEST_START_TO_LATEST_START_LENGTH_IN_HOURS = 11;
	
	private int shiftStartTime;
	private int babyBedTime;
	private int shiftEndTime;
	
	private static final int START_TIME_PAY_RATE = 12;
	private static final int BED_TIME_PAY_RATE = 8;
	private static final int END_TIME_PAY_RATE = 16;
	
	
	
	

	public int validateShiftLengthfromRegularStartTimeToMidnight() {
		return EARLIEST_START_TIME_TO_MIDNIGHT_LENGTH_IN_HOURS;
			
	}

	public Object validateShiftLengthfromMidnightToLatestEndTime() {
		return MIDNIGHT_TO_LATEST_END_TIME_IN_HOURS;
	}

}
