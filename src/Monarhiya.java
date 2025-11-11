//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class Monarkhiya extends Derzhava {
    protected String monarch;
    protected String dynasty;

    public Monarkhiya(String name, double area, long population, String monarch, String dynasty) {
        super(name, area, population);
        this.monarch = monarch;
        this.dynasty = dynasty;
    }

    public void Show() {
        super.Show();
        System.out.println("Монарх: " + this.monarch);
        System.out.println("Династія: " + this.dynasty);
        System.out.println();
    }
}
