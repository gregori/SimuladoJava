package questao2;

public class Questao2 {
    public static void main(String[] args) {
        Complex c = new Complex();
        if (!c.toString().equals("(1.0, 1.0)")) throw new AssertionError("Construtor padrão ou método toString incorreto. Deveria mostrar (1, 1)");
        Complex c1 = new Complex(1, 1);
        if (!c.toString().equals("(1.0, 1.0)")) throw new AssertionError("Construtor ou método toString incorreto. Deveria mostrar (1, 1)");
        c = new Complex(1, 2);
        c1 = new Complex(2, -4);
        c.sum(c1); // this.real = this.real + c1.real
                    // this.imaginary = this.imaginary + c1.imaginary
        if (!c.toString().equals("(3.0, -2.0)")) throw new AssertionError("Soma de complexos incorreta. Deveria mostrar (3, -2)");
        c = new Complex(1, 2);
        c.subtract(c1);
        if (!c.toString().equals("(-1.0, 6.0)")) throw new AssertionError("Soma de complexos incorreta. Deveria mostrar (-1, 6)");
    }
}