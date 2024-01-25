package arrays.linkedlist;

public class StringCollection {
    private Element collectionHead;

    public StringCollection() {
        collectionHead = null;
    }

    public String getElement(int n) {
        Element index = collectionHead;
        if (n < 0) {
            throw new IndexOutOfBoundsException("n is not available");
        }
        if (n == 0) {
            return collectionHead.getValue();
        }
        int nextIndex = 0;
        while (nextIndex < n) {
            index = index.getNext();
            nextIndex++;
        }
        return index.getValue();
    }

    public void addElement(String s) {
        Element element = new Element(s);
        if (collectionHead == null) {
            collectionHead = element;
        } else {
            Element temp = collectionHead;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(element);
            element.setPrev(temp);
        }
    }

    public boolean removeElement(String s) {
        Element element = collectionHead;
        if (collectionHead == null) {
            return false;
        }
        while (!element.getValue().equals(s) && element.getNext() != null) {
            element = element.getNext();
        }
        if (element.getValue().equals(s)) {
            if (collectionHead != null && collectionHead.getPrev() == null && collectionHead.getNext() == null) {
                collectionHead = null;
            } else {
                if (element.getNext() != null) {
                    element.getNext().setPrev(element.getPrev());
                } else {
                    element.getPrev().setNext(null);
                }
                if (element.getPrev() != null) {
                    element.getPrev().setNext(element.getNext());
                } else {
                    collectionHead = element.getNext();
                    collectionHead.setPrev(null);
                }
            }
            return true;
        } else
            return false;
    }
}
