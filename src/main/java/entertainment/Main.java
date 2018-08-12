package entertainment;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String... args) {

        Element element1 = new Element();

        List<Multimedia> multimediaIgora = new ArrayList<>();


        Multimedia firstMultimedia = new Multimedia(Media.GRY, "Diablo 3", 120.55);
        Multimedia firstMultimedia2 = new Multimedia(Media.FILM, "Uprowadzona", 251.51);
        Multimedia firstMultimedia3 = new Multimedia(Media.KSIAZKA, "Java Podstawy", 55.99);
        Multimedia firstMultimedia4 = new Multimedia(Media.MUZYKA, "Jakson", 17.21);


        multimediaIgora.add(firstMultimedia);
        multimediaIgora.add(firstMultimedia2);
        multimediaIgora.add(firstMultimedia3);
        multimediaIgora.add(firstMultimedia4);

        element1.mapOfElements.put(1, multimediaIgora);

        System.out.println(element1.mapOfElements.get(1));


    }

}
