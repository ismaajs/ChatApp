package com.example.chatapp.Entidades;

public class Persona {

    private String nombre;
    private String mensaje;
    private String hora;
    private int imagenid;

    public Persona(){}

    public Persona(String nombre, String mensaje, String hora, int imagenid) {
        this.nombre = nombre;
        this.mensaje = mensaje;
        this.hora = hora;
        this.imagenid = imagenid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getImagenid() {
        return imagenid;
    }

    public void setImagenid(int imagenid) {
        this.imagenid = imagenid;
    }
}
