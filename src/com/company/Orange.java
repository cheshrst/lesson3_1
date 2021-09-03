package com.company;

public class Orange extends Fruit{
    protected Orange(int count) {
        super(count);
    }
    public void getWeight(){
        double Weight = getCount();
        System.out.print(Weight * 1.5);
    }
//    public Orange(){
//        this.count = count;
//
//    }
//public double fruitCount(){
//    return getCount() * 1.5;
//}
}
