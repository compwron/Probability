import org.junit.Test;

import java.util.Random;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CoinTest {

    @Test
    public void coinFlipShouldReturnTailsWhenRandomReturnsOddNumber() {
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(1);

        Coin coin = new Coin(random);
        assertEquals(Coin.CoinResults.TAILS, coin.flip());
    }

    @Test
    public void coinFlipShouldReturnHeadsWhenRandomReturnsEvenNumber() {
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(2);

        Coin coin = new Coin(random);
        assertEquals(Coin.CoinResults.HEADS, coin.flip());
    }

    @Test
    public void coinKnowsIfItIsHeads() {
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(2);

        Coin coin = new Coin(random);
        assertTrue(coin.isHeads());
    }

    @Test
    public void coinKnowsIfItIsNotHeads() {
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(1);

        Coin coin = new Coin(random);
        assertFalse(coin.isHeads());
    }
}
