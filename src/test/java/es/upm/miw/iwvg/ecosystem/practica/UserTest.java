package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User(23, "Pablo", "Perez");
    }

    @Test
    void testFullName() {
        assertEquals("Pablo Perez", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("P.", user.initials());
    }

    @Test
    void testGetNumber() {
        assertEquals(23, user.getNumber());
    }

    @Test
    void testGetName() {
        assertEquals("Pablo", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Perez", user.getFamilyName());
    }

    @Test
    void testNameUpperCase() {
        assertEquals("PABLO", user.nameUpperCase());
    }

    @Test
    void testFormatFamilyNameName() {
        assertEquals("Perez, Pablo", user.formatFamilyNameName());
    }
}
