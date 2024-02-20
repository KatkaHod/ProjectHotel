package Hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private LocalDate checkIn;
    private LocalDate checkOut;
    private boolean isVacation;
    private Room room;
    private List<Guest> guests;


    public Reservation(List<Guest> guests, Room room, LocalDate checkIn, LocalDate checkOut, boolean isVacation) {
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.isVacation = isVacation;
        this.guests = guests;
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

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Reservation {" +
                "checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", isVacation=" + isVacation +
                ", room=" + room +
                ", guests=" + guests +
                '}';
    }


}