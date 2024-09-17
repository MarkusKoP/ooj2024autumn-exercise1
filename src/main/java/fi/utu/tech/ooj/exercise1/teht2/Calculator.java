package fi.utu.tech.ooj.exercise1.teht2;

import java.util.List;
import java.util.ArrayList;

public class Calculator {
    public static float avg(int[] nums) throws EmptyArrayException {
        if (nums == null || nums.length == 0)
            throw new EmptyArrayException();
        }

        static int summa = 0;
        List<String> negatiiviset = new ArrayList<>(); // alustukset
        boolean virheitä = false;

        for (int indeksi = 0; indeksi < nums.length; indeksi++) { // läpikäynti
            if (nums[indeksi] < 0){ // onko negatiivinen
                String virhe = ("Antamasi taulukon" + (indeksi+ 1) + "luku" + nums[indeksi] + "on negatiivinen.");
                negatiiviset.add(virhe); // tallennetaan virhe viesti negatiivisesta
                virheitä = true;
            }
            else {
                summa += nums[indeksi];
            }
        if (virheitä){
            throw new IllegalArgumentException(String.join("\n", negatiiviset)); // tarkistettu tekoälyltä syntaksi
        }
        }
        return (float) summa / nums.length; //joko toimii
    }
