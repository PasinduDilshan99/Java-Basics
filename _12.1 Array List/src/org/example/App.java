package org.example;

import java.util.ArrayList;

public class App {

    static ArrayList<String> listNames = new ArrayList<>();

    public static void main(String[] args) {
        listNames.add("abc");
        listNames.add("def");
        listNames.add("ghi");
        listNames.add("jkl");
        listNames.add("mno");
       // System.out.println(listNames.get(0));
        App app = new App();
        app.display(listNames);
        app.removeNameByPosition(3);
        app.display(listNames);
        app.removeNameByName("mno");
        app.display(listNames);
    }

    void display(ArrayList<String> names){
        for (String name:names) {
            System.out.println(name);
        }
        System.out.println("************************");
    }

    void removeNameByPosition(int position){
        listNames.remove(position);
    }
    void removeNameByName(String name){
        listNames.remove(name);
    }
}
