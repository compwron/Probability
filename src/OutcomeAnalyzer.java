import java.util.Random;

public class OutcomeAnalyzer {
    Coin.CoinResults flip;
    Integer roll;

    public OutcomeAnalyzer(Coin.CoinResults flip, int roll) {
        this.flip = flip;
        this.roll = roll;
    }

    public boolean oneDieRollResultsInSixAndOneCoinFlipIsHeads() {
        return false;
    }

    public boolean oneDieRollResultsInSixOrOneCoinFlipIsHeads() {
        return false;
    }
}
