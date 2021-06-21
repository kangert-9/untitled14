package lesson11;

import java.util.Arrays;

public class Massive<T extends Number> {
    public T[] nums;

    public Massive(T... nums) {
        this.nums = nums;
    }

    public void sout (){
        System.out.println(Arrays.asList(nums).toString());
    }

    public void change(int i, int j){
        Object obj = nums[i];
        nums[i]=nums[j];
        nums[j]= (T) obj;
        System.out.println("Элементы поменяли местами");
    }
}
