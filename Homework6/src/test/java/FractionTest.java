import org.example.Fraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FractionTest {

    @Test
    void constructorTest(){
        Fraction f1 = new Fraction(1, 2);
        assertEquals(2, f1.getNenner());
        assertEquals(1, f1.getZaehler());
        assertThrows(IllegalArgumentException.class, () -> {new Fraction(1, 0);});
    }

    @Test
    void kehrwertTest(){
        Fraction f1 = new Fraction(1, 2);
        f1.kehrwert();
        assertEquals(1, f1.getNenner());
        assertEquals(2, f1.getZaehler());
    }

    @Test
    void multiplicationTest(){
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 3);
        f1.multiplikation(f2);
        assertEquals(2, f1.getZaehler());
        assertEquals(6, f1.getNenner());
    }

    @Test
    void additionTest(){
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        f1.addition(f2);
        assertEquals(5, f1.getZaehler());
        assertEquals(6, f1.getNenner());
    }

    @Test
    void kuerzenTest(){
        Fraction f1 = new Fraction(5, 10);
        f1.kuerzen();
        assertEquals(1, f1.getZaehler());
        assertEquals(2, f1.getNenner());
    }
}
