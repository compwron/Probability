import org.junit.Test;

import java.util.Random;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CoinTest {

    @Test
    public void coinFlipShouldReturnHeadsWhenRandomReturns1() {
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(1);

        Coin coin = new Coin(random);
        assertEquals("Heads", coin.flip());
    }
}
