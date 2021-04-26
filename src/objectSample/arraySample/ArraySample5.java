package objectSample.arraySample;

import java.util.Arrays;

//バイナリーサーチの見本
class ArraySample5 {
    public static void main(String[] args) {
        int[] array = {50,20,40,30,10};
        Arrays.sort(array);//Arrays.sortで並び替えをしてる「
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, 10));//0 Arrays.binarySearchで並び替えた
        System.out.println(Arrays.binarySearch(array, 60));//負の数
    }
    }


