import java.util.Random;

public class Coin {
    Random random;
    CoinResults result;

    public Coin(Random random){
        this.random = random;
        this.result = flip();
    }

    CoinResults flip(){
        if (random.nextInt() % 2 == 1){
            return CoinResults.TAILS;
        } else {
            return CoinResults.HEADS;
        }
    }

    public boolean isHeads(){
        return result == CoinResults.HEADS;
    }

    public enum CoinResults {
        HEADS, TAILS;
    }
}
