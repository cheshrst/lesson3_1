package com.company;


public class Swap<T, V, D> {
    private T[] obj1;
    private V obj2;
    private D obj3;

    public Swap(T[] obj1, V obj2, D obj3) {
    this.obj1 = obj1;
    this.obj2 = obj2;
    this.obj3 = obj3;
    }
    public void swapMass(){
        Object swapNum = obj1[(int) obj2];
        obj1[(int) obj2] = obj1[(int) obj3];
        obj1[(int) obj3] = (T) swapNum;

    }
}


