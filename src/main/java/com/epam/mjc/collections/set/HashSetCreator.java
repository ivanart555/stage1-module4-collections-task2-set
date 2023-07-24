package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer> result = new HashSet<>();

        for (Integer number : sourceList) {
            if (number % 2 == 0) {
                int temp = number;
                while (temp % 2 == 0) {
                    result.add(temp);
                    temp = temp / 2;
                    if (temp % 2 != 0) result.add(temp);
                }
            } else {
                result.add(number);
                result.add(number * 2);
            }
        }

        return result;

    }
}
