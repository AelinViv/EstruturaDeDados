import java.util.*;
import java.io.*;

    public class Project {
        public static void main(String[] args){
        
    
        //criando a lista
        ArrayList<Integer>
        lista = new ArrayList <>(5);
        Stack<Integer> pilha = new Stack<Integer>();
        ArrayDeque fila = new ArrayDeque<>(10);
        
        //inserindo os números na lista
        lista.add (1);
        lista.add (2);
        lista.add (3);
        lista.add (4);
        lista.add (5);
    
        
        System.out.println(lista);
        
        //criando uma pilha
       for (int i=0; i < lista.size();) {
            pilha.push(lista.remove(i));
        }
           
      
     System.out.println("Lista após remover os elementos");
     System.out.println(lista);
    
        
     System.out.println("Pilha antes de remover os elementos");
     System.out.println(pilha);
     //criando uma fila
     for (int i=0; i <pilha.size();){
         fila.add(pilha.pop());
     }
     System.out.println("Pilha após remover os elementos");
     System.out.println(pilha);
     System.out.println("Números presentes na fila");
     System.out.println(fila);
     
     //Inserindo os números [6, 7, 8, 9 e 10] na lista 
        lista.add (6);
        lista.add (7);
        lista.add (8);
        lista.add (9);
        lista.add (10);
     System.out.println("Números presentes na lista");
     System.out.println(lista);
     
     //Repetindo o passo 2
     for (int i=0; i < lista.size();) {
            pilha.push(lista.remove(i));
        }
     System.out.println("Números presentes na lista após a remoção");
     System.out.println(lista);
     System.out.println("Números presentes na pilha");
     System.out.println(pilha);
     
      //Repetindo o passo 3
     for (int i=0; i <pilha.size();){
         fila.add(pilha.pop());
     }
     
     System.out.println("Números presentes na pilha após a remoção");
     System.out.println(pilha);
     System.out.println("Números presentes na fila");
     System.out.println(fila);
     
        }
    }
