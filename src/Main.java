import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<dalmatian> dalmatians = new HashSet<>();
        for (int i = 1; i <= 40; i++) {
            String name = Integer.toString(i);
            double weight = random.nextDouble(5,10);
            dalmatian dalmatian = new dalmatian(name,weight);
            dalmatians.add(dalmatian);
            System.out.println( dalmatian.toString() + "\n");
        }
        System.out.println();
        System.out.println(dalmatians);
    }
}