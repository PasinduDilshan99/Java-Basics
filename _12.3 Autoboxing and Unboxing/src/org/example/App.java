package org.example;

import java.util.ArrayList;

class IntWrapper{
    public int intValue;

    public IntWrapper(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}

public class App {
    public static void main(String[] args) {
//        ArrayList<Integer> studentNumbers = new ArrayList<>();
//        studentNumbers.add(1); // autoboxing
        ArrayList<IntWrapper> studentNumbers = new ArrayList<>();
        studentNumbers.add(new IntWrapper(2)); // boxing
        // boxing mean convert premitive data types in to object
        System.out.println(studentNumbers.get(0).getIntValue());  // unboxing


        ArrayList<Double> demoList = new ArrayList<>();
        demoList.add(23.8); // autoboxing
        demoList.add(new Double(11.2));
        demoList.add(Double.valueOf(33.2)); // in the autoboxing this happen
        System.out.println(demoList);

        System.out.println(demoList.get(0)); //
        System.out.println(demoList.get(0).doubleValue()); // in the unboxing this happen automatically



    }


}
