package Collection;

import java.util.ArrayDeque;

class MyArrayDeck {
    public void main(String[] args) {

        MyStack<Character> stack = new MyArrayDeck1<>();
        stack.peek();
    }

    class MyArrayDeck1<T> extends ArrayDeque<T> implements MyStack<T> {

    }
}