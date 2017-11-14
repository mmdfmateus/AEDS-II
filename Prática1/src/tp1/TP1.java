package tp1;

import Item.*;
import java.lang.*;
import java.util.*;

public class TP1 {

    public static void main(String[] args) {
        
       
        Item u = new Item(9001);
        Item l = new Item(10);
        Item m = new Item(11);
        
        
        
        //********ARVORE COM ELEMENTOS ORDENADOS*********
        
        
        for(int j = 0; j < 9; j++){
            ArvoreBinaria tree = new ArvoreBinaria();
            tree.setComparacoes(0);
            for(int i = 1000; i <= 9000; i += 1000){
                for(int k = 0; k < i; k++){
                    Item aux = new Item(k);
                    tree.insere(aux);
                }
            }
            //tree.print(tree.raiz);
            System.out.println("\n");
            long t1 = System.nanoTime();
            tree.pesquisa(u);
            long t2 = System.nanoTime();
            System.out.println(t2-t1);
            System.out.println("Comparações = " + tree.getComparacoes());
            System.out.println("\n");System.out.println("\n");
            
            //
        }
        
        
        
        /*
        
        
        //********ARVORE COM ELEMENTOS ALEATÓRIOS*********
        
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1000; i <= 9000; i+=1000){
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        for(int j = 0; j < 15; j++){
            ArvoreBinaria tree = new ArvoreBinaria();
            tree.setComparacoes(0);
            for(int i = 0; i < 9; i++){
                int random = numbers.get(i);
                Item aux = new Item(random);
                tree.insere(aux);
            }
            tree.print(tree.raiz);
            System.out.println("\n");
            long t1 = System.nanoTime();
            tree.pesquisa(k);
            long t2 = System.nanoTime();
            System.out.println(t2-t1);
            System.out.println("Comparações = " + tree.getComparacoes());
            System.out.println("\n");System.out.println("\n");
            
            //
        }*/
        
        
        
    }
    
}
