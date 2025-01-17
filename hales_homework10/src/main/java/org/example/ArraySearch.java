package org.example;

import java.util.Arrays;
import java.util.Optional;

public class ArraySearch {

    public static <T> T searchArray(T[] array, T item) {
        Optional<T> result = Arrays.stream(array)
                .filter(element -> element.equals(item))
                .findFirst();
        return result.orElse(null);
    }

    public static void main(String[] args) {
        String[] stringArray = {"Geometri", "Matematik", "Kimya"};
        Integer[] intArray = {1, 2, 3, 4, 5};

        String stringResult = searchArray(stringArray, "Matematik");
        System.out.println("Bulunan öğe: " + (stringResult != null ? stringResult : "Bulunamadı"));

        Integer intResult = searchArray(intArray, 20);
        System.out.println("Bulunan öğe: " + (intResult != null ? intResult : "Bulunamadı"));
    }
}
