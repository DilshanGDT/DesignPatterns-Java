package C_BuilderPattern;

import java.time.LocalDate;

public class Person {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final LocalDate dob;
    private final String email;
    private final String phone;

    private Person(PersonBuilder pb) {
        this.firstName = pb.firstName;
        this.middleName = pb.middleName;
        this.lastName = pb.lastName;
        this.dob = pb.dob;
        this.email = pb.email;
        this.phone = pb.phone;

        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("First name and Last name cannot be null");
        }
    }

    public String toString() {
        return ("Name = " + firstName + " " + middleName + " " + lastName + " DoB = " + dob + " Email = " + email
                + " Phone = " + phone);

    }

    /* Builder Pattern */
    public static class PersonBuilder {
        private final String firstName;
        private String middleName;
        private final String lastName;
        private LocalDate dob;
        private String email;
        private String phone;

        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder dob(LocalDate dob) {
            this.dob = dob;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

}
