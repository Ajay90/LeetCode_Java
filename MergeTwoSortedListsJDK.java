/*
* Copyright (C) 2026 Ajay Dhage
* SPDX-License-Identifier: MIT
*/

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MergeTwoSortedListsJDK {

    public static LinkedList<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        LinkedList<Integer> merged = new LinkedList<>();
        
        ListIterator<Integer> it1 = list1.listIterator();
        ListIterator<Integer> it2 = list2.listIterator();

        // Compare elements while both lists still have items
        while (it1.hasNext() && it2.hasNext()) {
            int val1 = it1.next();
            int val2 = it2.next();

            if (val1 <= val2) {
                merged.add(val1);
                it2.previous(); // step back it2 since val2 wasn't used yet
            } else {
                merged.add(val2);
                it1.previous(); // step back it1 since val1 wasn't used yet
            }
        }

        // Append remaining elements from whichever list isn't empty
        while (it1.hasNext()) {
            merged.add(it1.next());
        }
        while (it2.hasNext()) {
            merged.add(it2.next());
        }

        return merged;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(List.of(1, 2, 4));
        LinkedList<Integer> list2 = new LinkedList<>(List.of(1, 3, 4));

        LinkedList<Integer> result = mergeTwoLists(list1, list2);

        // Built-in printing works out of the box!
        System.out.println(result); // Output: [1, 1, 2, 3, 4, 4]
    }
}

// Time Complexity: O(n + m)
// Space Complexity: O(n + m)
