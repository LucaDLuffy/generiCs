package util;

public class node<T> {//esse T é oque vai fazer meu node Ficar generico a sintaxe é XXX<t> por exemplo pq? t? T de Tipo

    private T value;
    private node<T> next;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public node<T> getNext() {
        return next;
    }

    public void setNext(node<T> next) {
        this.next = next;
    }
}
