package lesson11;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    private T fruit = null;
    protected float a=0.0f;

    public void fruitIn(T object){
        this.fruit=object;
        a=a+fruit.getWeight();
    }

    public T fruitOut() {
        T OutObj = fruit;
        fruit=null;
        //a=this.getWeight()-fruit.getWeight();
        return OutObj;
    }

    public void tranfer(Box <T> toBox){

        toBox.fruitIn(this.fruitOut());
        System.out.println("Фрукт перенесли");
    }

    public float getWeight(){
        System.out.println(a);
        return a;
    }

    public boolean compare(Box <?> toBox) {
        boolean n;
                if (this.getWeight() == toBox.getWeight()) {
                    n = true;
                } else {
                    n = false;
                }
                return n;
    }

}
