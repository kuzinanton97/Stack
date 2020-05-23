import java.util.LinkedList;

public class YoptaStack {
    private LinkedList<Integer> yoptaStack;
    private int count = 0;

    public YoptaStack() {
        yoptaStack = new LinkedList<Integer>();
        this.count = count;
    }
    public void put(int elem) {
        yoptaStack.add(0, elem);
        count = count + 1;
    }
    public int pop() {
        int elem = yoptaStack.get(0);
        yoptaStack.remove(0);
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




