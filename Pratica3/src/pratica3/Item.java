/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica3;

/**
 *
 * @author mateus
 */
public class Item {
    private int chave;
    public Item(int chave) {
        this.chave = chave;
    }
    
    public int compara(Item it) {
        if (this.chave < it.chave) //se for menor retorna -1
            return -1;
        else if (this.chave > it.chave) //se for maior retorna 1
            return 1;
        return 0;  //se for igual retorna 0
    }
    
    public int getChave() {
        return chave;
    }
}
