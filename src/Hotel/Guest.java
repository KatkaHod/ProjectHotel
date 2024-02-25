package Hotel;

import java.lang.String;
import java.time.LocalDate;

public class Guest {

    //attributes
    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    //Constructor with parameters, setting the initial value)
    public Guest(String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     Setter method for the new name and  new surname
     */
    public void setName(String newName) {
        this.name = newName;

    }
    public String getName(){
        return this.name;

    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }


    public void setDateOfBirth(LocalDate newDateOfBirth) {
        this.dateOfBirth = dateOfBirth;

    }
    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }


    @Override

    public String toString() {
        return name + " " + surname + " " + dateOfBirth;

    }


}


