package Hotel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private LocalDate checkIn;
    private LocalDate checkOut;
    private boolean isVacation;
    private Room room;
    private Guest guest;
    private List<Guest> guests;


    //Constructor - reservations with one or multiple guests
    public Reservation(List<Guest> guests, Room room, LocalDate checkIn, LocalDate checkOut, boolean isVacation) {
        if (guests == null) {
            throw new IllegalArgumentException("Reservation cannot be made without at least one guest.");
        }
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.isVacation = isVacation;
        this.guests = guests;
    }



    //Count of night per reservation
    public long getBookingLength() {
        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }

    //get total price of reservations
    public BigDecimal getTotalPrice() {
        long nights = getBookingLength();
        BigDecimal price = room.getPricePerNight();
        return price.multiply(BigDecimal.valueOf(nights));
    }

    public LocalDate getGuestDateOfBirth() {
        return guest.getDateOfBirth();
    }

    public BigDecimal getPricePerNight() {
        return room.getPricePerNight();
    }

    public boolean getViewSea() {
        return room.getViewSea();
    }


    //get list of guests
    public List<Guest> getListOfGuests() {
        return new ArrayList<>();

    }

    public int getNumberOfGuests() {
        if (guests != null) {
            return guests.size();
        } else {
            return 0;
        }
    }


    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }


    public List<Guest> getGuests() {
        return guests;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate endDate) {
        this.checkOut = endDate;
    }

    public boolean getIsVacation() {
        return isVacation;
    }

    public void setIsVacation(boolean vacation) {
        isVacation = vacation;
    }

    public String getIsPrivateVacation() {
        return isVacation ? "recreational" : "business";
    }



    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Reservation {" +
                "checkIn = " + checkIn +
                ", checkOut = " + checkOut +
                ", isVacation = " + isVacation +
                ", room = " + room +
                ", guests = " + guests +
                '}';
    }

}