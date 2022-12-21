package com.kassiogo.sicofibackend.enums;

public enum TipoCategoriaEnum {
    RECEITA(1), DESPESA(2);

    private int value;

    TipoCategoriaEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
