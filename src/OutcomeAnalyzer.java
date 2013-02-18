import java.util.Random;

public class OutcomeAnalyzer {
    Coin coin;
    Die die;

    public OutcomeAnalyzer(Coin coin, Die die) {
        this.coin = coin;
        this.die = die;
    }

    public boolean oneDieRollResultsInSixAndOneCoinFlipIsHeads() {
        return coin.isHeads() && die.isSix();
    }

    public boolean oneDieRollResultsInSixOrOneCoinFlipIsHeads() {
        return coin.isHeads() || die.isSix();
    }
}
