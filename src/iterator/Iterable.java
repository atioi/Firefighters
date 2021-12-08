package iterator;

import java.util.*;

public class Iterable<T> {

    private class CIterator implements Iterator<T> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < data.size();
        }

        @Override
        public T next() {
            if (!hasNext())
                throw new NoSuchElementException();
            return data.get(index++);
        }
    }

    private final List<T> data = new ArrayList<>();

    public Iterator<T> iterator() {
        return new CIterator();
    }

    public void add(T e) {
        data.add(e);
    }

    public void sort(Comparator<? super T> comparator) {
        //FIXME: Comparator can cause iterator go through the same elements twice.
        data.sort(comparator);
    }

}
