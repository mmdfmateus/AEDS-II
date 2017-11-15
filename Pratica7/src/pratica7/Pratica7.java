/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica7;

/**
 *
 * @author aluno
 */
public class Pratica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        System.out.println("\t\tGRAFO 1\n");
        JGrafo grafo = new JGrafo(6);
        grafo.insereAresta(1, 2, 8, 3);
        grafo.insereAresta(1, 3, 4, 10);
        grafo.insereAresta(1, 4, 5, 2);
        grafo.insereAresta(2, 5, 9, 5);
        grafo.insereAresta(3, 4, 1, 4);
        grafo.insereAresta(3, 5, 5, 2);
        grafo.insereAresta(4, 3, 5, 7);
        grafo.insereAresta(4, 5, 2, 7);
        grafo.insereAresta(4, 2, 3, 8);
        
        JAEDsMaps j = new JAEDsMaps();
        j.caminhoMaisRapido(grafo, 1, 5);
        
        System.out.println("\n\n\n\t\tGRAFO 2\n");
        JGrafo grafo2 = new JGrafo(6);
        grafo2.insereAresta(1, 2, 3, 3);
        grafo2.insereAresta(1, 3, 5, 5);
        grafo2.insereAresta(2, 3, 2, 6);
        grafo2.insereAresta(2, 4, 2, 2);
        grafo2.insereAresta(3, 5, 2, 2);
        grafo2.insereAresta(4, 2, 3, 1);
        grafo2.insereAresta(4, 3, 5, 4);
        grafo2.insereAresta(4, 5, 9, 6);
        grafo2.insereAresta(5, 3, 4, 7);
        grafo2.insereAresta(5, 1, 6, 3);
        
        JAEDsMaps j2 = new JAEDsMaps();
        j2.caminhoMaisRapido(grafo2, 4, 1);
    }
    
}
