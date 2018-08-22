package com.company.queuefifo;

public class Queue {
    private int[] arr;
    private int tail, head;

    public Queue(int capacity) {
        if (capacity <= 0) {
            System.out.println("Start from the 1");
        } else {
            arr = new int[capacity];
            tail = 0;
            head = 0;
        }

    }

    public void enqueue(int digit) {
        if (head < arr.length) {
            int n = head;
            for (int i = 0; i < head; i++) {
                arr[n] = arr[n - 1];
                n--;
            }
            arr[tail] = digit;
            head++;
        } else {
            System.out.println("Stop! The queue is full");
        }
    }

    public int dequeue() {
        if (head > 0) {
            head--;
        } else {
            System.out.println("Stop! The queue is empty");
        }
        return arr[head];
    }

    public String toString() {
        String st = "";
        for (int i = 0; i < head; i++) {
            st += arr[i] + ", ";
        }
        return st;
    }

}
