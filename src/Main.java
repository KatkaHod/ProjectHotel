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

        BookingManager ReservationList = new BookingManager();

        //instances of the Guest class
        Guest guest1 = new Guest("Adela", "Malikova", LocalDate.of(1993, 3,13));
        Guest guest2 = new Guest("Jan", "Dvoracek", LocalDate.of(1995,5,5));

        ArrayList<Guest> guestsList = new ArrayList<>();
        guestsList.add(guest1);
        guestsList.add(guest2);


        //instances of the Room Class
        Room room1 = new Room(1,1,BigDecimal.valueOf(1000),true,true);
        Room room2 = new Room(1,2, BigDecimal.valueOf(1000),true,true);
        Room room3 = new Room(3, 3, BigDecimal.valueOf(2400),false, true);


        //reservation for Adela Malikova
        Reservation reservation1 = new Reservation(List.of(guest1),room1,LocalDate.of(2024,7,19), LocalDate.of(2024,7,26), false);
        //reservation for  Adela and Jan
        Reservation reservation2 = new Reservation(List.of(guest1, guest2),room3,LocalDate.of(2024,9,1),LocalDate.of(2024,9,14), true);

        List<Reservation> listReservation = new ArrayList<>();
        listReservation.add(reservation1);
        listReservation.add(reservation2);


        System.out.println("Name of the guests");
        System.out.println("==================");
        System.out.println(guest1.getName() + " " + guest1.getSurname() +  " " + "(" + guest1.getDateOfBirth() + ")");
        System.out.println(guest2.getName() + " " + guest2.getSurname() +  " " + "(" + guest2.getDateOfBirth() + ")");
        System.out.println();

        //Print the listReservation
        System.out.println(listReservation);
        System.out.println("Count of reservations: " + listReservation.size());




    }

}
