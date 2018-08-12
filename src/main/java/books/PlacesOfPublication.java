package books;


import java.util.Arrays;
import java.util.List;

public class PlacesOfPublication {

    private String placeOfOrign;
    private List<String> placeOfTranslation;


    public PlacesOfPublication(String placeOfOrign, String... placeOfTranslation) {  // string tutaj zmienil nam tablice
        this.placeOfOrign = placeOfOrign;
        this.placeOfTranslation = Arrays.asList(placeOfTranslation); // to nam zmienia z tablicy na liste
    }

    @Override
    public String toString() {
        return "PlacesOfPublication{" +
                "placeOfOrign='" + placeOfOrign + '\'' +
                ", placeOfTranslation=" + placeOfTranslation +
                '}';
    }
}
