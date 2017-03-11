package com.p16_iterator_pattern.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yangyue on 2017/3/9.
 */
public class ConcreteAggregate<E> implements Aggregate<E> {

    private Object[] es;
    private int currentLength = 0;

    public ConcreteAggregate() {
        this.es = new Object[0]; //initial size is 0
    }

    @Override
    public void add(E e) {
        es = Arrays.copyOf(es,++currentLength);
        es[currentLength - 1] = e;
    }

    @Override
    public E get(int index) {
        return (E) es[index];
    }

    @Override
    public int getSize() {
        return es.length;
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }
}
