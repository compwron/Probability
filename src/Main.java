import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Coin coin = new Coin(new Random());
        Coin.CoinResults coinFlip = coin.flip();
        System.out.println("Coin flip result is: " + coinFlip);

        Die die = new Die(new Random());
        Integer dieRoll = die.roll();
        System.out.println("Die roll result is: " + dieRoll);

        OutcomeAnalyzer outcomeAnalyzer = new OutcomeAnalyzer(coinFlip, dieRoll);
        System.out.println("Does one die result in a '6' and a coin flip is heads? "+outcomeAnalyzer.oneDieRollResultsInSixAndOneCoinFlipIsHeads());
        System.out.println("Does one die result in a '6' or a coin flip is heads? "+outcomeAnalyzer.oneDieRollResultsInSixOrOneCoinFlipIsHeads());
    }
}
