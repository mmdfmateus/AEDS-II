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
public class JAEDsMaps {
    public JAEDsMaps(){}
    public void caminhoMaisRapido(JGrafo grafo, int v1, int v2) throws Exception{
        Dijkstra d = new Dijkstra(grafo);  //inicia o algoritmo de Dijkstra com o grafo em questão
        d.obterArvoreCMC(v1);  //gera os caminhos mínimos de todos os vértices
        d.imprimeCaminho(v1, v2);  //imprime o caminho mínimo dos dois vértices passados como parâmetro
    }
}
