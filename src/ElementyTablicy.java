public class ElementyTablicy {

    public static void main(String[] args) {

        String[] names = {"Ala", "Ola", "Ela", "Ula"};
        Integer[] numbers = {2,55,3,1123,2};
        Boolean[] answers = {false, false, true, true};

        print(names);
        print(numbers);
        print(answers);

    }

    public static <T> void print(T[] array) {
        System.out.println("\n Klasa: " + array.getClass());
        for (T element : array) {
            System.out.println("Element: " + element);
        }
    }
}
