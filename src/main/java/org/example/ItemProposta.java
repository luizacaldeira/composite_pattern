package org.example;

public abstract class ItemProposta {

    private String descricao;

    public ItemProposta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getItem();
}