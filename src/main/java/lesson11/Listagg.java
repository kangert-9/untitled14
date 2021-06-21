package lesson11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Listagg<T> {
    public T[] nums;

    public Listagg(T... nums) {
        this.nums = nums;
    }
    public Object listed() {
        ArrayList<Integer>newList = new ArrayList(Arrays.asList(nums));
        System.out.println("Массив стал листом");
        System.out.println(newList.toString());
        return newList;
    }
}
