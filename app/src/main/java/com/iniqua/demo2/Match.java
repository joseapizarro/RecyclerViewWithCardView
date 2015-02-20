package com.iniqua.demo2;

public class Match {
    private int imagen;
    private String nombre;
    private String nombre2;
    private String visitas;

    public Match(int imagen, String nombre, String nombre2, String visitas) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.nombre2 = nombre2;
        this.visitas = visitas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getVisitas() {
        return visitas;
    }

    public int getImagen() {
        return imagen;
    }
}
