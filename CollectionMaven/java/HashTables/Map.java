package HashTables;

import java.util.Iterator;
import java.util.NoSuchElementException;

interface Entry<K, V> {
    K getKey();

    V getValue();

    void setValue(V value);
}

public interface Map<K, V> extends Iterable<Entry<K, V>> {
    int size();

    default boolean isEmpty() {
        return size() == 0;
    }

    V put(K key, V value);

    V get(K key);

    boolean contains(K key);

    V remove(K key);


    Iterator<Entry<K, V>> iterator();
}

class CustomHashMap<K, V> implements Map<K, V> {
    private static int INITIAL_CAPACITY = 8;
    private int size = 0;

    private Node<K, V>[] bins = new Node[INITIAL_CAPACITY];

    @Override
    public int size() {
        return size;
    }

    @Override
    public V put(K key, V value) {
        var entry = getEntry(key);
        if (entry != null) {
            var result = entry.getValue();
            entry.setValue(value);
            return result;
        }

        addNode(new Node(key, value));
        return null;
    }

    private void addNode(Node node) {
        size++;
        int bin = getBin(node.hash);
        node.next = bins[bin];
        bins[bin] = node;

    }

    @Override
    public boolean contains(K key) {
        return getEntry(key) != null;
    }

    @Override
    public V remove(K key) {
        return null;
    }

    private Node<K, V> getNode(K key) {
        int hash = key.hashCode();
        int bin = getBin(hash);
        var node = bins[bin];

        while (node != null) {
            if (node.hash == hash && node.key.equals(key)) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private int getBin(int hash) {
        return hash % bins.length;
    }

    public Entry<K, V> getEntry(K key) {
        return getNode(key);
    }

    @Override
    public V get(K key) {
        var entry = getEntry(key);
        return entry != null ? entry.getValue() : null;
    }

    @Override
    public Iterator<Entry<K, V>> iterator() {
        //TODO
        return new EntryIterator();
    }

    private static class Node<K1, V1> implements Entry<K1, V1> {
        final int hash;
        final K1 key;
        V1 value;

        Node<K1, V1> next;

        public Node(K1 key, V1 value) {
            this.key = key;
            this.value = value;
            this.hash = key.hashCode();
        }

        @Override
        public K1 getKey() {
            return key;
        }

        @Override
        public V1 getValue() {
            return value;
        }

        @Override
        public void setValue(V1 value) {
            value = value;
        }


    }

    private class EntryIterator implements Iterator<Entry<K, V>> {
        int bin = 0;
        Node<K, V> cursor = bins[bin];

        @Override
        public boolean hasNext() {
            while (bin < bins.length - 1 && cursor == null) {
                cursor = bins[++bin];
            }
            return cursor != null;
        }

        @Override
        public Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            var result = cursor;
            cursor = cursor.next;
            return result;
        }
    }
}
