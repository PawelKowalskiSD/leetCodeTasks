package arrays.linkedlist;

public class Element {
    private Element next;
    private Element prev;
    private String value;

    public Element(String value) {
        this.next = null;
        this.prev = null;
        this.value = value;
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

    public Element setNext(Element next) {
        return this.next;
    }

    public Element setPrev(Element prev) {
        return this.prev;
    }
}
