import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testEscaleno() {
        int actual = App.identificaTriangulo(2, 3, 4);
        int expected = tipos.ESCALENO.value();
        assertEquals(expected, actual);
    }

    @Test
    public void testEquilatero() {
        int actual = App.identificaTriangulo(5, 5, 5);
        int expected = tipos.EQUILATERO.value();
        assertEquals(expected, actual);
    }

    @Test
    public void testIsosceles() {
        int actual = App.identificaTriangulo(6, 6, 7);
        int expected = tipos.ISOSCELES.value();
        assertEquals(expected, actual);
    }

    @Test
    public void testNaoeTriangulo() {
        int actual = App.identificaTriangulo(1, 2, 3);
        int expected = tipos.NAOTRIANGULO.value();
        assertEquals(expected, actual);
    }

    @Test
    public void testEntradaInvalida(){
        int actual = App.identificaTriangulo(2,3,-4);
        int expected = tipos.ETRADAINVALIDA.value();
        assertEquals(expected,actual);
    }
}
