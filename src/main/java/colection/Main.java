package colection;

import java.util.*;

public class Main {

    public static void main(String... args){

        List<String> myList = new ArrayList();

        myList.add("pierwszy");
        myList.add("drugi");
        myList.addAll(Arrays.asList("trzeci", "czwarty"));

        myList.forEach(System.out::println); /// pierwsza metoda

        myList.forEach(element -> System.out.println(element));     // druga metoda


        for(String element : myList) {              //trzecia metoda
            System.out.println(element);
        }

        for (int i =0; i <myList.size(); i++)    //trzecia metoda
        {
            System.out.println(myList.get(i));
        }


        Map<String, Double> map = new HashMap<>();
        map.put("alfa", 12.22);





    }
}
