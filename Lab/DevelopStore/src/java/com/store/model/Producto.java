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
public class Producto {

    private Color color;
    private Talla talla;
    private TipoProducto tipoProducto;
    private String descripcion;
    private int id;
    private double precio;

    public Producto() {
    }

    public Producto(Color color, Talla talla, TipoProducto tipoProducto, String descripcion, Integer id, double precio) {
        this.color = color;
        this.talla = talla;
        this.tipoProducto = tipoProducto;
        this.descripcion = descripcion;
        this.id = id;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color Color) {
        this.color = Color;
    }

}
