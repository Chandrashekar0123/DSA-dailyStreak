public class CircularQ {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;


        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        //Enqueue

        public static void add(int data) {
            if(isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            rear = (rear + 1) % size;
            //Add first element
            if(front == -1) {
                front = 0;
            }
            arr[rear] = data;
        }
     //Dequeue

    public static int remove() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int result = arr[front];
        //Single element Condition
        if(rear == front) {
            rear = front = -1; //Resetting the queue
        } else {
            front = (front + 1) % size;
        }
        return front;
    }   

    public static int peek() {
         if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    }
    public static void main(String arga[]) {
        Queue q = new Queue(10); // create a Queue with size 10
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        Queue.add(4);
        Queue.add(5);
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
5
 */
