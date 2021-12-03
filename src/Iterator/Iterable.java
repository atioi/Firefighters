package Iterator;

public class Iterable<E> {

    private E[] data = (E[]) (new Object[10]);
    //TODO: Dynamiczne przydzielanie miejsca.
    private int count = 0;

    private class CIterator implements Iterator<E> {

        private int progress = 0;

        @Override
        public boolean hasNext() {
            return progress < count;
        }

        @Override
        public E next() {
            return data[progress++];
        }

    }

    public boolean add(E e) {
        data[count++] = e;
        return true;
    }

    public Iterator<E> iterator(){
        return new CIterator();
    }

}
