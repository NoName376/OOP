package lab3.task3;

import java.util.ArrayList;
import java.util.Iterator;

class MyArrayCollection<E> implements MyCollection<E> {
    private ArrayList<E> data = new ArrayList<>();

    @Override
    public boolean add(E element) {
        return data.add(element);
    }

    @Override
    public boolean remove(E element) {
        return data.remove(element);
    }

    @Override
    public boolean contains(E element) {
        return data.contains(element);
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public void clear() {
        data.clear();
    }

    @Override
    public Iterator<E> iterator() {
        return data.iterator();
    }
}
