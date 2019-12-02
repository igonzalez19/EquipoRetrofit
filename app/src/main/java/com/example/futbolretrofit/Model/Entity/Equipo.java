package com.example.futbolretrofit.Model.Entity;

public class Equipo {

    private long id;
    private String nombre, ciudad, estadio, imagen, fechaInicio;

    public Equipo(String nombre, String ciudad, String estadio, String imagen, String fechaInicio) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estadio = estadio;
        this.imagen = imagen;
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", estadio='" + estadio + '\'' +
                ", imagen='" + imagen + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
