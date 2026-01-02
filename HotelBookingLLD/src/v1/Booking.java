package v1;

public class Booking {
	protected String bookingId;
	protected User user;
	protected Room room;
	DateRange dateRange;
	
	Booking(String bookingId, User user, Room room, DateRange dateRange) {
		this.bookingId = bookingId;
		this.user = user;
		this.room = room;
		this.dateRange = dateRange;
	}
	
	DateRange getDateRage() {
		return dateRange;
	}
}
