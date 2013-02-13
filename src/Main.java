import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Coin coin = new Coin(new Random());
        System.out.println(coin.flip());
    }
}
