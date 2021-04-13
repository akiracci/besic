package intro;

import java.util.Arrays;

public class ReferenceSample {
    public static void main(String[] args) {
        int[] array1 = {10,20,30};
        int[] arrey2 = array1;
        int[] arrey3 = Arrays.copyOf(array1,3);
        System.out.println("arrey1:" + Arrays.toString(array1));
        System.out.println("arrey2:" + Arrays.toString(arrey2));
        System.out.println("arrey3:" + Arrays.toString(arrey2));
        array1[1] = 40;
        System.out.println("arrey1:" + Arrays.toString(array1));
        System.out.println("arrey2:" + Arrays.toString(arrey2));
        System.out.println("arrey3:" + Arrays.toString(arrey3));



    }
}
