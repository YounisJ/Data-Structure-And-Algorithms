package Sorting;

import java.util.Arrays;
System.out.print("");
public class Bubble_sort_On_String {
    public static void main(String[] args) {

        // String array to be sorted
        String[] names = {
            "John", "Alice", "Bob", "Emma", "Daniel",
            "Olivia", "Liam", "Sophia", "Ethan", "Ava",
            "William", "Mia", "James", "Charlotte", "Michael",
            "Emily", "Benjamin", "Amelia", "Henry", "Grace"
        };

        int k = 0, j = 0;
        String store = " ";
        int index = 0;

        System.out.println(Arrays.toString(names));

        while (k < names.length) {
            j = 0;
            while (j < names.length - 1) {

                if (index < names[j].length() && index < names[j + 1].length() &&
                    names[j].charAt(index) == names[j + 1].charAt(index)) {
                    if (names[j].charAt(index) > names[j + 1].charAt(index)) {
                        store = names[j];
                        names[j] = names[j + 1];
                        names[j + 1] = store;
                    }
                    index++;
                } else if (index < names[j].length() && index < names[j + 1].length() &&
                           names[j].charAt(index) > names[j + 1].charAt(index)) {
                    store = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = store;
                }

                j++;
            }
            k++;
            index = 0; // Reset index to 0 for the next pass
        }

        for (String st : names) {
            System.out.println(st);
            
//            Arrays.sort(names);
        }
    }
}
