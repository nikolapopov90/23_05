package predavanje;

public class Alpinista extends Planinar{
    private int poeni;

    public Alpinista() {
    }

    public Alpinista(int id, String imePrezime, int poeni) {
        super(id, imePrezime);
        this.poeni = poeni;
    }

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    public void stampaj () {
        System.out.println("Alpinista, " + " id: " + getId() + " ime: " + getImePrezime() + " Poeni: " + this.poeni);
    }
    public int clanarina () {
        return 1500;
    }
    public int izracunajClanarinu() {
        int clanarina = 1500 - 50 * this.poeni;
        if (clanarina < 0) {
            return 0;

        } else return clanarina;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        return planina.getVisinaPlanine() < 4000;
    }

    @Override
    public String toString() {
        return poeni +
                " " + super.toString();
    }
}
