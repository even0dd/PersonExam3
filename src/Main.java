import java.util.LinkedList;

public class Main {
    static LinkedList<Person> p = new LinkedList<>();
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ivan");
        person.setPatronymic("Petrovic");
        person.setSurname("Alexandrovic");

        Person person1 = new Person();
        person1.setName("Ivan");
        person1.setPatronymic("Petrovic");
        person1.setSurname("Alexandrovic");

        personAdd(new Person(),new Person());

    }
    public static void personAdd(Person person,Person person1) {
        p.add(person1);
        p.add(person);
        for (int i = 0; (i!=(p.size()-1));i++) {
            if (p.get(i).equals(p.get(1+i))) {
                throw new Error("Two people is duplicated");
            } else {
                System.out.println("Everything is ok");
            }

        }
    }
}

