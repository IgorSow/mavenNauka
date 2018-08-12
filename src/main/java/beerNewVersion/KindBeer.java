package beerNewVersion;

public enum KindBeer{

    LAGER(0, "JASNE"),
    PILZNER(1, "CIEMNE"),
    STOUT(2, "JASNE"),
    PORTER(3, "JASNE"),
    MIODOWE(4, "CIEMNE");

    int number;
    String colorBeer;


    KindBeer(int number, String colorBeer) {
        this.number = number;
        this.colorBeer = colorBeer;
    }

    @Override
    public String toString() {
        return "Wylosowane piwko to : {" +
                "Nazwa piwa = " + name() +
                " Kolor Piwa = " + colorBeer +
                '}';
    }
}





