
package linkedlisttwo;


public class MyLinkedList {
Node head;
    void insert(char   valor) { //metodo para insertar 
        Node nuevoNodo = new Node(valor);
        if(isEmpty()) { // Si esta vacia solo se apunta el head al nuevo nodo
            this.head = nuevoNodo;
        } else if(head.siguiente == null && head.valor >= nuevoNodo.valor) { // Si solo tiene un elemento, y si el valor nuevo es menor al head, se inserta al inicio
            nuevoNodo.siguiente = head;
            head = nuevoNodo;
        } else { // Si tiene mas de 1 elemento, se recorre la lista hasta que encuentre un valor mayor al nuevo valor o hasta que se termine la lista y se mete entre actual y actual.siguiente
            Node actual = head;
            while(actual.siguiente != null && actual.siguiente.valor < nuevoNodo.valor){
                actual = actual.siguiente;
            }
            nuevoNodo.siguiente = actual.siguiente;
            actual.siguiente = nuevoNodo;
        }
        print();
    }
    void print() {//metodo para saber si la lista esta vacia
    if (isEmpty()) {
        System.out.println("La lista está vacía"); 
     } else {//para cuando la lista no esta vacia o cuando hay datos recuerda que hay dos casos cuando no tiene nada y cuando si tiene
            Node node = this.head;
            System.out.print(node.valor);
            while (node.siguiente != null) {//el while pregunta si apunta a algo
                System.out.print(" -> ");
                node = node.siguiente;
                System.out.print(node.valor);
            }
            System.out.println("");
        }
    }
    
    boolean isEmpty() //metodo para saber si la lista esta vacia
    {
        return head == null;}
    
    
}
