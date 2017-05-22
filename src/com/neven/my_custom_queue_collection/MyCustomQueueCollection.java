package com.neven.my_custom_queue_collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyCustomQueueCollection<T> implements Collection<T>{

    private Object[] myCustomQueueCollection;

    public MyCustomQueueCollection() {
        this.myCustomQueueCollection = new Object[16];
    }

    public MyCustomQueueCollection(int queueSize) {
        this.myCustomQueueCollection = new Object[queueSize];
    }

    @Override
    public int size() {
        return myCustomQueueCollection.length;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < this.size(); i ++) {
            if (this.myCustomQueueCollection[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return this.myCustomQueueCollection;
    }

    @Override
    public boolean add(T obj) {
        for (int i = 0; i < this.size(); i++) {
            if (i == this.size() - 1) {
                myCustomQueueCollection[i] = obj;
            } else {
                myCustomQueueCollection[i] = myCustomQueueCollection[i + 1];
            }
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < this.size(); i++) {
            if (this.myCustomQueueCollection[i].equals(o)) {
                this.myCustomQueueCollection[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {

        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String toString() {
        return Arrays.toString(myCustomQueueCollection);
    }


}
