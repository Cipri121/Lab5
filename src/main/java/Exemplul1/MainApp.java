package Exemplul1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
public class MainApp {
    public static void scriere(List<persoana> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("src/main/resources/persoane.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<persoana> citire() {
        try {
            File file=new File("src/main/resources/persoane.json");
            ObjectMapper mapper=new ObjectMapper();
            List<persoana> persoane = mapper.readValue(file, new TypeReference<List<persoana>>(){});
            return persoane;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        List<persoana> persoane=citire();
        System.out.println(persoane);
        for(persoana p:persoane){
            System.out.println(p);
        }
        persoane.add(new persoana("Maria",33));
        scriere(persoane);
    }
}
