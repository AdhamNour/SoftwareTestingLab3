import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StubbedMultiplyTest {

    @Test
    void multiply() {
        assertEquals(6,Multiply.Multiply(2,3));
    }
}