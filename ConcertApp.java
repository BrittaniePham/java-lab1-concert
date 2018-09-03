package lab1_concert;

public class ConcertApp {
	
	public static void main(String[] args) {
		Time start = new Time(18, 30, 00);
		Time end = new Time(21, 00, 00);
		Concert concert1 = new Concert("Britt is Cool", start, end);
		System.out.println(concert1);
	}
}
