import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagrams {
    
    public static void populateMap(HashMap<Character, Integer> map, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                // character already in map
                int value = map.get(str.charAt(i)) + 1;
                map.put(str.charAt(i), value);
            }
            else {
                // character not yet in map
                map.put(str.charAt(i), 1);
            }
        }
    }

    public static int numberNeeded(String first, String second) {
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        int num_removed = 0;

        // populate first map
        populateMap(map1, first);
        populateMap(map2, second);

        // // test - print each map
        // System.out.println("Map 1:");
        // for (Character letter: map1.keySet()) {
        //     int value = map1.get(letter);
        //     System.out.println(letter + ", " + value);
        // }
        // System.out.println("Map 2:");
        // for (Character letter: map2.keySet()) {
        //     int value = map2.get(letter);
        //     System.out.println(letter + ", " + value);
        // }

        // for every unique letter that is not in both strings, count total
        // for every shared letter, count the difference
        for (Character letter: map1.keySet()) {
            if (map2.containsKey(letter) == false) {
                num_removed += map1.get(letter);
            }
        }
        for (Character letter: map2.keySet()) {
            if (map1.containsKey(letter) == false) {
                num_removed += map2.get(letter);
            }
            else {
                num_removed += Math.abs(map1.get(letter) - map2.get(letter));
            }
        }

        // return numbers needed to delete for valid anagram
        return num_removed;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
