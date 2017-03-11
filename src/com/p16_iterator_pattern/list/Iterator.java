package com.p16_iterator_pattern.list;

/**
 * Created by yangyue on 2017/3/10.
 */
public interface Iterator<E> {
    boolean hasNext();
    E next();
}
