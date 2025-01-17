package org.example;

import java.util.Arrays;
import java.util.Optional;

public class StreamSearch {

    // Adım 3: Stream API ile öğeyi arama
    public static <T> int findElementIndex(T[] array, T item) {
        Optional<Integer> result = Arrays.stream(array)
                .map(element -> Arrays.asList(array).indexOf(element))
                .filter(index -> array[index].equals(item))
                .findFirst();

        return result.orElse(-1);
    }

    public static void main(String[] args) {
        String[] stringArray = {"Geometri", "Matematik", "Kimya"};
        Integer[] intArray = {1, 2, 3, 4, 5};

        int stringIndex = findElementIndex(stringArray, "Matematik");
        System.out.println("Matematik bulunduğu index: " + stringIndex);

        int intIndex = findElementIndex(intArray, 20);
        System.out.println("20 bulunduğu index: " + intIndex);
    }
}
