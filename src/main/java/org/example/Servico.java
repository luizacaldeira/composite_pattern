package org.example;

public class Servico extends ItemProposta {

    private int valor;

    public Servico(String descricao, int valor) {
        super(descricao);
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getItem() {
        return "Serviço: " + this.getDescricao() + " - valor: " + this.valor + "\n";
    }

}