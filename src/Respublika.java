//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class Respublika extends Derzhava {
    private String president;
    private String formOfGovernment;

    public Respublika(String name, double area, long population, String president, String formOfGovernment) {
        super(name, area, population);
        this.president = president;
        this.formOfGovernment = formOfGovernment;
    }

    public void Show() {
        super.Show();
        System.out.println("Президент: " + this.president);
        System.out.println("Форма правління: " + this.formOfGovernment);
        System.out.println();
    }
}
