package v1;

import java.time.LocalDate;

public class DateRange {
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	DateRange(LocalDate checkIn, LocalDate checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	boolean overLaps(DateRange other) {
		return checkIn.isBefore(other.checkOut) && other.checkIn.isBefore(checkOut); 
	}
}
