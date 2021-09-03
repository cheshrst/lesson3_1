package com.company;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {

    private T obj;

    private int fruitCount;
       private List<T> fruits;
        public Box() {
           this.fruits = new ArrayList<>();
       }
        public void addFruit(int num) {
           fruitCount += num;
       }
            public boolean input(T fruit) {
           return fruits.add(fruit);
       }

           double getWeight() {
           double boxWeight = fruitCount * obj.getCount();
           return boxWeight;
       }
}
