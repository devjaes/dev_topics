package jaes.exercises;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RomanNumberTest {
    @Test
    public void testIntToRoman1() {
        RomanNumber romanNumber = new RomanNumber(1284);
        assertEquals("MCCLXXXIV", romanNumber.toRoman());
    }

    @Test
    public void testIntToRoman2() {
        RomanNumber romanNumber = new RomanNumber(3999);
        assertEquals("MMMCMXCIX", romanNumber.toRoman());
    }

    @Test
    public void testIntToRoman3() {
        RomanNumber romanNumber = new RomanNumber(1);
        assertEquals("I", romanNumber.toRoman());
    }

    @Test
    public void testIntToRoman4() {
        RomanNumber romanNumber = new RomanNumber(3998);
        assertEquals("MMMCMXCVIII", romanNumber.toRoman());
    }

    @Test
    public void testIntToRoman5() {
        RomanNumber romanNumber = new RomanNumber(2003);
        assertEquals("MMIII", romanNumber.toRoman());
    }

    @Test
    public void testIntToRomanNegativeNumbers() {
        RomanNumber romanNumber = new RomanNumber(-10);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            romanNumber.toRoman();
        });

        String expectedMessage = "Number out of range (1..3999)";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testToRomanOutOfRange() {
        RomanNumber romanNumber = new RomanNumber(4000);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            romanNumber.toRoman();
        });

        String expectedMessage = "Number out of range (1..3999)";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}