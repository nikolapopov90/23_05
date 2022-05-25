package predavanje;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Planina planina = new Planina("Jahorina", "Bosna i Hercegovina", 1900);
        Planinar rekreativac1 = new RekreativniPlaninar (111, "Petar Peric", 20,"Sumadijski", 2000);
        Planinar rekreativac2 = new RekreativniPlaninar(112,"Dejan Matic",30,"Sremski",1500);
        Planinar rekreativac3 = new RekreativniPlaninar(113,"Tijana Stanic",10,"Banatski",2500);
        Planinar alpinista1 = new Alpinista(114,"Darko Pantic",100);
        Planinar alpinista2 = new Alpinista(115,"Marija Jolic",130);
        Planinar alpinista3 = new Alpinista(116,"Mila Galic",140);

        ArrayList<Planinar> listaPlaninara = new ArrayList<>();
        listaPlaninara.add(rekreativac1);
        listaPlaninara.add(rekreativac2);
        listaPlaninara.add(rekreativac3);
        listaPlaninara.add(alpinista1);
        listaPlaninara.add(alpinista2);
        listaPlaninara.add(alpinista3);
        System.out.println(listaPlaninara);

    }
}
