import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Employee("John", "Lennon", "Teacher", 27045.78));
        people.add(new Employee("George", "Harrison", "Waiter", 50000.00));
        people.add(new Student("Ringo", "Starr", 0.00));
        people.add(new Student("Paul", "McCartney", 3.2));

        Collections.sort(people);
        printData(people);
    }

    //method that has Iterable<Person> parameter and prints out information about each person, including their name, surname, and payment amount.
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge ");
        }
    }
}