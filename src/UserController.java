import java.util.HashMap;
import java.util.Map;

public class UserController {

    public static void main(String[] args) {

        Map<Integer, User> userMap = new HashMap<>();
        userMap.put(1, new User("Jan", "Nowak", 45));
        userMap.put(2, new User("Jakub", "Kuś", 99));
        userMap.put(3, new User("Kasia", "Nic", 18));


        for (User user : userMap.values()) {
            System.out.println(user);

            System.out.println();

            System.out.println(userMap.get(1));
            System.out.println(userMap.get(2));
            System.out.println(userMap.get(3));
        }


    }

}
