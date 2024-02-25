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
        List<Room> roomsList = new ArrayList<>();
        Room room1 = new Room(1,1,BigDecimal.valueOf(1000),true,true);
        Room room2 = new Room(1,2, BigDecimal.valueOf(1000),true,true);
        Room room3 = new Room(3, 3, BigDecimal.valueOf(2400),false, true);
        roomsList.add(room1);
        roomsList.add(room2);
        roomsList.add(room3);

        //------Guests--------
        List<Guest> guestsList = new ArrayList<>();
        Guest guest1 = new Guest("Karel", "Dvorak", LocalDate.of(1990, 5,15));
        Guest guest2 = new Guest("Karel", "Dvorak",LocalDate.of(1979,1,3));
        Guest guest3 = new Guest("Karolina", "Tmava", LocalDate.of(1993,2,10));
        guestsList.add(guest1);
        guestsList.add(guest2);
        guestsList.add(guest3);


        //-------Reservation-------
        List<Reservation> listReservation = new ArrayList<>();

        Reservation reservation1 = new Reservation(List.of(guest1),room3,LocalDate.of(2023,6,1), LocalDate.of(2023,6,7), false);
        Reservation reservation2 = new Reservation(List.of(guest2),room2,LocalDate.of(2023,7,18),LocalDate.of(2023,7,21), true);


        //Clients on behalf of Karolina Tmava
        Reservation reservation3 = new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,1),LocalDate.of(2023,8,2),true);
        Reservation reservation4 = new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,3),LocalDate.of(2023,8,4),true);
        Reservation reservation5 = new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,5),LocalDate.of(2023,8,6),true);
        Reservation reservation6 = new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,7),LocalDate.of(2023,8,8),true);
        Reservation reservation7 = new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,9),LocalDate.of(2023,8,10),true);

        Reservation reservation8 = new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,11),LocalDate.of(2023,8,12),true);
        Reservation reservation9 = new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,13),LocalDate.of(2023,8,14),true);
        Reservation reservation10 = new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,15),LocalDate.of(2023,8,16),true);
        Reservation reservation11 = new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,17),LocalDate.of(2023,8,18),true);
        Reservation reservation12 = new Reservation(List.of(guest3),room2,LocalDate.of(2023,8,19),LocalDate.of(2023,8,20),true);

        //The 3. Room for august - Karolina Tmava
        Reservation reservation13 = new Reservation(List.of(guest3),room3,LocalDate.of(2023,8,1),LocalDate.of(2023,8,31),true);

        listReservation.add(reservation1);
        listReservation.add(reservation2);
        listReservation.add(reservation3);
        listReservation.add(reservation4);
        listReservation.add(reservation5);
        listReservation.add(reservation6);
        listReservation.add(reservation7);
        listReservation.add(reservation8);
        listReservation.add(reservation9);
        listReservation.add(reservation10);
        listReservation.add(reservation11);
        listReservation.add(reservation12);
        listReservation.add(reservation13);

        for (Guest guests : guestsList ) {
            System.out.println("New guest");
            System.out.println(guests.getName() + " "
                    + guests.getSurname()+ " "
                    + "(" + guests.getDateOfBirth() + ")");
        }

        System.out.println();

        for (Room rooms : roomsList ) {
            System.out.println("Room offer");
            System.out.println("Count of bed: " +  " " + rooms.getNumberOfRoom() + ", "
                    + "(" + "Price per night: " +  " " + rooms.getPricePerNight() + ")"
                    + ", " + "Included balcony: " + " " + rooms.getIncludesBalcony() + ", " + "View sea: " + " " + rooms.getViewSea());

        }

        System.out.println();


        //Print all the reservation
        for (Reservation reservations : listReservation ) {
            System.out.println("New reservations");
            System.out.println(reservations.getCheckIn() + " till " + reservations.getCheckOut() + ": "
                    + reservations.getGuests() + " " +
                    "[" + reservations.getCountGuests() + ", " + reservations.getViewSea() + "]" + " price " + reservations.getPricePerNight() + "CZK"
            );
        }

        // Cannot add this: + "(" + reservations.getGuestDateOfBirth()+ ")" +






    }

}
