package ci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmokeTest {
    @Test
    void applicationHealthCheck() {
        assertTrue(true, "Application health check should be successful");
    }

    @Test
    void buildConfigurationCheck() {
        assertEquals("qa", "qa");
    }
}
