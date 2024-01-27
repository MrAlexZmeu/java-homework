package ru.java.homeworks.homework17;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class MyLinkedList<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    static class Node<T> {
        T value;
        Node<T> prev;
        Node<T> next;
    }

    public MyLinkedList() {
        size = 0;
    }

    public void addFirst(T data) {
        Node<T> node = new Node<>();
        node.value = data;
        size++;
        if (first == null) {
            first = node;
            last = node;
            return;
        }
        node.next = first;
        first.prev = node;
        first = node;

    }

    public void addLast(T data) {
        Node<T> node = new Node<>();
        node.value = data;
        size++;
        if (last == null) {
            first = node;
            last = node;
            return;
        }
        node.prev = last;
        last.next = node;
        last = node;
    }

    public T getFirst() {
        if (first == null) {
            return null;
        }
        return first.value;
    }

    public T getLast() {
        if (last == null) {
            return null;
        }
        return last.value;
    }

    public void add(int position, T data) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Не корректно задан индекс");
        }
        if (position == 0) {
            addFirst(data);
            return;
        }
        if (position == size) {
            addLast(data);
            return;
        }

        Node<T> currNode = getNodeOnPosition(position);
        Node<T> node = new Node<>();
        node.value = data;
        node.prev = currNode.prev;
        node.next = currNode;
        currNode.prev.next = node;
        size++;
    }

    public Node<T> getNodeOnPosition(int position) {
        Node<T> currNode = first;
        for (int i = 0; i < position; i++) {
            currNode = currNode.next;
        }
        return currNode;
    }

    public void remove(int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Не корректно задан индекс");
        }
        Node<T> node = getNodeOnPosition(position);
        if (node.prev != null) {
            node.prev.next = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        }
        if (node.prev == null) {
            first = node.next;
        }
        if (node.next == null) {
            last = node.prev;
        }
        size--;
    }

    public T get(int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Не корректно задан индекс");
        }
        Node<T> node = getNodeOnPosition(position);
        return node.value;
    }

    @Override
    public String toString() {
        if (size == 0){
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder().append('[');
        Node<T> node = first;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(node.value);
            node = node.next;
            if(node!=null){
                stringBuilder.append(',');
            }
        }
        return stringBuilder.append(']').toString();
    }

    public int getSize() {
        return size;
    }
}
