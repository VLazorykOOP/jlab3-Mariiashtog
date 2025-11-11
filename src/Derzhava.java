//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class Derzhava {
    protected String name;
    protected double area;
    protected long population;

    public Derzhava(String name, double area, long population) {
        this.name = name;
        this.area = area;
        this.population = population;
    }

    public void Show() {
        System.out.println("Держава: " + this.name);
        System.out.println("Площа: " + this.area + " км²");
        System.out.println("Населення: " + this.population + " осіб");
    }
}
