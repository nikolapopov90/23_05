package predavanje;

public abstract class Planinar {
    private int id;
    private String imePrezime;
    public abstract void stampaj();
    public abstract int clanarina();
    public abstract boolean uspesanUspon(Planina planina);

    public Planinar() {
    }

    public Planinar(int id, String imePrezime) {
        this.id = id;
        this.imePrezime = imePrezime;
    }

    public int getId() {
        return id;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    @Override
    public String toString() {
        return id +
                " " + imePrezime;
    }
}
