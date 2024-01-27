package ru.java.homeworks.homework17;

public class MyStack<T> extends MyLinkedList<T>{
    public void push(T data){
        addLast(data);
    }
    public T pop(){
        T value = getFirst();
        remove(0);
        return value;
    }

}
