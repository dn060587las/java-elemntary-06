package org.bank.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class UnmodifiableArrayList extends ArrayList {

    public UnmodifiableArrayList(Object[] data) {
        super(Arrays.asList(data));
    }

    public UnmodifiableArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public void add(int index, Object element) {
        //super.add(index, element);
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        //super.removeRange(fromIndex, toIndex);
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;//return super.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate filter) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator operator) {

    }
}
