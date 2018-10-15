
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
    void erase(char valor) {
        if(isEmpty()) {
            // No se puede borrar
        } else if(head.siguiente == null) { // Si solo tiene un elemento, y si el valor es el que queremos borrar, el head apunta a null
            if (head.valor == valor) {
                head = null;
            }
        } else if (head.valor == valor) { // Si el valor está en el primer nodo, entonces borramos al inicio
            head = head.siguiente;
        }  else { // Recorremos de 2 en 2, si encuentra el valor a borrar durante una iteracion borramos el nodo y salimos del ciclo
            Node actual = head;
            Node siguiente = head.siguiente;
            while (actual != null && siguiente != null) {
                // Empezamos a comparar a partir del segundo nodo
                if(siguiente.valor == valor) { // Encontramos la primera incidencia. Borramos y salimos del ciclo
                    actual.siguiente = siguiente.siguiente;
                    siguiente.siguiente = null;
                    break;
                } else { // Avanzamos a los siguientes 2 nodos
                    actual = siguiente;
                    siguiente = actual.siguiente;
                }
            }
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
