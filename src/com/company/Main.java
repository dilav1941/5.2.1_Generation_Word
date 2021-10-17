package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String s1 = "Карл у Клары украл *игрушку* Клара у Карла украла ключи от Tesla";

        Function <String, List<String>> function = str -> Arrays.stream(str.split(" "))
                .sorted(Comparator.naturalOrder())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(function.apply(s1).toString());
    }
}
