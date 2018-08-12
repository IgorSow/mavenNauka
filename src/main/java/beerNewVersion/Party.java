package beerNewVersion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Party {

// ver 1    private KindBeer[] kindBeers = new KindBeer[2];
    private List<KindBeer> kindBeers = new ArrayList<>();


    public  Party() {

        kindBeers.add(KindBeer.values()[randomNumber()]);
        kindBeers.add(KindBeer.values()[randomNumber()]);
//   ver 1     kindBeers[0] = KindBeer.values()[randomNumber()];
//   ver 1     kindBeers[1] = KindBeer.values()[randomNumber()];

        //ver2 List<String> asd = new ArrayList<>();
        //listaPiw.add(zwrocLosowePiwo()); //dwa razy

    }

//    public KindBeer[] getKindBeers() {
//        return kindBeers;
//    }

    public void wyswietl(){

                kindBeers.forEach(p -> System.out.println(p));



                ;
    }


    public int randomNumber (){

        int number = (int) (Math.random() * 5);


        return number;
    }



//    @Override
//    public String toString() {
//        return
//                "Wylosowane piwko to : =" + Arrays.toString(kindBeers) +
//                '}';
//    }
}
