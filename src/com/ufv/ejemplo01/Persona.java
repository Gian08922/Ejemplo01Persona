package com.ufv.ejemplo01;

public class Persona {
    private String nombre;
    private  String apellidos;
    private int dnisinletra;
    private int edad;
    public Persona() {
    }

    public Persona(String nombre, String apellidos, int dnisinletra, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dnisinletra = dnisinletra;
        this.edad = edad;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDniSinLetra(int dnisinletra) {
        this.dnisinletra = dnisinletra;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDniSinLetra() {
        return dnisinletra;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

}
