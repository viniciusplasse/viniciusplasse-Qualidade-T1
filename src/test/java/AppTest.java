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
    public void testVariantes3() {
        int actual = App.identificaTriangulo(6, 7, 6);
        int expected = tipos.ISOSCELES.value();
        assertEquals(expected, actual);
    }

    @Test
    public void testValorZero(){
        int actual = App.identificaTriangulo(8,0,9);
        int expected = tipos.ENTRADAINVALIDA.value();
        assertEquals(expected,actual);
    }

    @Test
    public void testValorNegativo(){
        int actual = App.identificaTriangulo(2,3,-4);
        int expected = tipos.ENTRADAINVALIDA.value();
        assertEquals(expected,actual);
    }

    @Test
    public void testLinha() {
        int actual = App.identificaTriangulo(1, 2, 3);
        int expected = tipos.NAOTRIANGULO.value();
        assertEquals(expected, actual);
    }

    @Test
    public void testVariantede7() {
        int actual = App.identificaTriangulo(1, 3, 2);
        int expected = tipos.NAOTRIANGULO.value();
        assertEquals(expected, actual);
    }

    @Test
    public void testLinhaLonga() {
        int actual = App.identificaTriangulo(1, 2, 8);
        int expected = tipos.NAOTRIANGULO.value();
        assertEquals(expected, actual);
    }

    @Test
    public void testVariantesde9() {
        int actual = App.identificaTriangulo(8, 1, 2);
        int expected = tipos.NAOTRIANGULO.value();
        assertEquals(expected, actual);
    }

    @Test
    public void testTodosZeros() {
        int actual = App.identificaTriangulo(0, 0, 0);
        int expected = tipos.NAOTRIANGULO.value();
        assertEquals(expected, actual);
    }
}
