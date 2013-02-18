import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Coin coin = new Coin(new Random());
        System.out.println("Coin flip result is: " + coin.flip());

        Die die = new Die(new Random());
        System.out.println("Is die roll result six?: " + die.rollIsSix());

        OutcomeAnalyzer outcomeAnalyzer = new OutcomeAnalyzer(coin.flip(), die.roll());
        System.out.println(outcomeAnalyzer.oneDieRollResultsInSixAndOneCoinFlipIsHeads());
        System.out.println(outcomeAnalyzer.oneDieRollResultsInSixOrOneCoinFlipIsHeads());
    }
}
