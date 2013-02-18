import org.junit.Test;

import java.util.Random;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OutcomeAnalyzerTest {

    @Test
    public void knowsWhetherOneDieRollResultsInSixAndOneCoinFlipIsHeads(){
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(6);

        OutcomeAnalyzer outcomeAnalyzer = new OutcomeAnalyzer(Coin.CoinResults.HEADS, 6);
        assertTrue(outcomeAnalyzer.oneDieRollResultsInSixAndOneCoinFlipIsHeads());
    }

    @Test
    public void knowsWhetherOneDieRollResultsInSixAndOneCoinFlipIsNotHeads(){
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(1);

        OutcomeAnalyzer outcomeAnalyzer = new OutcomeAnalyzer(Coin.CoinResults.TAILS, 6);
        assertFalse(outcomeAnalyzer.oneDieRollResultsInSixAndOneCoinFlipIsHeads());
    }

    @Test
    public void knowsWhetherRollIsSixOrFlipIsHeads(){
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(6);

        OutcomeAnalyzer outcomeAnalyzer = new OutcomeAnalyzer(Coin.CoinResults.TAILS, 6);
        assertTrue(outcomeAnalyzer.oneDieRollResultsInSixOrOneCoinFlipIsHeads());
    }

    @Test
    public void knowsWhetherNeitherRollIsSixNorFlipIsHeads(){
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(6);

        OutcomeAnalyzer outcomeAnalyzer = new OutcomeAnalyzer(Coin.CoinResults.TAILS, 5);
        assertFalse(outcomeAnalyzer.oneDieRollResultsInSixOrOneCoinFlipIsHeads());
    }
}
