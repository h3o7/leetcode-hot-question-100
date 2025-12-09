package leetcode100;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        int num = Integer.MAX_VALUE;

    }

    public static void test(String str,Function<String,Integer> function){
        System.out.println(function.apply(str));
    }

    public static void test2(String str ,Consumer<String> consumer){
        consumer.accept(str);
    }

    // select user(id,username,info,balance) from user where username like '%o%' and balance > 1000
    // User user = selectOne()
}
