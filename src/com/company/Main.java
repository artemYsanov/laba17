package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    LogisticFactory myRoadFactory = new RoadLogisticFactory();
    LogisticFactory myAirFactory = new AirLogisticFactory();
    LogisticFactory mySeaFactory = new SeaLogisticFactory();
    Logistic myRoadLogistic = myRoadFactory.createLogistic();
    Logistic myAirLogistic = myAirFactory.createLogistic();
    Logistic mySeaLogistic = mySeaFactory.createLogistic();
    System.out.println(myRoadLogistic);
    System.out.println(myAirLogistic);
    System.out.println(mySeaLogistic);
    }
}
abstract class Logistic{
    String Transport;
    List<String> accessories = new ArrayList();
    public String toString(){
        return "Вид траспорта: " + Transport + "\n" + accessories;
    }
}
abstract class LogisticFactory{
    public abstract Logistic createLogistic();
}
class RoadLogisticFactory extends LogisticFactory{
    public Logistic createLogistic(){
        return new RoadLogistic();
    }
}
class AirLogisticFactory extends LogisticFactory{
    public Logistic createLogistic(){
        return new AirLogistic();
    }
}
class SeaLogisticFactory extends LogisticFactory{
    public Logistic createLogistic(){
        return new SeaLogistic();
    }
}
class RoadLogistic extends Logistic{
    public RoadLogistic(){
        Transport = "Грузовик";
        accessories.add("Вместимость в тоннах");
        accessories.add("Потребление топлива");
        accessories.add("Время в пути");
        accessories.add("Навигационная система");
    }
}
class AirLogistic extends Logistic{
    public AirLogistic(){
        Transport = "Самолёт";
        accessories.add("Вместимость в тоннах");
        accessories.add("Потребление топлива");
        accessories.add("Время в пути");
        accessories.add("Навигационная система");
    }
}
class SeaLogistic extends Logistic{
    public SeaLogistic(){
        Transport = "Корабль";
        accessories.add("Вместимость в тоннах");
        accessories.add("Потребление топлива");
        accessories.add("Время в пути");
        accessories.add("Навигационная система");
    }
}