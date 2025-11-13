//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class Complex2 implements Pair {
    private double real;
    private double imaginary;

    public Complex2(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Pair add(Pair other) {
        if (other instanceof Complex2 c) {
            return new Complex2(this.real + c.real, this.imaginary + c.imaginary);
        } else {
            throw new IllegalArgumentException("Невірний тип!");
        }
    }

    public Pair subtract(Pair other) {
        if (other instanceof Complex2 c) {
            return new Complex2(this.real - c.real, this.imaginary - c.imaginary);
        } else {
            throw new IllegalArgumentException("Невірний тип!");
        }
    }

    public Pair multiply(Pair other) {
        if (other instanceof Complex2 c) {
            return new Complex2(this.real * c.real - this.imaginary * c.imaginary, this.real * c.imaginary + this.imaginary * c.real);
        } else {
            throw new IllegalArgumentException("Невірний тип!");
        }
    }

    public Pair divideByInt(int n) {
        if (n == 0) {
            throw new IllegalArgumentException("Ділення на нуль!");
        } else {
            return new Complex2(this.real / (double)n, this.imaginary / (double)n);
        }
    }

    public String toString() {
        return String.format("%.2f + %.2fi", this.real, this.imaginary);
    }
}
