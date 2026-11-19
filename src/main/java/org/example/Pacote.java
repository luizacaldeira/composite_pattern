package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pacote extends ItemProposta {

    private List<ItemProposta> itens;

    public Pacote(String descricao) {
        super(descricao);
        this.itens = new ArrayList<ItemProposta>();
    }

    public void addItem(ItemProposta item) {
        this.itens.add(item);
    }

    public String getItem() {
        String saida = "";
        saida = "Pacote: " + this.getDescricao() + "\n";
        for (ItemProposta item : itens) {
            saida += item.getItem();
        }
        return saida;
    }
}
