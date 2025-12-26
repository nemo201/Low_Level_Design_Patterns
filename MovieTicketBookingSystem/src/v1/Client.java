package v1;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie = new Movie("M1", "Inception", 148);
		
		List<Seat> seats = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			seats.add(new Seat("A" + i));
		}
		
		Screen screen = new Screen("S1", seats);
		
		Theatre theatre = new Theatre("Cineplex", List.of(screen));
		
		Show show = new Show("SH1", movie, screen, "7:00 PM");
		
		BookingService bookingService = new BookingService();
		
		System.out.println("Available seats before booking:");
		show.getScreen().getAvailableSeats().forEach(seat -> System.out.print(seat.getSeatNumber() + " "));
		System.out.println();
		
		try {
			List<String> seatsToBook = List.of("A1", "A2", "A3");
			
			Ticket ticket = bookingService.bookSeats(show, seatsToBook);
			
			System.out.println("\nBooking successful! Here is your ticket:");
			ticket.printTicket();
		} catch (IllegalArgumentException e) {
			System.out.println("Booking failed: " + e.getMessage());
		}
		
		System.out.println("\nAvailable seats after booking:");
		show.getScreen().getAvailableSeats().forEach(seat -> System.out.print(seat.getSeatNumber() + " "));
		System.out.println();
		
		BookingService faultyBookingService = new BookingService();
		try {
			List<String> seatsToBook = List.of("A2", "A4");
			
			Ticket ticket = faultyBookingService.bookSeats(show, seatsToBook);
			
			System.out.println("\nBooking successful! Here is your ticket:");
			ticket.printTicket();
		} catch (IllegalArgumentException e) {
			System.out.println("\nBooking failed: " + e.getMessage());
		}
	}

}
