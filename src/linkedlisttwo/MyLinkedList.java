
package linkedlisttwo;


public class MyLinkedList {
Node head;
    void insert(int valor) { //metodo para insertar al inicio
        Node node = new Node(valor);
        if(isEmpty()) {
            this.head = node;
        } else {
        Node siguiente = head;
        Node actual  = null;
            while(siguiente.siguiente =  ){
                
            
            
            head = node;
            node.siguiente =node;
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
