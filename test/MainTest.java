import org.junit.Test;

import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MainTest {
    @Test
    public void testMain() {
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(1);

        // Ack! What do I do now
    }
}
