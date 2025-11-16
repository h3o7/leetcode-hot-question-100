package leetcode100.binarytree;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        System.out.println(map.getOrDefault(1,3));


    }


    public static int[] subNums(int[] nums,int start,int end){
        int[] subNums = new int[end - start];
        if (end - start >= 0) System.arraycopy(nums, start, subNums, 0, end - start);
        return subNums;
    }

    public static <E> void changeList(List<E> list,E e){
        list.add(e);
    }
}
