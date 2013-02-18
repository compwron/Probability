import java.util.Random;

public class OutcomeAnalyzer {
    String flip;
    Integer roll;

    public OutcomeAnalyzer(String flip, int roll) {
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
