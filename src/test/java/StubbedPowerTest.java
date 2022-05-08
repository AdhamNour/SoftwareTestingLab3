import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StubbedPowerTest {

    @Test
    void StubedPower() {
        assertEquals(8,Power.power(2,3));
    }
}