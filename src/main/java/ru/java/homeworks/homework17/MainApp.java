package ru.java.homeworks.homework17;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        MyLinkedList<String> mLL = new MyLinkedList<>();
        mLL.addFirst("11");
        mLL.addLast("22");
        mLL.addLast("33");
        mLL.addLast("55");
        mLL.add(1,"44");
        System.out.println(mLL);
        mLL.remove(1);
        System.out.println(mLL);

        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.offer("11");
        myQueue.offer("22");
        myQueue.offer("33");
        myQueue.offer("44");
        System.out.println(myQueue);
        System.out.println(myQueue.poll());
        System.out.println(myQueue);

        MyStack<String> myStack = new MyStack<>();
        myStack.push("11");
        myStack.push("22");
        myStack.push("33");
        myStack.push("44");
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);

        int[] array = {1,5,7,8,4,5,2,0};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortBubble(array)));
    }

    public static int[] sortBubble(int[] array) {
        int val = array[0];
        for (int i = 0; i < array.length; i++) {
            boolean checkChange = false;
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    val = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = val;
                    checkChange = true;
                }
            }

        }
        return array;
    }
}
