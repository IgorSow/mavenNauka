package entertainment;


import java.util.Set;

public class Multimedia {

    private Media nameOfMedia;
    private String title;
    private double price;

    public Multimedia(Media nameOfMedia, String title, double price) {
        this.nameOfMedia = nameOfMedia;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Multimedia \n " +
                "Rodzaj mediow= " + nameOfMedia + " \n " +
                "Tytul= '" + title + '\'' + " \n " +
                "Cena " + price + "zl" + " \n \n" ;

    }
}