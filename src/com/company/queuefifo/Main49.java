package com.company.queuefifo;

public class Main49 {
    public static void main(String[] args) {
        Queue fifo = new Queue(5);

        fifo.enqueue(1);
        fifo.dequeue();
        fifo.enqueue(2);
        fifo.enqueue(3);
        fifo.dequeue();
        fifo.dequeue();
        fifo.dequeue();
        fifo.enqueue(4);
        fifo.enqueue(5);
        fifo.enqueue(6);
        System.out.println(fifo.toString());
        fifo.dequeue();
        System.out.println(fifo.toString());


    }
}
