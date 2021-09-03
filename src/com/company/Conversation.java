package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversation<T> {
    private T[] obj;
    public Conversation(T[] obj){
        this.obj = obj;
    }
    public void conversation(){
                List<Integer> secondArray = new ArrayList<Integer>();
        secondArray = (List<Integer>) Arrays.asList(obj);
        for (Integer num : secondArray) {
            System.out.print(" " + num);
        }
    }
}

