package dtatask;


import java.util.PriorityQueue;

public class DTATask {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(5);
        priorityQueue.offer(8);
        priorityQueue.offer(1);
        priorityQueue.offer(9);
        priorityQueue.offer(3); 

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        priorityQueue.offer(7);
        priorityQueue.offer(2);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
