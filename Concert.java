package lab1_concert;

public class Concert {

	private String name;
	private Time startTime;
	private Time endTime;

	public Concert(String n, Time start, Time end) {
		name = n;
		startTime = start;
		endTime = end;
	}

	public String getName() {
		return name;
	}

	public Time getStartTime() {
		return startTime;
	}

	public Time getEndTime() {
		return endTime;
	}
	
	@Override
	public String toString() {
		return "The " + getName() + " concert starts at " + getStartTime() + " and ends at " + getEndTime();
	}

}
