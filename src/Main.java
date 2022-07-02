import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> p = new LinkedList<>();
        Person person = new Person("Bob", "Bob", "Bob");
        Person person1 = new Person("Bo", "Bob", "Bob");
        addPerson(person, p);
        addPerson(person1, p);
    }

    public static void addPerson(Person person, LinkedList<Person> p) {
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getName().equals(person.getName())
                    && p.get(i).getPatronymic().equals(person.getPatronymic()) &&
                    p.get(i).getSurname().equals(person.getSurname())) {
                throw new Error("Two people duplicated");
            } else {
                p.add(person);
                System.out.println("Everything is ok");
                break;

            }
        }

    }
}