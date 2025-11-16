package leetcode100;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>(4,0.75f,true);

        System.out.println(map.size());
        System.out.println(map.put(1,"a"));
        System.out.println(map.put(2,"b"));
        System.out.println(map.put(3,"c"));
        System.out.println(map.put(4,"d"));
        System.out.println(map.put(5,"e"));
        System.out.println(map.size());


        traversal(map);

        System.out.println(map.put(5,"f"));

        System.out.println(map.put(1,"g"));
        traversal(map);

//        map.remove
    }

    public static <K,V> void traversal(Map<K,V> map){
        map.forEach((k,v)->{
            System.out.println("key:"+k+",value:"+v);
        });
    }
}
