package com.zzw.java1000000.z1126141.collection.list;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

public class AbstractSequentialListTest extends AbstractSequentialList {

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }



    private class ListIter implements ListIterator{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }

        @Override
        public boolean hasPrevious() {
            return false;
        }

        @Override
        public Object previous() {
            return null;
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(Object o) {

        }

        @Override
        public void add(Object o) {

        }
    }
}
