package org.example;

class Data<K,V>{
    private K key;
    private V value;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
    public <E extends Character,N extends Number> void display(E element, N number){
        System.out.println("Element : " + element + " Number : "+ number);

    }
}

class Data2<K extends Integer, V extends App>{
    private K key;
    private V value;

    public Data2(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data2{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

public class App {
    public static void main(String[] args) {
        Data<Integer,String> data = new Data<>(1, "value1");
        data.display('%',2);

        Data2<Integer, App> data2 = new Data2<>(1001,new App());
        data2.getValue().testMethod();
    }

    public void testMethod(){
        System.out.println("hi");
    }
}
