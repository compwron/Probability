import org.junit.Test;

import java.util.Random;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CoinTest {

    @Test
    public void coinFlipShouldReturnHeadsWhenRandomReturnsOddNumber() {
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(1);

        Coin coin = new Coin(random);
        assertEquals(Coin.CoinResults.HEADS.name(), coin.flip());
    }

    @Test
    public void coinFlipShouldReturnTailsWhenRandomReturnsEvenNumber() {
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(2);

        Coin coin = new Coin(random);
        assertEquals(Coin.CoinResults.TAILS.name(), coin.flip());
    }
}
