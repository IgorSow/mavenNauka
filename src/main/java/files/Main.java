package files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String... args) {


        //wyjatki
        //zapisywanie i odczytywnie plikow
        //zapisywanie i odczytywnie plikow D:\PROGRAMOWANIE\plik_csv
        //   D:\PROGRAMOWANIE\pliki
        //wynik bedziemy przechowywac w tablicy

        //       metodaTruga();
        //        testMethodTryCatch(args);

        //       importText(); // metoda 1


        // NAJNOWSZY TEN UZYWAMY !!! - wprowadzenie do lambdy

//        String fileName = "D:\\PROGRAMOWANIE\\pliki\\plik_tekstowy.txt";
//
//        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
//
//            stream.forEach(System.out::println);
//
//
//        } catch (IOException e) {
//
//            System.out.println("blad");
//
//        }
//    }


//    private static void metodaTruga() {
//        String fileName = "D:\\PROGRAMOWANIE\\pliki\\plik_tekstowy.txt";
//
//        try (Scanner scanner = new Scanner(new File(fileName))) {
//
//            while (scanner.hasNext()) {
//                System.out.println(scanner.nextLine());
//
//            }
//        } catch (IOException e) {
//
//            System.out.println("blad");
//
//        }
//    }
//}


//    private static void importText() {
//        String fileName = "D:\\PROGRAMOWANIE\\plik1\\plik_tekstowy.txt";
//
//        //try with resourses -- > try catch + finally z zamknieciem
//
//        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
//            String line;
//
//            while ((line = br.readLine()) != null) {
//
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//
//            System.out.println("blad");
//
//        }
//    }
//// CTRL + ALT + M - przeciaga do metody
//
//    private static void testMethodTryCatch(String[] args) {
//        int a = Integer.valueOf(args[0]);
//        int b = Integer.valueOf(args[1]);
//
//
//        try {
//            int zmienna = a / b;
//
//            System.out.println("TO SIE NIE WYKONA JAK BEDZIE BLAD");
//
//        } catch (ArithmeticException error) {
//
//            System.out.println("Mamy blad dzielenie przez zero");
//
//        } finally {
//            System.out.println("TO sie wykona zawsze");
//        }
//
//        System.out.println("Koniec programu");
//    }

        // --------------------------------------------------------------------------- CSV PONIZEJ


        String csvFile = "D:\\PROGRAMOWANIE\\pliki\\plik_csv.csv";
        String line = " ";
        String csvSplitBy = ",";

        List<Person> myPersonList = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] personRecord  = line.split(csvSplitBy);
                String id = personRecord[0];
                String first_name= personRecord[1];
                String last_name= personRecord[2];
                String email = personRecord[3];
                String gender = personRecord[4];
                String ip_address = personRecord[5];

                Person newPerson = new Person(id,first_name,last_name,email,gender,ip_address);
                myPersonList.add(newPerson);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(myPersonList);


 //       readFile(csvFile, csvSplitBy);

    }



    }

//    private static void readFile(String csvFile, String csvSplitBy) {
//        String line;
//        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//
//            while ((line = br.readLine()) != null) {
//
//                String[] asd = line.split(csvSplitBy);
//                System.out.println(asd[0]);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(" ");
//    }
//}


