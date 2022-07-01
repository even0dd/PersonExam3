import java.util.LinkedList;

public class Main {
    static LinkedList<Person> p = new LinkedList<>();
    public static void main(String[] args) {
        personAdd(new Person("Alex","Dmitriev","Petrovich"),
                new Person("Alx","Dmitriev","Petrovich"),
                new Person("Dmitrii","Seregeev","Kirillov"));

    }
    public static void personAdd(Person person,Person person1,Person person2) {
        p.add(person2);
        p.add(person1);
        p.add(person);
        for (int i = 0; i!=(p.size()-1);i++) {
            if (p.get(i).getName().equals(p.get(i+1).getName())&&
                    p.get(i).getSurname().equals(p.get(i+1).getSurname())&&
                    p.get(i).getPatronymic().equals(p.get(i+1).getPatronymic())) {
                throw new Error("Two people is duplicated");
            } else {
                System.out.println("Everything is ok");
                break;
            }

        }
    }
}

