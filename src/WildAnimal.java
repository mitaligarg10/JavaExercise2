public class WildAnimal {

    private static int capacity, front, rear;
    private static int queue[];

    WildAnimal(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    public static int[] animalEnqueue(int data) {

        if (capacity == rear) {
            System.out.println("\nQueue is full\n");
        } else {
            queue[rear] = data;
            rear++;
        }

        return queue;
    }

    public void animalDequeue() {

        if (front == rear) {
            System.out.println("\nQueue is empty\n");
            // return;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < capacity)
                queue[rear] = 0;
            rear--;
        }

    }

    public static int[] animalDisplay() {
        int i;
        int temp[] = new int[rear];
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
        }

        for (i = front; i < rear; i++) {
            if (queue[i] != 0) {
                temp[i] = queue[i];
                System.out.printf(" %d <-- ", queue[i]);
            }
        }
        return temp;
    }

}


