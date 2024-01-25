package arrays.linkedlist;

public class Element {
    private Element next;
    private Element prev;
    private final String value;

    public Element(String value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public String getValue() {
        return value;
    }

    public Element getNext() {
        return next;
    }

    public Element getPrev() {
        return prev;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public void setPrev(Element prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return value;
    }
}
