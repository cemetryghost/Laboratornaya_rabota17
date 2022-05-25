package com.company;

import java.util.ArrayList;
import java.util.List;

abstract class LogisticCompany {
    String name;
    List<String> description = new ArrayList<>();
    public String toString(){
        return "Type of transport company for transportation: " + name + "\n" + description + "\n" + "========================================================================================================================================================================";
    }
}

abstract class TransFactory{
    public abstract LogisticCompany Factory();
}

class Truck extends LogisticCompany {
    public Truck(){
        name = "Truck";
        description.add("Transportation reliability: Average");
        description.add("Maximum weight of the transported cargo: 30000 kg");
        description.add("Travel speed: 120 km/h");
        description.add("Company expense and cost of transportation: 375000 USD");
    }
}

class Airplane extends LogisticCompany {
    public Airplane(){
        name = "Airplane";
        description.add("Transportation reliability: High");
        description.add("Maximum weight of the transported cargo: 500000 kg");
        description.add("Travel speed: 600 km/h");
        description.add("Company expense and cost of transportation: 9980000 USD");
    }
}

class Ship extends LogisticCompany {
    public Ship(){
        name = "Ship";
        description.add("Transportation reliability: Low");
        description.add("Maximum weight of the transported cargo: 8500000 kg");
        description.add("Travel speed: 80 km/h");
        description.add("Company expense and cost of transportation: 7500000 USD");
    }
}

class TransTruck extends TransFactory{
    public LogisticCompany Factory(){
        return new Truck();
    }
}

class TransAir extends TransFactory{
    public LogisticCompany Factory(){
        return new Airplane();
    }
}

class TransShip extends TransFactory{
    public LogisticCompany Factory(){
        return new Ship();
    }
}

public class Main {
    public static void main(String[] args) {
        TransFactory truck = new TransTruck();
        TransFactory air = new TransAir();
        TransFactory ship = new TransShip();
        LogisticCompany companyShip = ship.Factory();
        LogisticCompany companyAir = air.Factory();
        LogisticCompany companyTruck = truck.Factory();
        System.out.println(companyShip);
        System.out.println(companyAir);
        System.out.println(companyTruck);
    }
}
