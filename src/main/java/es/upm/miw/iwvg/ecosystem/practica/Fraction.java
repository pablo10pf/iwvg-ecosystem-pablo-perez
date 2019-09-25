package es.upm.miw.iwvg.ecosystem.practica;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public boolean isGreater(Fraction fraction) {
        return this.decimal() > fraction.decimal();
    }

    public boolean isSmaller(Fraction fraction) {
        return this.decimal() < fraction.decimal();
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

}
