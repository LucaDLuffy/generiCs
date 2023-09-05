package util;

public class List<T> {

    private node<T> head;

    public void add(T value){//a logica aqui é pegar o valor e por na cabeça da fila.
        node<T> node = new node<T>();
        node.setValue(value);
        node.setNext(head);
        head = node;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        node<T> p = head;
        while (p != null){
            sb.append(p.getValue() + " ");
            p = p.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
