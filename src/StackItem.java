public class StackItem {
    private Object item = "Null";
    private StackItem next;

    public StackItem(Object item) {
        this.item = item;
    }
    public StackItem(Object item, StackItem next) {
        this.item = item;
        this.next = next;
    }
    public Object getItem() {

        return item;
    }
    public void setItem(Object item) {
        this.item = item;
    }
    public StackItem getNext() {
        return next;
    }
    public void setNext(StackItem next) {
        this.next = next;
    }
}
