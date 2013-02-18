import java.util.Random;

public class Coin {
    Random random;

    public Coin(Random random){
        this.random = random;
    }

    public CoinResults flip(){
        if (random.nextInt() % 2 == 1){
            return CoinResults.TAILS;
        } else {
            return CoinResults.HEADS;
        }
    }

    public enum CoinResults {
        HEADS, TAILS;
    }
}
