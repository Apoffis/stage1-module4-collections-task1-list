package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {

    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        int aToInt = Integer.parseInt(a);
        int bToInt = Integer.parseInt(b);

        if (formula(aToInt) > formula(bToInt)) return 1;
        else if (formula(aToInt) < formula(bToInt)) return -1;
        else {
            return Integer.compare(aToInt, bToInt);
        }
    }

    double formula(int num) {
        return 5 * Math.pow(num, 2) + 3;
    }
}
