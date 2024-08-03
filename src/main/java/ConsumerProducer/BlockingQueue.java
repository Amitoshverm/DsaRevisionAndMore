package ConsumerProducer;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    final Queue<Integer> q;
    int capacity;

    public BlockingQueue(int cap) {
        q = new LinkedList<>();
        this.capacity = cap;
    }

    public boolean add(int item) {
        synchronized (q) {
            if (q.size() == capacity) {
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            q.add(item);
            q.notify();
            return true;
        }
    }

    public int remove() {
        synchronized (q) {
            if (q.isEmpty()) {
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int element = q.poll();
            q.notify();
            return element;
        }
    }
}
