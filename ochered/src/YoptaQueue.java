import java.util.LinkedList;

public class YoptaQueue {
    private LinkedList<Integer> yoptaQueue;
    private int count = 0;

    public YoptaQueue() {
        yoptaQueue = new LinkedList<Integer>();
        this.count = count;
    }
    public void put(int elem) {
        yoptaQueue.add(elem);
        count = count + 1;
    }
    public int pop() {
        int elem = yoptaQueue.get(0);
        yoptaQueue.remove(0);
        count--;
        return elem;
    }
    public int count() {
        return count;
    }
    public boolean isEmpty() {
        return (count == 0);
    }
}