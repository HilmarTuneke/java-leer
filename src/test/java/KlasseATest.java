import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KlasseATest {

    @Test
    void get() {
        // angenommen
        final KlasseA zuTestendesObjekt = new KlasseA();

        // wenn
        final String name = zuTestendesObjekt.getName();

        // dann
        assertNotNull(name);
    }
}
