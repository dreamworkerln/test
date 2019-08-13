package ru.home.pecs.test03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main(String[] args) {

        new App();
    }
    
    

    App() {

        Storage<Car> storage = new Storage<>();


        Consumer<Vehicle> vConsumer = vehicle -> System.out.println("Consumer:" + vehicle.getModel());

        storage.consume(vConsumer, new Car("bmw"));
        
        // -------------------------------------------------------

        List<Vehicle> list = new ArrayList<>();
        list.add(new Car("bmw"));
        list.add(new Car("opel"));

        storage.consumeData(list);


        // -------------------------------------------------------

        Consumer<List<Vehicle>> vListConsumer = vehicles -> {
            System.out.println("Consumer:");
            for(Vehicle v: vehicles) {
                System.out.println(v.getModel());
            }
        };

        // Error: java: incompatible types: java.util.function.Consumer<java.util.List<ru.home.pecs.test03.Vehicle>>
        // cannot be converted to java.util.function.Consumer<java.util.List<? super ru.home.pecs.test03.Car>>
        storage.consumeList(vListConsumer, list);
    }

}
