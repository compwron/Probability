import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Coin coin = new Coin(new Random());
        System.out.println("Is coin flip result heads? " + coin.isHeads());

        Die die = new Die(new Random());
        System.out.println("Is die roll result six? " + die.isSix());

        OutcomeAnalyzer outcomeAnalyzer = new OutcomeAnalyzer(coin, die);
        System.out.println("Does one die result in a '6' and a coin flip is heads? "+outcomeAnalyzer.oneDieRollResultsInSixAndOneCoinFlipIsHeads());
        System.out.println("Does one die result in a '6' or a coin flip is heads? "+outcomeAnalyzer.oneDieRollResultsInSixOrOneCoinFlipIsHeads());
    }
}
