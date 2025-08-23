package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.xml.stream.events.Characters;

public class SlidingWindow {
    public static void main(String[] args) {
        // frequency calculation using hashMaps in Strings
        frequencyCalc("Pankaj");
    }
    public static void frequencyCalc(String s){
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        System.out.println(hm);
    }

}