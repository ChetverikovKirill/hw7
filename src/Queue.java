public class Queue {
    private Element first;


    public void push(int value) {
        Element newElement = new Element(value);
        if (first == null) {
            first = newElement;
        } else {
            Element currentElement = first;
            while (currentElement.getNext() != null) {
                currentElement = currentElement.getNext();
            }
            currentElement.setNext(newElement);
        }
    }

    public int pop() {
        if (first != null) {
            int res = first.getValue();

            first = first.getNext();

            System.out.println("Вы убрали " + res);
            return res;
        } else if (first == null) {
            System.out.println("Пусто");
        }
        return -1;
    }

    public void print() {
        Element currentElement = first;
        while (currentElement != null) {
            System.out.println(currentElement.getValue());
            currentElement = currentElement.getNext();
        }
    }

}
