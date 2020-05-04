

public enum tipos {
    EQUILATERO(1), ESCALENO(2), ISOSCELES(3), ETRADAINVALIDA(4), NAOTRIANGULO(5);
    private final int value;

    tipos(int v) {
        this.value = v;
    }

    public int value() {
        return value;
    }
}
