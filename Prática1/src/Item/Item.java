package Item;
public class Item {
    private int chave;

    public int getChave() {
        return chave;
    }

    public Item(int chave) {
        this.chave = chave;
    }

    public int compara(Item it){
        Item item = it;
        if(item.chave < this.chave)
            return 1;
        else if(item.chave > this.chave)
            return -1;
        return 0;
    }
    
    @Override
    public String toString() {
        return "Item{" + "chave=" + chave + '}';
    }
    
}
