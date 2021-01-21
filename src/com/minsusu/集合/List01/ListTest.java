package com.minsusu.集合.List01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * List集合包含索引，列表通常允许重复的元素
 * boolean	add(E e)将指定的元素追加到此列表的末尾（可选操作）:效率高。
 * void	add(int index, E element)将指定的元素插入此列表中的指定位置（可选操作）：相对上面效率低。
 * E	get(int index)返回此列表中指定位置的元素。
 * int	indexOf(Object o) 返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 -1。
 * int	lastIndexOf(Object o)  返回此列表中最后出现的指定元素的索引；如果列表不包含此元素，则返回 -1。
 *  E	set(int index, E element)  用指定元素替换列表中指定位置的元素（可选操作）。返回以前在指定位置的元素
 *
 *
 */
public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(456);
        list.add("sdsd");
        list.add(1);


        Iterator iterator =list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Object item = list.get(1);
        System.out.println("索引1的值："+item);
        //indexOf
        int firstIndex = list.indexOf(456);
        System.out.println("第一次出现的索引："+firstIndex);
        //lastIndexOf
        int lastIndex = list.lastIndexOf(1);
        System.out.println("最后一次出现的索引："+lastIndex);
        //set
        Object _item = list.set(3,"hello");
        System.out.println(_item);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }
}
