package _17_Arrays工具类;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo001 {
    public static void main(String[] args) {
        int[] arr = {10,30,20,40,50,60};

        //void sort(); 对数组排序
        Arrays.sort(arr);

        //String toString(); 打印数组
        System.out.println(Arrays.toString(arr));       //[10, 20, 30, 40, 50, 60]

        //int binarySearch(Object[] a, Object key); 使用二分查找获取此番定元素在数组中出现的索引位置
        int index = Arrays.binarySearch(arr,50);
        System.out.println(index);                      //4

        //int[] copyOfRange(int[] original, int from, int to); 复制数组元素到一个新数组中
        int[] arr2 = Arrays.copyOfRange(arr,1,2);
        System.out.println(Arrays.toString(arr2));      //[20]

        //void fill(Object[] a,Object val); 使用传入元素替换数组中所有的元素
        Arrays.fill(arr2,88);
        System.out.println(Arrays.toString(arr2));      //[88]

    }
}
