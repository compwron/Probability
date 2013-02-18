import org.junit.Test;

import java.util.Random;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OutcomeAnalyzerTest {

    @Test
    public void knowsWhetherOneDieRollResultsInSixAndOneCoinFlipIsHeads(){
        Random coinRandom = mock(Random.class);
        when(coinRandom.nextInt()).thenReturn(2);

        Random dieRandom = mock(Random.class);
        when(dieRandom.nextInt()).thenReturn(6);

        OutcomeAnalyzer outcomeAnalyzer = new OutcomeAnalyzer(new Coin(coinRandom), new Die(dieRandom));
        assertTrue(outcomeAnalyzer.oneDieRollResultsInSixAndOneCoinFlipIsHeads());
    }

    @Test
    public void knowsWhetherOneDieRollResultsInSixAndOneCoinFlipIsNotHeads(){
        Random coinRandom = mock(Random.class);
        when(coinRandom.nextInt()).thenReturn(1);

        Random dieRandom = mock(Random.class);
        when(dieRandom.nextInt()).thenReturn(6);

        OutcomeAnalyzer outcomeAnalyzer = new OutcomeAnalyzer(new Coin(coinRandom), new Die(dieRandom));
        assertFalse(outcomeAnalyzer.oneDieRollResultsInSixAndOneCoinFlipIsHeads());
    }

    @Test
    public void knowsWhetherRollIsSixOrFlipIsHeads(){
        Random coinRandom = mock(Random.class);
        when(coinRandom.nextInt()).thenReturn(2);

        Random dieRandom = mock(Random.class);
        when(dieRandom.nextInt()).thenReturn(5);

        OutcomeAnalyzer outcomeAnalyzer = new OutcomeAnalyzer(new Coin(coinRandom), new Die(dieRandom));
        assertTrue(outcomeAnalyzer.oneDieRollResultsInSixOrOneCoinFlipIsHeads());
    }

    @Test
    public void knowsWhetherNeitherRollIsSixNorFlipIsHeads(){
        Random coinRandom = mock(Random.class);
        when(coinRandom.nextInt()).thenReturn(1);

        Random dieRandom = mock(Random.class);
        when(dieRandom.nextInt()).thenReturn(5);

        OutcomeAnalyzer outcomeAnalyzer = new OutcomeAnalyzer(new Coin(coinRandom), new Die(dieRandom));
        assertFalse(outcomeAnalyzer.oneDieRollResultsInSixOrOneCoinFlipIsHeads());
    }
}
