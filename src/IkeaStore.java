public class IkeaStore {

    //do tego jest class Chair

    public static void main(String[] args) {

        Chair chair1 = new Chair("Adde", "IKEA", 2016);
        Chair chair2 = new Chair("Janinge", "IKEA", 2016);
        Chair chair3 = new Chair("Adde", "IKEA", 2015);
        Chair chair4 = new Chair("Adde", "IKEA", 2016);

        System.out.println("chair1.equals(chair2) " + chair1.equals(chair2)); //false
        System.out.println("chair1.equals(chair3) " + chair1.equals(chair3)); //false
        System.out.println("chair1.equals(chair4) " + chair1.equals(chair4)); //true
        System.out.println("chair1.equals(null) " + chair1.equals(null)); //false

        System.out.println(chair1.hashCode()); //*
        System.out.println(chair2.hashCode());
        System.out.println(chair3.hashCode());
        System.out.println(chair4.hashCode()); //*
    }
}
