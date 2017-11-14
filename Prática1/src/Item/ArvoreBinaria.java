package Item;
public class ArvoreBinaria {
    private static class No{
        Item reg;
        No esq, dir;        
    }
    
    public No raiz;
    public int comparacoes;

    public int getComparacoes() {
        return comparacoes;
    }

    public void setComparacoes(int comparacoes) {
        this.comparacoes = comparacoes;
    }

    public ArvoreBinaria() {
        this.raiz = null;
    }
    
    public void insere(Item reg){
        this.raiz = this.insere(reg, this.raiz);
    }
    
    public Item pesquisa(Item reg){
        return this.pesquisa(reg, this.raiz);
    }
    
    private No insere(Item reg, No p){
        if(p == null){
            p = new No();
            p.reg = reg;
            p.esq = null; p.dir = null;
            return p;
        }
        else if(p.reg.compara(reg) < 0){
            this.comparacoes++;
            p.dir = insere(reg, p.dir);
        }
        else if(p.reg.compara(reg) > 0){
            this.comparacoes++;
            p.esq = insere(reg, p.esq);
        } 
        else System.out.println("ERRO: Numero ja existe");
        return p;
    }
    
    private Item pesquisa(Item reg, No p){
        if(p == null)
            return null;
        int aux = reg.compara(p.reg);
        if(aux < 0)
            return pesquisa(reg, p.esq);
        else if(aux > 0)
            return pesquisa(reg, p.dir);
        else return p.reg;
            
        
        /*if(p.reg == reg){
            return reg;
        }
        int aux = p.reg.compara(reg);
        if(aux == -1){
            return this.pesquisa(reg, this.raiz.dir);
        }
        if(aux == 1){
            return this.pesquisa(reg, this.raiz.esq);
        }
        return null;*/
    }

    public void print(No p) {
        if(p != null){
            print(p.esq);
            System.out.println(p.reg.getChave());
            print(p.dir);
        } 
        
        
    }
    
    
}
