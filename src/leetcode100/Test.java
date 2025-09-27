package leetcode100;

import java.util.function.Consumer;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Function<String,Integer> function = s -> {
            int sum = 0;
            for(Character c : s.toCharArray()){
                sum += c - 'a' + 1;
            }
            return sum;
        };
        String str = "ashcj";
        String str2 = "ashc";
        test(str,str1 -> str1.length() );
        // 函数式接口，上面的函数表示str,为传递的参数，str1 -> str1.length()表示函数体，返回值为str1的长度
        Consumer<String> consumer = System.out::println;
        test2("1234",s -> System.out.println(s.length()));
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
