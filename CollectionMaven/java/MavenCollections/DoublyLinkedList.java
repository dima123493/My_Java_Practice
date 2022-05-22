package MavenCollections;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public class DoublyLinkedList<T> implements Deque {
    private final Node<T> head = new Node<T>();
    private int size = 0;
    private boolean isReversed = false;

    @Override
    public void addFirst(Object value) {
        if (isReversed) {
            addPrevious((T) value);
        } else {
            addNext((T) value);
        }
        /*var oldFirst = head.next;
        var newFirst = new Node<T>((T) value, oldFirst, head);
        head.next = newFirst;
        oldFirst.previous = newFirst;

        size++;*/
    }

    private void addNext(T value) {
        var oldNext = head.next;
        var newNext = new Node<T>((T) value, oldNext, head);
        head.next = newNext;
        oldNext.previous = newNext;

        size++;
    }

    private void addPrevious(T value) {
        var oldFirst = head.next;
        var newFirst = new Node<T>((T) value, oldFirst, head);
        head.next = newFirst;
        oldFirst.previous = newFirst;

        size++;
    }

    @Override
    public void addLast(Object value) {
        if (isReversed) {
            addNext((T) value);
        } else {
            addPrevious((T) value);
        }
    }

    @Override
    public Object getFirst() {
        throwsWhenEmpty();
        var firstNode = head.next;
        var secondNode = firstNode.next;
        head.next = secondNode;
        secondNode.previous = head;
        size--;
        return firstNode.value;
    }

    @Override
    public Object getLast() {
        throwsWhenEmpty();
        var lastNode = head.next;
        var preultimateNode = lastNode.next;
        head.next = preultimateNode;
        preultimateNode.previous = head;
        size--;
        return lastNode.value;
    }

    @Override
    public Object peekFirst() {
        throwsWhenEmpty();
        return head.next.value;
    }

    @Override
    public Object peekLast() {
        throwsWhenEmpty();
        return head.previous.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
        head.next = head;
        head.previous = head;
    }

    @Override
    public ListIterator<T> iterator() {
        return new DirectIterator();
    }

    public ListIterator<T> reverseIterator() {
        if (isReversed) {
            return new ReverseIterator();
        } else {
            return new DirectIterator();
        }
    }

    public void reverse() {
        isReversed = !isReversed;

    }

    private void throwsWhenEmpty() {
        if (size == 0) {
            throw new NoSuchElementException("The collection is empty");
        }
    }

    private static class Node<V> {
        V value;
        Node<V> next;
        Node<V> previous;

        public Node() {
            next = this;
            previous = this;
        }

        public Node(V value, Node<V> next, Node<V> previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    private class DirectIterator implements ListIterator<T> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }

        @Override
        public boolean hasPrevious() {
            return false;
        }

        @Override
        public T previous() {
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
        public void set(T t) {

        }

        @Override
        public void add(T t) {

        }
    }

    private class ReverseIterator implements ListIterator<T> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }

        @Override
        public boolean hasPrevious() {
            return false;
        }

        @Override
        public T previous() {
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
        public void set(T t) {

        }

        @Override
        public void add(T t) {

        }
    }
}
