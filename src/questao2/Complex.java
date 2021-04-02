package questao2;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex() {
        realPart = 1;
        imaginaryPart = 1;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void sum(Complex other) {
        this.realPart += other.getRealPart();
        this.imaginaryPart += other.getImaginaryPart();
    }

    public void subtract(Complex other) {
        this.realPart -= other.getRealPart();
        this.imaginaryPart -= other.getImaginaryPart();
    }

    @Override
    public String toString() {
        return "(" + realPart + ", " + imaginaryPart + ")";
    }

}
