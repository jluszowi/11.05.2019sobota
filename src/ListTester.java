import java.util.*;

public class ListTester {

    public static void main(String[] args) {

        /*List<Integer> myList = new ArrayList<>();
        myList.add(123);
        myList.add(4);

        System.out.println(myList); // wyświetl cała listę
        System.out.println(myList.get(0)); //wyświetl liczbę znajdująca się na pozycji 0
        System.out.println(myList.remove(0)); //usuń liczbę znajdującą się na pozycji 0
        System.out.println(myList);
        System.out.println(myList.size()); // wyświetl ile liczb znajduje się w tablicy
        myList.clear(); //usuń całą zawartość listy
        System.out.println(myList);
*/


      /*  List myList = new ArrayList<>();
        myList.add(1);
        myList.add(new Object());
        myList.add("siedem");

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));

        System.out.println((int)myList.get(0) + (String)myList.get(2));
*/


       /* List<Integer> myList = new ArrayList<>();
        myList = Arrays.asList(1,2,4,66,7,98,44,452,2,23);

        System.out.println(myList.size());
*/


        List<Integer> myList = new ArrayList<>();
        myList = Arrays.asList(1, 2, 4, 66, 7, 98, 44, 452, 2, 23);

        System.out.println(myList.size());

        for (int i = 0; i < myList.size(); i++) {
            {
                System.out.println(myList.get(i));
            }
            System.out.println("--------");

            for (Integer element : myList) {
                System.out.println(element);
            }

            System.out.println("--------");

            Iterator<Integer> iterator = myList.iterator();
            while (iterator.hasNext()) {
                System.out.println("Liczba: " + iterator.next());
            }


           /* System.out.println("--------");

            Iterator<Integer> iterator = myList.listIterator();
            while (iterator.hasNext()) {
                if (iterator.next() == 7) {
                    System.out.println(iterator.next());
                }*/

/*            System.out.println("--------");

            while (iterator.hasNext()) {
                Integer e = iterator.next();
                if (e % 2 == 0) {
                    System.out.println("P: " + e);
                }
            }
*/

/*

List<String> myList = new LinkedList<>();
myList.add("pierwszy");
myList.add("drugi");
myList.add("trzeci");
myList.add("czwarty");

        System.out.println(myList);

        myList.add(0, "zerowy"); //dodajemy element 0
        System.out.println(myList);

        myList.remove("drugi"); //usuwanie elementu 2
        System.out.println(myList);
*/

/*

List<String> myList = new LinkedList();
myList = new LinkedList<>(Arrays.asList("a", "b", "c", "a", "a"));

        System.out.println("Występuje " + Collections.frequency(myList, "b" + " razy"));
*/

        }
    }
}