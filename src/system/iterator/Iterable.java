package system.iterator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;


/**
 * Iterable implements Iterator Pattern.
 */
@SuppressWarnings("unchecked")
public class Iterable<T> {

    private T[] data = (T[]) new Object[0];

    private class Iterator<E> implements system.Iterator<E> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < data.length;
        }

        @Override
        public E next() {
            if (!hasNext())
                throw new NoSuchElementException();
            return (E) data[index++];
        }
    }

    public void add(T e) {
        T[] resized = (T[]) new Object[this.data.length + 1];
        System.arraycopy(this.data, 0, resized, 0, this.data.length);
        resized[this.data.length] = e;
        this.data = resized;
    }

    public Iterator<T> iterator() {
        return new Iterator<>();
    }

    public void sort(Comparator<T> comparator) {
        Arrays.sort(this.data, comparator);
    }

}
