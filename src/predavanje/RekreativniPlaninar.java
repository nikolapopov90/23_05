package predavanje;

public class RekreativniPlaninar extends Planinar{
    private int tezinaOpereme;
    private String okrug;
    private int maxUspon;

    public RekreativniPlaninar() {
    }

    public RekreativniPlaninar(int id, String imePrezime, int tezinaOpereme, String okrug, int maxUspon) {
        super(id, imePrezime);
        this.tezinaOpereme = tezinaOpereme;
        this.okrug = okrug;
        this.maxUspon = maxUspon;
    }

    public void stampaj () {
        System.out.println("Rekreativac, " + "id: " + getId() + "ime: " + getImePrezime() + "Okrug: " + this.okrug);
    }
    public int clanarina () {
        return 1000;
    }
    public boolean uspesanUspon (Planina planina) {
        int duzinaNaKojuUticeOprema = this.tezinaOpereme * 50;
        return (this.maxUspon - duzinaNaKojuUticeOprema) > planina.getVisinaPlanine();
    }

    @Override
    public String toString() {
        return tezinaOpereme +
                " " + okrug +
                " " + maxUspon +
                " " + super.toString();
    }
}
