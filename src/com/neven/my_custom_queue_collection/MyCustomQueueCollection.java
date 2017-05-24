package com.neven.my_custom_queue_collection;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

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
    public boolean contains(Object object) {
        for (int i = 0; i < this.size(); i ++) {
            if (this.myCustomQueueCollection[i] != null && this.myCustomQueueCollection[i].equals(object)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new Iterators.Array<>(myCustomQueueCollection);
    }

    @Override
    public Object[] toArray() {
        return myCustomQueueCollection;
    }

    @Override
    public Object[] toArray(Object[] objectArray) {
        return objectArray;
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
            if (this.myCustomQueueCollection[i]!= null && this.myCustomQueueCollection[i].equals(o)) {
                for (int j = i; j >= 0; j--) {
                    if (j == 0) {
                        myCustomQueueCollection[j] = null;
                    } else {
                        myCustomQueueCollection[j] = myCustomQueueCollection[j - 1];
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection collection) {
       boolean contains = true;
        for (Object object : collection) {
            if (object != null && !this.contains(object)) {
                contains = false;
            }
        }
        return contains;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        boolean elementAdded = false;
        for (T object : collection) {
            if (object != null) {
                this.add(object);
                elementAdded = true;
            }
        }
        return elementAdded;
    }

    @Override
    public boolean removeAll(Collection collection) {
        boolean remove = false;
        for (Object object : collection) {
            this.remove(object);
            remove = true;
        }
        return remove;
    }

    @Override
    public boolean retainAll(Collection enteredCollection) {
        MyCustomQueueCollection<T> temporaryArray = new MyCustomQueueCollection<>(this.size());
        for (T element : this) {
            temporaryArray.add(element);
        }
        this.clear();
        boolean retained = false;
        for (T element : temporaryArray) {
            for (Object object : enteredCollection) {
                if (element != null && object != null && element.equals(object)) {
                    this.add(element);
                    retained = true;
                }
            }
        }
        return retained;
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.myCustomQueueCollection.length; i++) {
            myCustomQueueCollection[i] = null;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(myCustomQueueCollection);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyCustomQueueCollection<?> that = (MyCustomQueueCollection<?>) obj;

        return Arrays.equals(myCustomQueueCollection, that.myCustomQueueCollection);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(myCustomQueueCollection);
    }
}
