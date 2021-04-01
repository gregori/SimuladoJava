package questao3;

public class Questao3 {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(3, 4);
        if (p1.getX() != 3 || p1.getY() != 4) throw new AssertionError("O valor de x e/ou y estão incorretamente armazenados");
        double d = p1.distancia(5, 6);
        if (Double.compare(d, Math.sqrt(8)) != 0) throw new AssertionError("A distância entre os pontos foi incorretamente calculada");
        Ponto p2 = new Ponto(5, 6);
        d = p1.distancia(p2);
        if (Double.compare(d, Math.sqrt(8)) != 0) throw new AssertionError("A distância entre os pontos foi incorretamente calculada");
        d = p1.distancia();
        if (Double.compare(d, 5) != 0) throw new AssertionError("A distancia entre o ponto e (0, 0) foi incorretamente calculada");
    }
}
