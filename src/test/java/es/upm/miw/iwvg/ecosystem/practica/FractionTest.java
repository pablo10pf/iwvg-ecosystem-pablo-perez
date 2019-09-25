package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(3, 5);
    }

    @Test
    void testDefaultConstructor() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals((double) 3 / 5, fraction.decimal());
    }

    @Test
    void testToString() {
        assertEquals("3/5", fraction.toString());
    }

    @Test
    void testIsGreater() {
        Fraction fraction1 = new Fraction(2, 5);
        assertTrue(fraction.isGreater(fraction1));
        assertFalse(fraction1.isGreater(fraction));
    }

    @Test
    void testIsSmaller() {
        Fraction fraction2 = new Fraction(4, 5);
        assertTrue(fraction.isSmaller(fraction2));
        assertFalse(fraction2.isSmaller(fraction));
    }
}
