import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    private final InputStream systemIn = System.in;

    private ByteArrayInputStream testIn;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));

    }
    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.setOut(standardOut);
        System.setIn(systemIn);
    }

    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
    void read_in_25_25_25() {
        final String testString = "25\n25\n25\n";
        provideInput(testString);

        Main.read_in();

        assertEquals(25,Main.black_board_score);
        assertEquals(25,Main.laboratory_score);
        assertEquals(25,Main.written_part_score);
    }
    @org.junit.jupiter.api.Test
    void read_in_0_50_50() {
        final String testString = "0\n50\n50\n";
        provideInput(testString);

        Main.read_in();

        assertEquals(0,Main.black_board_score);
        assertEquals(50,Main.laboratory_score);
        assertEquals(50,Main.written_part_score);
    }

    @org.junit.jupiter.api.Test
    void calculate() {
        Main.calculate();
        assertEquals("Pontszámaid összesen : 0" + "\n" + "Megbuktál mert egy tárgyból nem érted el a 25 pontot, hiába van 0 pontod", outputStreamCaptor.toString()
                .trim());
    }
}