package chap05;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Disabled
    @Test
    void failMethod() {
        try {
            AuthService authService = new AuthService();
            authService.authenticate(null, null);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    void assertThrowsTest() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            AuthService authService = new AuthService();
            authService.authenticate(null, null);
        });
        assertTrue(thrown.getMessage().contains("id"));
    }

    @Test
    void assertAllTest() {
        assertAll(
                () -> assertEquals(3, 5 / 2),
                () -> assertEquals(4, 2 * 2),
                () -> assertEquals(6, 11 / 2)
        );

    }
}