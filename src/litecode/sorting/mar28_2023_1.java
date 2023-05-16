package litecode.sorting;

import java.util.HashMap;
import java.util.Map;

public class mar28_2023_1 {
    public String frequencySort(String s) {

        char[] chars = s.toCharArray();
        HashMap<Character, Integer> thwoo = new HashMap();
        for (char charsAt : chars) {
            if (thwoo.containsKey(charsAt)) {
                thwoo.replace(charsAt, thwoo.get(charsAt) + 1);
            } else {
                thwoo.put(charsAt, 1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();

//        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
//            stringBuilder.append(String.valueOf(entry.getKey()).repeat(hashMap.get(entry.getKey())));

//        }
//        return String.valueOf(stringBuilder);
        thwoo.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(entry -> {
                    stringBuilder.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
                });
        return stringBuilder.toString();
    }
}
