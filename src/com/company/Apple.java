package com.company;

public class Apple extends Fruit {
        protected Apple(int count){
            super(count);
        }
    public void getWeight(){
         double Weight = getCount();
         System.out.print(Weight);
    }
}
