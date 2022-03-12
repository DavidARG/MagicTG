package com.example.magic;

public class Card {
    private String nombre, descripcion;
    private  int  imagen;

    public Card(String nombre,String descripcion, int imagen){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImagen() {
        return imagen;
    }

}
