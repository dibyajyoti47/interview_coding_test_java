package tests.ust_global;

import java.util.*;

public class SortStringsWithCharacterCount {
    public static void main(String[] args) {
        String str = "ffffreeeedommm";
        System.out.println(getOutput(str));
    }

    private static String getOutput(String str) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if (charMap.containsKey(c)) charMap.put(c, charMap.get(c)+1);
            else charMap.put(c, 1);
        }
        Map<CharacterCount, String> sortedCharacterMap = new TreeMap<>(new CharacterSorter());
        charMap.keySet().stream().forEach(character -> {
            sortedCharacterMap.put(new CharacterCount(character, charMap.get(character)), "CONSTANT");
        });
        StringBuffer result = new StringBuffer("");
        sortedCharacterMap.keySet().stream().forEach((characterCount -> {
            for (int i=1;i<=characterCount.count;i++) {
                result.append(characterCount.character);
            }
        }));
        return result.toString();
    }
}

class CharacterSorter implements Comparator<CharacterCount> {
    @Override
    public int compare(CharacterCount o1, CharacterCount o2) {
        if (o1.count == o2.count) return o1.character.compareTo(o2.character);
        return o2.count - o1.count;
    }
}

class CharacterCount {
    public Character character;
    public int count;

    public CharacterCount(char character, int count) {
        this.character = character;
        this.count = count;
    }

}