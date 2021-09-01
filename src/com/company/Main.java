package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public void main(String[] args) {
//    Первое задание
        Scanner scanner = new Scanner(System.in);
        int firstNum, secondNum;

        Integer[] firstArray ={};
        System.out.println("Введите размер массива");
        int sizeMass = scanner.nextInt();
        firstArray= new Integer[sizeMass];
        System.out.println("Введите значения массива");
        for(int i = 0; i < firstArray.length; i++){
            int num = scanner.nextInt();
                firstArray[i] = num;
        }
        System.out.println("Введите номер первого элемента");
        firstNum=scanner.nextInt() -1;
        System.out.println("Введите номер второго элемента");
        secondNum = scanner.nextInt() -1;
        swap(firstArray,firstNum,secondNum);
        System.out.print("Ваша строка: ");
        for(int i=0; i<firstArray.length;i++){
            System.out.print(firstArray[i] + " ");
        }
        System.out.println("");
//  Второе задание
        System.out.print("Конвертация в ArrayList: ");
        List<Integer> secondArray = new ArrayList<Integer>();
        secondArray = Arrays.asList(firstArray);
        for (Integer num : secondArray){
            System.out.print(" " + num);
        }
//  Третье задание
        System.out.println("Большая задача");
//  Можно использовать для "Смешания" фруктов
//        final Box<Fruit> box= new Box<>();
        final Box<Apple> appleBox = new Box<>();
        final Box<Orange> orangeBox = new Box<>();
        appleBox.input(new Apple(10));
        orangeBox.input(new Orange(20));
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.print(appleBox.compare(orangeBox));



    } public static void swap(Object[] arr, int index1, int index2){
        Object swapNum = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = swapNum;
    }
    class Box<T extends Fruit>{
    private T obj;
    private int fruitCount;
        private List<T> fruits;
        public Box(){
            this.fruits= new ArrayList<>();
        }
        // ??11
        public void addFruit(int num){
            fruitCount += num;
        }
//        public void transposeFruit()
        double getWeight() {
            double boxWeight = fruitCount * obj.getCount();
            return boxWeight;
        }

        public boolean input(T fruit){
            return  fruits.add(fruit);
        }
        public boolean compare(Box<?> box) {
            return this.getWeight() == box.getWeight();
        }
    }
}