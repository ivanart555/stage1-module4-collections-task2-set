package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {

        NavigableSet<Integer> result = new TreeSet<>();

        for (Integer number : sourceList) {
            result.add(number * number);
        }

        return result.subSet(lowerBound, true, upperBound, true);
    }
}
