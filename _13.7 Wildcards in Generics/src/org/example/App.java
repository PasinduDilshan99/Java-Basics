package org.example;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
    private int vehicleId;

    public Vehicle(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                '}';
    }
}

class Car extends Vehicle{
    private String carModel;

    public Car(int vehicleId, String carModel) {
        super(vehicleId);
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                '}';
    }
}


public class App {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle(101));
        list.add(new Vehicle(102));
        list.add(new Vehicle(103));
        list.add(new Vehicle(104));
        list.add(new Vehicle(105));
        list.add(new Car(106,"model 1"));
        display(list);
    }

    public static void display(List<? extends Vehicle> list){
        for (Vehicle element: list) {
            System.out.println(element);
        }
    }
}
