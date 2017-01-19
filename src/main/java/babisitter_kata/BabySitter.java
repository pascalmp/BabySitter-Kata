package babisitter_kata;

public class BabySitter {

	public static void main(String[] args) {

	}
	private static final int EARLIEST_START_TIME_TO_MIDNIGHT_LENGTH_IN_HOURS = 7;
	private static final int MIDNIGHT_TO_LATEST_END_TIME_IN_HOURS = 4;
	private static final int EARLIEST_START_TO_LATEST_START_LENGTH_IN_HOURS = 11;
	
	private int startTime;
	private int bedTime;
	private int endTime;
	
	private int startTimePay = 12;
	private int bedTimePay = 8;
	private int midNightPay = 16;

	public int validateShiftLengthfromRegularStartTimeToMidnight() {
		return EARLIEST_START_TIME_TO_MIDNIGHT_LENGTH_IN_HOURS;
		
		
		
		
	}

	public Object validateShiftLengthfromMidnightToLatestEndTime() {
		return MIDNIGHT_TO_LATEST_END_TIME_IN_HOURS;
	}

}
