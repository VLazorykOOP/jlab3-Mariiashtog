//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

abstract class AbstractPair {
    protected double a;
    protected double b;

    public AbstractPair(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract AbstractPair add(AbstractPair var1);

    public abstract AbstractPair subtract(AbstractPair var1);

    public abstract AbstractPair multiply(AbstractPair var1);

    public abstract String toString();

    public abstract boolean equals(Object var1);
}
