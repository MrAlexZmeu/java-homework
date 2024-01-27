package ru.java.homeworks.homework17;

public class MyQueue<T> extends MyLinkedList<T> {
    public void offer(T data) {

        addLast(data);
    }

    public T poll() {
        T value = getFirst();
        remove(0);
        return value;
    }
}
