package C_BuilderPattern;

import java.time.LocalDate;

public class SalesLeadTracker {

    private static void addPersonToLeadTracker(Person person) {
        System.out.println("A new lead added to the lead treacker : \n" + person);
    }

    public static void main(String[] args) {

        var person1 = new Person.PersonBuilder("Tharaka", "Dilshan")
                .dob(LocalDate.of(2000, 8, 31))
                .email("tharakadilshan@gmail.com")
                .build();

        addPersonToLeadTracker(person1);

        var person2 = new Person.PersonBuilder("Jerome", "Donaltan")
                .middleName("Henry")
                .phone("0775544466")
                .build();

        addPersonToLeadTracker(person2);
    }
}
