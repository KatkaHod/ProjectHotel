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


        //------Rooms------
        Room room2 = new Room(1,2, BigDecimal.valueOf(1000),true,true);
        Room room3 = new Room(3, 3, BigDecimal.valueOf(2400),false, true);

        //------Guests--------
        Guest guest1 = new Guest("Karel", "Dvorak", LocalDate.of(1990, 5,15));
        Guest guest2 = new Guest("Karel", "Dvorak",LocalDate.of(1979,1,3));
        Guest guest3 = new Guest("Karolina", "Tmava", LocalDate.of(1993,2,10));


        //BookingManager allows me to create reservations and print the list of all reservations. Atribut in BM class is Reservation.
        BookingManager bookingManager = new BookingManager();

        //Reservation for Karel Dvorak
        bookingManager.addReservation(new Reservation(List.of(guest1),room3,LocalDate.of(2023,6,1), LocalDate.of(2023,6,7), false));
        //Reservation for Karel Dvorak - different person, date of birth is different
        bookingManager.addReservation(new Reservation(List.of(guest2),room2,LocalDate.of(2023,7,18),LocalDate.of(2023,7,21), true));
        //Reservation for Karolina Tmava
        bookingManager.addReservation(new Reservation(List.of(guest3),room3,LocalDate.of(2023,8,1),LocalDate.of(2023,8,31),true));


        //Clients on behalf of Karolina Tmava
        bookingManager.addReservation(new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,1),LocalDate.of(2023,8,2),true));
        bookingManager.addReservation(new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,3),LocalDate.of(2023,8,4),true));
        bookingManager.addReservation(new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,5),LocalDate.of(2023,8,6),true));
        bookingManager.addReservation(new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,7),LocalDate.of(2023,8,8),true));
        bookingManager.addReservation(new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,9),LocalDate.of(2023,8,10),true));

        bookingManager.addReservation(new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,11),LocalDate.of(2023,8,12),true));
        bookingManager.addReservation(new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,13),LocalDate.of(2023,8,14),true));
        bookingManager.addReservation(new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,15),LocalDate.of(2023,8,16),true));
        bookingManager.addReservation(new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,17),LocalDate.of(2023,8,18),true));
        bookingManager.addReservation(new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,19),LocalDate.of(2023,8,20),true));



        System.out.println("-------Reservations-------");
        for (Reservation reservations : bookingManager.getReservations()) {
            System.out.println(reservations.getCheckIn() + " till " + reservations.getCheckOut() + ": "
                    + reservations.getGuests() + " " +
                    "[" + reservations.getNumberOfGuests() + ", " + reservations.getViewSea() + "]" + " per " + reservations.getPricePerNight() + " CZK"
            );
        }

        System.out.println();
        System.out.println("-------Guests statistics-------");
        System.out.println();

        System.out.println("Average number of guests per booking: ");
        System.out.println("First version: " + bookingManager.getAverageGuests());
        System.out.println("Second version: " + bookingManager.getAverageGuestsSecondMethod());
        System.out.println();


        System.out.println("Total price of first 8 recreational reservation: ");
        bookingManager.printFirst8Vacation();
        System.out.println();

        System.out.println("Statistics by number of guests: ");
        bookingManager.printGuestStatistics();
        System.out.println();


        System.out.println("Price of reservation: ");
        bookingManager.getTotalPrices();
        System.out.println();


        bookingManager.clearReservations();
        System.out.println();





        //others method












    }

}
