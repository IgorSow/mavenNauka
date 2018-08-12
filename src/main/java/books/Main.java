package books;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {


    public static void main(String... args) {

        //ksiazka autora wg roku wydania a ksiazki
        //wg miejsca wydania alfabetu

        Autor komudaJacek = new Autor();

        List<Book> listOfBooks2000 = new ArrayList<>();
        PlacesOfPublication placeOfPublication = new PlacesOfPublication("Poland", "Czech", "Russia", "Ukraine");

        Set<TypeOfBook> typesOfBookHashSet = new HashSet<>();

        typesOfBookHashSet.add(TypeOfBook.COMEDY);
        typesOfBookHashSet.add(TypeOfBook.ROMANCE2);

        Book firstBook = new Book(2000,typesOfBookHashSet,"TitleOne", placeOfPublication);


        listOfBooks2000.add(firstBook);

//        komudaJacek.mapOfBooks.put(2000, listOfBooks2000);


        System.out.println(komudaJacek.mapOfBooks.get(2000));




    }
}
