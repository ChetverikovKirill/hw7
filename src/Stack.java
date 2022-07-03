public class Stack {
    private Element first;

    private class Element {
        int value;
        Element next;
    }

    public void push(int value) {
        Element firstElement = first;
        first = new Element();
        first.value = value;
        first.next = firstElement;
    }

    public int pop() {
        if (first == null) {
            System.out.println("пусто");
            return -1;
        }
        int res = first.value;

        first = first.next;

        System.out.println("вы убрали " + res);
        return res;
    }
}
