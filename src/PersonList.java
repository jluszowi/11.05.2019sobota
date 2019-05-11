import java.util.LinkedList;

public class PersonList {

    private static Object Person;

    public static void main(String[] args) {

        LinkedList personList = new LinkedList();
        for (int i = 0; i < 100000; i++) {
            personList.add(new Person("Ola", "ZZZ", 36));
        }
        System.out.println(personList);
        System.out.println(personList.size());

        System.out.println("-------------------");

        for (int i = 0; i < 100000; i++) {
            personList.removeFirst();
            personList.removeLast();


            System.out.println(personList);
            System.out.println(personList.size());
        }

    }
}
