package Hotel;

import java.util.List;
import java.util.ArrayList;

public class BookingManager {
    private final List<Reservation> reservations;


    //constructor
    public BookingManager() {
        this.reservations = new ArrayList<>();
    }

    //method add reservation
    public void addReservation(Reservation reservation){
        reservations.add(reservation);
    }

    public void getBookings(){
        for (Reservation reservation : reservations ) {
            System.out.println("Number of Room: " + reservation.getRoom().getNumberOfRoom());
            System.out.println("Check-in: " + reservation.getCheckIn());
            System.out.println("Check-out: " + reservation.getCheckOut());
            System.out.println("Type of journey: " + reservation.getIsVacation());

            System.out.println("list of Guests: ");
            for (Guest guest : reservation.getGuests()) {
                System.out.println("  " + guest.getName() + " " + guest.getSurname());
            }
            System.out.println("********************");
        }
    }
    public void clearBookings() {
    }

    public void getNumberOfWorkingBookings() {

    }


    public void getNumberOfGuests() {

    }
    public void getAverageGuests() {

    }




}

