import java.util.*;
public class QueueCollection {
    public static void main(String arga[]) {
        Queue<Integer> Queue = new LinkedList<>(); // create a Queue using Collections framework
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        Queue.add(4);
        while(!Queue.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }
}
/*
 OUTPUT :
 1
2
3
4
    */