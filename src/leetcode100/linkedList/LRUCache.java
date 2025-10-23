package leetcode100.linkedList;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

class LRUCache extends LinkedHashMap<Integer,Integer> {
    private int capacity;


    public LRUCache(int capacity) {
        super(capacity,0.75f,true);
        this.capacity = capacity;

    }

    public int get(int key) {
        Integer re = super.get(key);
        if(Objects.isNull(re)) return -1;
        return re;
    }

    public void put(int key, int value) {
        Integer v = super.get(key);
        if(Objects.isNull(v)){
            if(super.size() >= capacity){
                Iterator<Map.Entry<Integer,Integer>> it = entrySet().iterator();
                Map.Entry<Integer,Integer> first = it.next(); // 取得第一个条目
                it.remove();
            }
            super.put(key,value);
        }else{
            super.remove(key);
            super.put(key,value);
        }
    }
}

