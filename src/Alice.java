import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Alice {
    public static void main(String[] args) throws IOException {

        try {
            List<String> list = Files.readAllLines(Paths.get("src/alice30.txt"));
            Set<String> set = new TreeSet<>();

            for (String line : list) {
                //System.out.println(line);
                String[] words = line.split(" ");
                for (String word : words) {
                    System.out.println(word + " | ");
                }
                System.out.println();


  /*          System.out.println("Ilość linii: " + list.size());
            list.get(0).split(" ")
   */

            } catch(IOException e){
                System.out.println("Coś poszło nie tak przy wczytywaniu pliku");
                e.printStackTrace();
            }



            /*   *//*System.out.println();

        Set<String> set = new TreeSet<>();
        *//*set.add("Tomek");

             */

        }
    }
}
