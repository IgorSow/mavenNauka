package files;

//import com.google.common.base.Charsets;
//import com.google.common.io.CharSink;
//import com.google.common.io.FileWriteMode;
//import com.google.common.io.Files;

//import java.io.File;
// import java.io.IOException;


//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.sql.CallableStatement;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
//
//public class mainExport {
//
//
//    public static void main(String... args) {
//
////        staraMetodaWysylania();
////      nowaMetodaWysylania();


     //guava

//        String fileName = "D:\\PROGRAMOWANIE\\pliki\\nowyPilikGuava.txt";
//        File file = new File(fileName);
//        CharSink chs = Files.asCharSink(file, Charsets.UTF_8, FileWriteMode.APPEND);
//        try {
//            chs.write("TEST2");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        // apache commons

//        File file = new File("D:\\PROGRAMOWANIE\\pliki\\nowyPilikGuavas.txt");
//        try {
//            FileUtils.writeStringToFile (file, "Spain\r\n", StandardCharsets.UTF_8,true);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }

//    private static void nowaMetodaWysylania() {
//        String tekst = "HELLO WORD DO PLIKU";
//
//        try {
//
//            Files.write(
//                    Paths.get("D:\\PROGRAMOWANIE\\pliki\\nowyPilik.txt"),
//                    tekst.getBytes());
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//
//
//            System.out.println("blad");
//        }
//    }





//
//private static void staraMetodaWysylania(){
//        Path path=Paths.get("D:\\PROGRAMOWANIE\\pliki\\nowyPilik.txt");
//        try(BufferedWriter writer=Files.newBufferedWriter(path))
//        {
//        writer.write("PISZE DO PLIKU");
//        }
//        catch(Exception e){
//        System.out.println("BLAD");
//        }
//        }
//        }
//
