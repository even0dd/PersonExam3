
import java.util.LinkedList;

public class Main {
    static LinkedList<Person> p = new LinkedList<>();
    public static void main(String[] args) {
        personAdd(new Person("Alex","Dmitriev","Petrovich"),
                new Person("Ale","Dmitriev","Petrovich"),
                new Person("Dmitrii","Seregeev","Kirillov"));

    }
    public static void personAdd(Person person,Person person1,Person person2) {

        for (int i = 0; i<(p.size());i++) {
            if (p.get(i).getName().equals(p.get(i+1).getName())&&
                    p.get(i).getSurname().equals(p.get(i+1).getSurname())&&
                    p.get(i).getPatronymic().equals(p.get(i+1).getPatronymic())) {
                throw new Error("Two people is duplicated");
            }

        }
        System.out.println("Everything is ok");
        p.add(person2);
        p.add(person1);
        p.add(person);

    }
}