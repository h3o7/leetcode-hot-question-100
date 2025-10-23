package leetcode100;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        Set<Integer> set = new LinkedHashSet<>();

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
