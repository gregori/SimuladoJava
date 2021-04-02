package questao3;

public class Ponto {
    private int x;
    private int y;

    public Ponto() {
        x = 0;
        y = 0;
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distancia(int x, int y) {
        return Math.sqrt(
                Math.pow(x - this.x, 2) +
                Math.pow(y - this.y, 2)
        );
    }

    public double distancia() {
        return distancia(0, 0);
    }

    public double distancia(Ponto outro) {
        return distancia(outro.getX(), outro.getY());
    }
}
