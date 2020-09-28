package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface Comparator {
    void sort(List<Map.Entry<Double, String>> array, int low, int high);
    List<Map.Entry<Double, String>> data = new ArrayList<>();//list из пар элементов
}
