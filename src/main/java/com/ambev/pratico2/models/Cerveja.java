package com.ambev.pratico2.models;

public class Cerveja extends Produto {
    private boolean comAlcool;

    public boolean isComAlcool() {
        return comAlcool;
    }

    public void setComAlcool(boolean comAlcool) {
        this.comAlcool = comAlcool;
    }
}