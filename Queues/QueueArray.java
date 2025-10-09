class QueueArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;


        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        //Enqueue

        public static void add(int data) {
            if(rear == size-1) {
                System.out.println("Queue is Full");
                return;
            }
            rear ++;
            arr[rear] = data;
        }
     //Dequeue

    public static int remove() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int front = arr[0];
        for(int i = 0; i< rear; i++) {
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }   

    public static int peek() {
         if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[0];
    }

    }
    public static void main(String arga[]) {
        Queue q = new Queue(10); // create a Queue with size 10
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