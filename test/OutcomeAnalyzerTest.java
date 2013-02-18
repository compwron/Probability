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

        OutcomeAnalyzer outcomeAnalyzer = new OutcomeAnalyzer("Heads", 6);
        assertTrue(outcomeAnalyzer.oneDieRollResultsInSixAndOneCoinFlipIsHeads());
    }

    @Test
    public void knowsWhetherOneDieRollResultsInSixAndOneCoinFlipIsNotHeads(){
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(1);

        OutcomeAnalyzer outcomeAnalyzer = new OutcomeAnalyzer("Tails", 6);
        assertFalse(outcomeAnalyzer.oneDieRollResultsInSixAndOneCoinFlipIsHeads());
    }
}
