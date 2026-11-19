package org.example;

public class Proposta {

    private ItemProposta itens;

    public void setItens(ItemProposta itens) {
        this.itens = itens;
    }

    public String getItens() {
        if (this.itens == null) {
            throw new NullPointerException("Proposta sem itens");
        }
        return this.itens.getItem();
    }
}