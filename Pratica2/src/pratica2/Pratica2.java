/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica2;
import java.util.*;
/**
 *
 * @author mateus
 */
public class Pratica2 {

    public static void main(String[] args) {
        Random rand=new Random();
		System.out.println("Ordenados\n");
		double[] tempo = new double[10];
		int[] comparacoes = new int[10];
		int[] size = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000};
		for(int i=0; i< size.length; i++){
			ArvoreBinariaSBB teste = new ArvoreBinariaSBB();
			//System.out.println("Tamanho: " + size[i]);
			for(int y=0; y<size[i]; y++){
				MeuItem chave = new MeuItem(y);
				teste.insere(chave);
			}
			double time = System.nanoTime();
			teste.pesquisa(new MeuItem(size[i]), true);
			tempo[i]=(System.nanoTime() - time)/1000000;
			comparacoes[i]=teste.comparacoes;
		}
		System.out.println("Tamanho:");
		for(int i=0; i<size.length; i++)
			System.out.print(size[i] + " ");
		System.out.println("\nComparações:");
		for(int i=0; i<size.length; i++)
			System.out.print(comparacoes[i] + " ");
                
                
		/*System.out.println("\nAleatórios\n");
		
		for(int i=0; i< size.length; i++){
			ArvoreBinariaSBB teste = new ArvoreBinariaSBB();
			//System.out.println("Tamanho: " + size[i]);
			Object obj;
			for(int y=0; y<size[i]; y++){
				do{
				MeuItem chave = new MeuItem(rand.nextInt(10000));
				obj = teste.insere(chave);
				}while(obj==null);
			}
			double time = System.nanoTime();
			teste.pesquisa(new MeuItem(10001), true);
			tempo[i]=(System.nanoTime() - time)/1000000;
			comparacoes[i]=teste.comparacoes;
		}
		System.out.println("Tempo:");
		for(int i=0; i<size.length; i++)
			System.out.print(tempo[i] + " ");
		System.out.println("\nComparações:");
		for(int i=0; i<size.length; i++)
			System.out.print(comparacoes[i] + " ");*/
	}
    }
    
