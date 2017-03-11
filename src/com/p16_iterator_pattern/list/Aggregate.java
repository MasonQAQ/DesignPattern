package com.p16_iterator_pattern.list;

import java.util.ArrayList;

/**
 * Created by yangyue on 2017/3/9.
 */
public interface Aggregate<E> {
    void add(E e);
    E get(int index);
    int getSize();
    Iterator iterator();
}
