package Hotel;

import java.util.List;
import java.util.ArrayList;

public class BookingManager {

    //Atribut
    private List<Reservation> reservations = new ArrayList<>();


    //1. add a reservation to the list
    public void addReservation(Reservation newReservation) {
        reservations.add(newReservation);
    }

    //2. get a 'reservation' with a given index from the list
    public Reservation getReservationIndex(int index) {
        if (index >= 0 && index < reservations.size()) {
            return reservations.get(index);
        } else {
            System.out.println("Invalid index.");
            return null;
        }
    }

    // 3. get a list of reservations
    public List<Reservation> getReservations() {
        return new ArrayList<>(reservations);
    }


    // 4. delete list of reservation
    public void clearReservations() {
        reservations.clear();
    }

    //statistics methods

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

