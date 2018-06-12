package Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PersonUser {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter name of first person");
        String name = reader.readLine();
        System.out.println("Please enter surname of first person");
        String surname = reader.readLine();
        System.out.println("Please enter email of first person");
        String email = reader.readLine();
        Person person1 = new Person(name, surname, email);
        System.out.println("Please enter name of second person");
        String secondName = reader.readLine();
        System.out.println("Please enter surname of second person");
        String secondSurname = reader.readLine();
        System.out.println("Please enter email of second person");
        String secondEmail = reader.readLine();
        Person person2 = new Person(secondName, secondSurname, secondEmail);
        person1.printPerson();
        person2.printPerson();

    }
}
