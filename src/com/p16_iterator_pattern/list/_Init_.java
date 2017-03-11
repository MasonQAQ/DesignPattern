package com.p16_iterator_pattern.list;

/**
 * Created by yangyue on 2017/3/10.
 */
public class _Init_ {
    public static void main(String[] args) {
        Aggregate<Integer> test = new ConcreteAggregate<>();
        test.add(1);
        test.add(2);
        test.add(3);
        Iterator<Integer> iterator = test.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
