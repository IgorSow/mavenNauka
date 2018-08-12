package stringUtils;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {


    public static void main(String... args) {

        String text1 = "Generator piwa na imprezę. Utwórz typ wyliczeniowy GatunekPiwa," +
                " który może przyjmować takie wartości jak: LAGER, PILZNER, STOUT, PORTER, " +
                "MIODOWE. Następnie utwórz klasę Impreza, która w bezargumentowym konstruktorze " +
                "generuje losowo 2 wybrane gatunki piwa i przypisuje je do tablicy 2 elementowej " +
                "(pola klasy Impreza). Następnie dodaj metodę wyświetl nazwę piwa oraz kolor np. " +
                "„Dostępne piwa to: Piwo Miodowe (jasne) oraz Piwo Stout (ciemne)." ;

        //1. tekst na male litery




        List<String> text = new ArrayList<>();
        text.add(text1);

       List<String> a = text.stream()
               .map(p -> p.toLowerCase())
               .collect(Collectors.toList());
       System.out.println("Tutaj sa male litery " + a);



        //2. pociac tekst na slowa i zapisac w tablicy lub liscie

        String[] zad2 = text1.split(" ");

        for ( String ss : zad2) {
            System.out.println(ss);
        }

        //3. usun z tekstu wszystkie samogloski


//        text1 = text1.replaceAll("[AaĄąEeĘęIiOoÓóUuYy]", ":)");
//        System.out.print(text1);

        //4. odwroc kolejnosc slow w tekscie

        List<String> zad3 = Lists.reverse(Arrays.asList(zad2));
        System.out.println(zad3);



    }
}
