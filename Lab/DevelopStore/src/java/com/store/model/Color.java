/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.store.model;

/**
 *
 * @author Nish
 */
public enum Color {
    CAFE("Cafe"),AZUL("Azul"),MORADO("Morado"), AMARILLO("Amarillo");
    private String color;

    public String getValor() {
        return color;
    }

    public void setValor(String valor) {
        this.color = valor;
    }
    
    private Color(String color){
        this.color= color;
    }
}
