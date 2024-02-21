import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import Hotel.BookingManager;
import Hotel.Guest;
import Hotel.Reservation;
import Hotel.Room;

public class Main {
    public static void main(String[] args) {

        //Instances of the Classes: Guest, Room, Reservation and BookingManager
        BookingManager bookingManager = new BookingManager();

        Guest guest1 = new Guest("Adela", "Malikova", LocalDate.of(1993, 3,13));
        Guest guest2 = new Guest("Jan", "Dvorak", LocalDate.of(1995,5,5));


        Room room1 = new Room(1,1,BigDecimal.valueOf(1000),true,true);
        Room room2 = new Room(1,2, BigDecimal.valueOf(1000),true,true);
        Room room3 = new Room(3, 3, BigDecimal.valueOf(2400),false, true);

        //reservation for Adela Malikova
        Reservation reservation1 = new Reservation(List.of(guest1),room1,LocalDate.of(2024,7,19), LocalDate.of(2024,7,26), false);
        //reservation for  Adela and Jan
        Reservation reservation2 = new Reservation(List.of(guest1, guest2),room3,LocalDate.of(2024,9,1),LocalDate.of(2024,9,14), true);

        //Added class of Guest and Room and Reservation to the lists.
        ArrayList<Guest> guestsList = new ArrayList<>();
        guestsList.add(guest1);
        guestsList.add(guest2);

        ArrayList<Room> roomsList = new ArrayList<>();
        roomsList.add(room1);
        roomsList.add(room2);

        ArrayList<Reservation> listReservation = new ArrayList<>();
        listReservation.add(reservation1);
        listReservation.add(reservation2);


        System.out.println("Name of the guests: ");

        for (Guest guests : guestsList ) {
            System.out.println(guests.getName() + " " + guests.getSurname()+ " " + "(" + guests.getDateOfBirth() + ")");
        }

        bookingManager.getAllReservation();





    }

}
