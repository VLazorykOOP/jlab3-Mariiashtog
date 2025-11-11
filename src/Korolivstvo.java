//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class Korolivstvo extends Monarkhiya {
    private String queen;

    public Korolivstvo(String name, double area, long population, String monarch, String dynasty, String queen) {
        super(name, area, population, monarch, dynasty);
        this.queen = queen;
    }

    public void Show() {
        super.Show();
        System.out.println("Король: " + this.monarch);
        System.out.println("Королева: " + this.queen);
        System.out.println();
    }
}
