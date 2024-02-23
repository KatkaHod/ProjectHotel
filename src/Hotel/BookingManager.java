package Hotel;

import java.util.List;
import java.util.ArrayList;

public class BookingManager {

    //Atribut
    private List<Reservation> reservations = new ArrayList<>();


    //Add a reservation to the list
    public void addBooking(Reservation reservation) {
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






}

