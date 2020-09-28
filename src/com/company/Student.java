package com.company;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;

public class Student implements Comparator{
    public Student(String _name, double _id){
        Map.Entry<Double, String> pair1 = new AbstractMap.SimpleEntry<>(_id, _name);//создание пары
        data.add(pair1);
        sort(data, 0, data.size()-1);
    }
    public void add(String _name, double _id){
        Map.Entry<Double, String> pair1 = new AbstractMap.SimpleEntry<>(_id, _name);//создание пары
        data.add(pair1);
        sort(data, 0, data.size()-1);
    }
    @Override
    public void sort(List<Map.Entry<Double, String>> array, int low, int high) {
        if (array.size() == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        double opora = array.get(middle).getKey();
        int i = low, j = high;
        while (i <= j) {
            while (array.get(i).getKey() < opora) {
                i++;
            }
            while (array.get(j).getKey() > opora) {
                j--;
            }
            if (i <= j) {//меняем местами
                Map.Entry<Double, String> temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
                i++;
                j--;
            }
        }
        if (low < j)
            sort(array, low, j);
        if (high > i)
            sort(array, i, high);
    }
    public void print(){
        for(int i= data.size()-1;i > -1;i--){
            System.out.println(data.get(i).getValue() + " " + data.get(i).getKey());
        }
    }
}
