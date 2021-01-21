package com.minsusu.集合.MapTest01;


import java.util.*;


/**
 * V put(K key, V value) 将指定的值与此映射中的指定键关联（可选操作）。
 * Set<Map.Entry<K,V>>	entrySet() 返回此映射中包含的映射关系的 Set 视图。
 *  Collection<V>	values() 返回此映射中包含的值的 Collection 视图。
 *   Set<K>	keySet() 返回此映射中包含的键的 Set 视图。
 *
 */
public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();
        // 添加键值对
        m.put(1,"a");
        m.put(2,"b");
        m.put(3,"c");
        m.put(4,"d");
        m.put(5,"c");
        // 获取制定key的value
        String ss = m.get(3);
        System.out.println(ss);


        Collection<String> S1 = m.values();
        for (String data:S1) {
            System.out.println(data);
        }


        // 循环遍历
        // 1、使用迭代器遍历
        Set<Integer> keys= m.keySet();  // 返回Set集合
        Iterator<Integer> PP=keys.iterator();  // 创建迭代器
        while (PP.hasNext()){
            Integer key = PP.next();
            String value  = m.get(key);
            System.out.println("键："+key+"--值："+value);

        }
        //2、使用foreach
        for (Integer key:keys) {
            System.out.println("键"+key+"值："+m.get(key));
        }

        //3、使用entrySet
        Set<Map.Entry<Integer,String>> s =  m.entrySet();
        Iterator<Map.Entry<Integer,String>> it = s.iterator();
        while (it.hasNext()){
             Map.Entry<Integer,String> entry = it.next();
             Integer key = entry.getKey();
             String value = entry.getValue();
            System.out.println("键："+key+",值："+value);
        }

        //4、使用entryset foreach
        Set<Map.Entry<Integer,String>> s1 =  m.entrySet();
        for (Map.Entry<Integer,String> entry:s1) {
            System.out.println("键："+entry.getKey()+"**值："+entry.getValue());
        }

    }
}
