package Hotel;

import java.util.List;
import java.util.ArrayList;

public class BookingManager {

    //Atribut
    private List<Reservation> reservations = new ArrayList<>();

    //Constructor
    public BookingManager() {this.reservations = new ArrayList<>();}


    //Add a reservation to the list
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    //Get a 'reservation' with a given index from the list
    public Reservation getBooking(int index) {
        if (index >= 0 && index < reservations.size()) {
            return reservations.get(index);
        } else {
            System.out.println("Invalid index.");
            return null;
        }
    }

   //Get the list of the reservations
   public List<Reservation> getReservations() {
       return reservations;
   }

    //Delete the list of reservations
    public void clearReservations() {
        reservations.clear();
    }


    //Number of bookings for business stay - where getIsVacation is NOT true
    public int getNumberOfWorkingReservations() {
        int count = 0;
        for (Reservation reservation : reservations) {
            if (!reservation.getIsVacation()) {
                count++;
            }
        }
        return count;
    }


    //Goes through all reservations and returns the average number of guests per reservation as a result.
    public double getAverageGuests() {
        if (reservations == null || reservations.isEmpty()) {
            return 0.0; // Return 0 if there are no reservations
        }
        int totalGuests = 0;
        for (Reservation reservation : reservations) {
            totalGuests += reservation.getNumberOfGuests();
        }

        return (double) totalGuests / reservations.size();
    }






}

