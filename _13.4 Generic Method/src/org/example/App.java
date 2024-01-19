package org.example;

import java.util.ArrayList;
import java.util.List;

class Data{
    public <E> void printListData(List<E> list){
        for (E element: list) {
            System.out.println(element);
        }
        System.out.println("*******************");
    }

    public <E> void printArrayData(E[] arrayData){
        for (E element: arrayData) {
            System.out.println(element);
        }
        System.out.println("*******************");
    }
}

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Data data = new Data();
        data.printListData(list);

        List<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        list1.add("five");
        data.printListData(list1);

        String[] stringArray = {"a","b","c","d","e"};
        data.printArrayData(stringArray);

        Integer[] integerArray = {99,98,97,96,95};
        data.printArrayData(integerArray);
    }
}
