package ru.home.pecs.test03;

import java.util.List;
import java.util.function.Consumer;

public class Storage<T> {

    void consume(Consumer<? super T> consumer, T data) {

        consumer.accept(data);
    }


    void consumeData(List<? super T> list) {

        System.out.println("consumedData:");
        System.out.println(list);
    }

    void consumeList(Consumer<List<? super T>> consumer, List<? super T> list) {

        consumer.accept(list);
    }
}

