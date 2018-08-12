package horserace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hourse {

    private String name;



    public Hourse(String name) {
        this.name = name;

    }

    public Hourse(){

    }

    public List ListOfHource()

    {
        List<Hourse> hourses = new ArrayList<>();

        hourses.add(new Hourse("Szybki Bil"));
        hourses.add(new Hourse("Sredni Zak"));
        hourses.add(new Hourse("Wolny Czo"));
        hourses.add(new Hourse("Blyskawiczny Kucyk"));




    return hourses;

    }

    public int WinningHourse() {

        Random rn = new Random();

        int n = (ListOfHource().size());
        int i = rn.nextInt() % n;

        if (i < 0 ) {

            i = i * (-1);
        }


        int winningHourse = i;

//        System.out.println("Wygrany kon to " + winningHourse );

        return winningHourse;


    }

    @Override
    public String toString() {
        return "KON: " +
                "Imie = " + name ;

    }
}
