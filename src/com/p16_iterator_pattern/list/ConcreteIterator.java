package com.p16_iterator_pattern.list;

/**
 * Created by yangyue on 2017/3/10.
 */
public class ConcreteIterator<E> implements Iterator<E> {

    private Aggregate<E> aggregate;
    private int index;

    public ConcreteIterator(Aggregate<E> aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        if (index >= aggregate.getSize()){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public E next() {
        E e = aggregate.get(index);
        index++;
        return e;
    }
}
