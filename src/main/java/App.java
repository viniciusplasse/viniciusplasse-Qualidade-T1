
public class App {
    public static int identificaTriangulo(int a, int b, int c) {

        if ((a < b + c) && (b < a + c) && (c < b + a)) {

            if ((a == b) && (b == c))
                return tipos.EQUILATERO.value();

            else if ((a != b) && (a != c) && (b != c))
                return tipos.ESCALENO.value();

            else
                return tipos.ISOSCELES.value();

        } else if ((a<=0 && b>0 && c>0) || (b <= 0 && a>0 && c>0) || (c <= 0 && a>0 && b>0))
            return  tipos.ENTRADAINVALIDA.value();

        return tipos.NAOTRIANGULO.value();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Triângulos!");
        System.out.println(identificaTriangulo(2, 3, 4));
    }
}
