import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Fix me!!! I'm not testable!

        Random random = new Random();

        if (random.nextInt() % 2 == 1){
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }

    }
}
