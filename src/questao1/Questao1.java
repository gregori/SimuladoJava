package questao1;

public class Questao1 {
    public static void main(String[] args) {
        EvenChecker e = new EvenChecker();
        if (!e.isEven(2)) throw new AssertionError("Deveria ser Par");
        if (e.isEven(11)) throw new AssertionError("Não deveria ser Par");
    }
}
