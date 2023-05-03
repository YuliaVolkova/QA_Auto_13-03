package org.example.HW10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HW_10 {
    public static void main(String[] args) {
        printString ("butter, butter, sausage, milk.");


    }

    private static void printString(String s) {
        for (String l : new LinkedHashSet<>(Arrays.asList(s.replace(",", "").replace(".", "").split(" ")))) {
            System.out.println(l.substring(0, 1).toUpperCase() + l.substring(1));

        }
    }
}
