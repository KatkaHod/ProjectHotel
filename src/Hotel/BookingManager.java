package Hotel;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

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
    public int getNumberOfWorkingBookings() {
        int workingStay = 0;
        for (Reservation reservation : reservations) {
            if (!reservation.getIsVacation()) {
                workingStay++;
            }
        }
        return workingStay;
    }


    // Average number of guests per booking
    public double getAverageGuests() {
        double totalGuests = 0;
        double totalReservations = 0;

        for (Reservation reservation : reservations) {
            totalGuests += reservation.getNumberOfGuests();
            totalReservations++;
        }

        if (totalReservations == 0) {
            return 0;
        } else {
            return totalGuests / totalReservations;
        }

    }

    //The first 8 recreational reservations
    public List<Reservation> printFirstEightVacation() {
        System.out.println("\nList of first eight vacation reservations:");
        int count = 0;
        for (Reservation reservation : reservations) {
            if (count >= 8) {
                break; //  Exit loop at value 8
            }
            if (reservation.getIsVacation()) {
                reservation.getGuests().forEach(guest -> {
                    System.out.printf("%s - %s :%s %s (%s)[%d, %s] for %sCzk\n",
                            reservation.getCheckIn(), reservation.getCheckOut(), guest.getName(), guest.getSurname(), guest.getDateOfBirth(),
                            reservation.getNumberOfGuests(), reservation.getRoom().getViewSea() ? "yes" : "no", reservation.getTotalPrice());
                });

                count++;
            }
        }
        return null;
    }

    //Statistics of guests


    //statistics about the number of guests in a reservation
    public void printGuestStatistics() {
        int bookingsWithOneGuest = 0;
        int bookingsWithTwoGuests = 0;
        int bookingsWithMoreThanTwoGuests = 0;

        for (Reservation reservation : reservations) {
            int numberOfGuests = reservation.getNumberOfGuests();
            if (numberOfGuests == 1) {
                bookingsWithOneGuest++;
            } else if (numberOfGuests == 2) {
                bookingsWithTwoGuests++;
            } else {
                bookingsWithMoreThanTwoGuests++;
            }
        }
        System.out.println("Reservations with 1 guest: " + bookingsWithOneGuest);
        System.out.println("Reservations with 2 guests: " + bookingsWithTwoGuests);
        System.out.println("Reservations with more than 2 guests: " + bookingsWithMoreThanTwoGuests);
    }








}

