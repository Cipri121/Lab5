package Exercitiu1;

import Exercitiu1.PerecheNumere;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void scriere(List<PerecheNumere> lista) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("src/main/resources/perechi.json");
            mapper.writeValue(file, lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<PerecheNumere> citire() {
        try {
            File file = new File("src/main/resources/perechi.json");
            ObjectMapper mapper = new ObjectMapper();
            List<PerecheNumere> perechi = mapper.readValue(file, new TypeReference<List<PerecheNumere>>() {
            });
            return perechi;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        List<PerecheNumere> perechi = new ArrayList<>();
        perechi = citire();
        perechi.add(new PerecheNumere(1, 3));
        perechi.add(new PerecheNumere(2, 4));
        scriere(perechi);
    }
}
