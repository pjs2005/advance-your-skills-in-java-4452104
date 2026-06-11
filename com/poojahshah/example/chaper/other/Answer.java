package com.poojahshah.example.chaper.other;

import java.util.List;
import java.util.stream.Collectors;

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Modfify the list to remove the String in toRemove
    static String modifyList(List<String> items, String toRemove) {

        return items.stream().filter(item -> !item.equals(toRemove)).collect(Collectors.toList()).toString();
    }

}

