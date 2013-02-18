import javax.swing.*;
import java.security.DigestException;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Coin coin = new Coin(new Random());
        System.out.println("Coin flip result is: " + coin.flip());

        Die die = new Die(new Random());
        System.out.println("Is die roll result six?: " + die.rollIsSix());
    }
}
