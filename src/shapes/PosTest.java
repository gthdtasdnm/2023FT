package shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PosTest {

    @Test
    public void testToString() {
        final Pos p1 = new Pos();
        final Pos p2 = new Pos(1, 2);
        assertEquals("(0,0)", p1.toString());
        assertEquals("(1,2)", p2.toString());
    }
}
