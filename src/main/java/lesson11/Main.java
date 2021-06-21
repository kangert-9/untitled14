package lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//первое задание
        Massive<Integer> myMassive = new Massive<>(1, 2, 3, 4, 5);
        myMassive.sout();
        myMassive.change(0,1);
        myMassive.sout();


//второе задание
        Listagg<Integer> myArr = new Listagg<>(1, 2, 3, 4, 5);
        myArr.listed();

//третье задание
        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Apple> box3 = new Box<>();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        box1.fruitIn(apple1);
        box2.fruitIn(orange1);
        box2.fruitIn(orange2);

        box2.getWeight();
        box1.tranfer(box3);

        box3.getWeight();

        System.out.println(box2.compare(box3));
    }
}
