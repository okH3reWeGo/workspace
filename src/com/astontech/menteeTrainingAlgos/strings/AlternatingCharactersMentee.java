package com.astontech.menteeTrainingAlgos.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlternatingCharactersMentee {

    public static void main(String[] args) {
        List<String> testInputs = new ArrayList<>(Arrays.asList("AAAA", "BBBBB", "ABABABAB", "BABABA", "AAABBB"));
        testInputs.forEach(s -> System.out.println(alternatingCharacters(s)));
    }

    private static int alternatingCharacters(String s) {
        List<Character> chars = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        int deleteCount = 0;

        for (int i = 1; i < chars.size(); i++) {
            if (chars.get(i-1) == chars.get(i)) {
                chars.remove(i);
                i--;
                deleteCount++;
            }
        }
        return deleteCount;
    }


}
