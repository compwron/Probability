import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DieTest {

    @Test
    public void dieRollsSixWhenRandomNumberIsEvenlyDivisibleBySix(){
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(6);
        Die die = new Die(random);
        assertEquals(6, die.roll());
    }

    @Test
    public void dieRollsFiveWhenRandomNumberHasRemainderFiveWhenDividedBySix(){
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(5);
        Die die = new Die(random);
        assertEquals(5, die.roll());
    }

    @Test
    public void dieRollsSixWhenRandomNumberHasRemainderZeroAfterRollingANumberLargerThanSixButDivisibleBySix(){
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(12);
        Die die = new Die(random);
        assertEquals(6, die.roll());
    }

    @Test
    public void dieNeverRollsANegativeNumber(){
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(-3);
        Die die = new Die(random);
        assertEquals(3, die.roll());
    }
}
