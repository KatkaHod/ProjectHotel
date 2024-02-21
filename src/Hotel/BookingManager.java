package Hotel;

import java.util.List;
import java.util.ArrayList;

public class BookingManager {
    private static  ArrayList<Reservation> reservations;


    public BookingManager() {
        this.reservations = new ArrayList<>();
    }

    public void addReservation(Reservation newReservation){
        reservations.add(newReservation);
    }

    public List<Reservation> getListReservation() {
        return new ArrayList<>(reservations);
    }


    //Method for retrieving a reservation from an index list
    public Reservation getBooking(int index) {
        if (index >= 0 && index < reservations.size()) {
            return reservations.get(index);
        } else {
            return null;
        }
    }

    public void clearReservation() {
        reservations.clear();
    }
    public void removeReservation(Reservation reservation) {
        reservations.remove(reservation);
    }




}

