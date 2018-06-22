package Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PersonUser {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person1 = new Person("Ivanov", "Ivan", "ivanov.ivan@gmail.com");
        Person person2 = new Person("Petrov", "Peter", "petrov.peter@gmail.com");
        Person person3 = new Person("Sidorov ", "Sidor", "sidorov.sidor@gmail.com");
        Passport passport1 = new Passport("NE",111111);
        Passport passport2 = new Passport("FE",222222);
        Passport passport3 = new Passport("BE",333333);
        person1.printPerson();
        person2.printPerson();
        final Map<Passport, Person> passportOwners = new HashMap<Passport, Person>();
        passportOwners.put(passport1,person1);
        passportOwners.put(passport2,person2);
        passportOwners.put(passport3,person3);
        Passport passport4 = new Passport("BE",333333);
        System.out.println(passport4.equals(passport3));
    }
}
