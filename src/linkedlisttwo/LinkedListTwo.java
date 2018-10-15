
package linkedlisttwo;

import java.util.Scanner;

public class LinkedListTwo {

    
    public static void main(String[] args) {
 MyLinkedList lista = new MyLinkedList();
        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        System.out.println("1.- Insertar dato en orden :D ");
        System.out.println("2.- Borrar dato especifico OwO");
        System.out.println("3.- Mostrar datos o3o");
        System.out.println("4.- Salir conmigo ok no solo salir >w<");
        
        System.out.println("Que opcion desea elegir");
        opcion = teclado.nextInt();
        
        while(opcion!=4)
        {
            switch (opcion)
            {
                case 1:
                    char dato;
                    System.out.println("Ingrese un datito uwu");
                    dato = teclado.next().charAt(0);
                    lista.insert(dato);
                    break;
                case 2:
                    break;
                case 3:
                    lista.print();  
                    break;
                case 4:
                    break;
                default:
                    
                
            }
            
        System.out.println("1.- Insertar dato en orden :D ");
        System.out.println("2.- Borrar dato especifico OwO");
        System.out.println("3.- Mostrar datos o3o");
        System.out.println("4.- Salir conmigo ok no solo salir >w<");
        
        System.out.println("Que opcion desea elegir");
        opcion = teclado.nextInt();
        }
    }
    
}
