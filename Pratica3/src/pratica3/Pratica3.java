/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica3;
import java.util.*;
/**
 *
 * @author mateus
 */
public class Pratica3 {
    public static void main(String[] args) {

		System.out.println("\nCom números inseridos de forma ordenada:\n");
		double[] tempo = new double[10];
                int[] pageVisits = new int[10];
		int[] size = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000};
		for(int i=0; i< size.length; i++){ //Realiza essa repetição 10 vezes
			ArvoreB teste = new ArvoreB(6); //Inicializa uma nova Arvore com a ordem desejada
			for(int y = 0; y < size[i]; y++){ 
				Item chave = new Item(y); //Gera o Item e o insere na árvore logo em seguida
				teste.insere(chave);
			}
			double time = System.nanoTime();
			teste.pesquisa(new Item(size[i]), true); //Realiza pesquisa que conta as paginas visitadas
			tempo[i] = (System.nanoTime() - time)/1000000; //Salva o tempo da pesquisa acima em sua respectiva posição no vetor
                        pageVisits[i] = teste.pageVisits; //Salva o numero de páginas visitadas na pesquisa acima em sua respectiva posição no vetor
		}
                
                //Printa os dados guardados nos vetores
		System.out.println("Tamanho:");
		for(int i=0; i<size.length; i++)
			System.out.print(size[i] + " ");
                System.out.println("\nPaginas visitadas:");
		for(int i=0; i<size.length; i++)
			System.out.print(pageVisits[i] + " ");
    }
    
}
