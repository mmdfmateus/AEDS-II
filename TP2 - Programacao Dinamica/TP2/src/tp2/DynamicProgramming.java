/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author mateus
 */
public class DynamicProgramming {
    public static class Linha{
        private int custosEstacoes[];
        private int custosTransportes[];

        public Linha(int[] custosEstacoes, int[] custosTransportes) {
            this.custosEstacoes = custosEstacoes;
            this.custosTransportes = custosTransportes;
        }

        public int[] getCustosEstacoes() {
            return custosEstacoes;
        }

        public void setCustosEstacoes(int[] custosEstacoes) {
            this.custosEstacoes = custosEstacoes;
        }

        public int[] getCustosTransportes() {
            return custosTransportes;
        }

        public void setCustosTransportes(int[] custosTransportes) {
            this.custosTransportes = custosTransportes;
        }
    }
    
    private Linha A1, A2;  //linhas de produção
    private int i; //variável a ser iterada no método recursivo
    private int[] f1, f2; //vetores para se guardar os custos mínimos
    private int[] l1, l2; //vetores para se guardar o caminho de quais linhas devem ser seguidas
    private int fFinal, lFinal;

    public DynamicProgramming(Linha A1, Linha A2) {
        this.A1 = A1;
        this.A2 = A2;
        this.i = 1;
        this.f1 = new int[A1.getCustosEstacoes().length - 2];
        this.f2 = new int[A2.getCustosEstacoes().length - 2];
        
        f1[0] = A1.getCustosEstacoes()[0] + A1.getCustosEstacoes()[1];  //inicializa a primeira posição do primeiro vetor dos caminhos mínimos 
        f2[0] = A2.getCustosEstacoes()[0] + A2.getCustosEstacoes()[1];  //inicializa a primeira posição do segundo vetor dos caminhos mínimos 
    }

    public Linha getA1() {
        return A1;
    }

    public void setA1(Linha A1) {
        this.A1 = A1;
    }

    public Linha getA2() {
        return A2;
    }

    public void setA2(Linha A2) {
        this.A2 = A2;
    }
    
    
    public void calculaCaminhoMinimo(){  //metodo recursivo para calcular o caminho mínimo entre a entrada e saída
        for(i = 1; i < A1.getCustosEstacoes().length - 2; i++){
            if(f1[i-1] + A1.getCustosEstacoes()[i] <= f2[i-1] + A2.getCustosTransportes()[i] + A1.getCustosEstacoes()[i]){
                f1[i] = f1[i-1] + A1.getCustosEstacoes()[i];
                l1[i-1] = 1;
            } else{
                f1[i] = f2[i-1] + A2.getCustosTransportes()[i] + A1.getCustosEstacoes()[i];
                l1[i-1] = 2;
            }
            
            if(f2[i-1] + A2.getCustosEstacoes()[i] <= f1[i-1] + A1.getCustosTransportes()[i] + A2.getCustosEstacoes()[i]){
                f2[i] = f2[i-1] + A2.getCustosEstacoes()[i];
                l2[i-1] = 2;
            } else{
                f2[i] = f1[i-1] + A1.getCustosTransportes()[i] + A2.getCustosEstacoes()[i];
                l2[i-1] = 1;
            }
            
        }
        
        if(f1[i-1] + A1.getCustosEstacoes()[A1.getCustosEstacoes().length - 1] <= f2[i-1] + A2.getCustosEstacoes()[A2.getCustosEstacoes().length - 1]){
            fFinal = f1[i-1] + A1.getCustosEstacoes()[A1.getCustosEstacoes().length - 1];
            lFinal = 1;
        }else{
            fFinal = f2[i-1] + A2.getCustosEstacoes()[A2.getCustosEstacoes().length - 1];
            lFinal = 2;
        }
            
    }
    
    
    
    
    
    
    
}
