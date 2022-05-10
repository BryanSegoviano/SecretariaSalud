package com.example.demo.entidades;

import java.util.List;

public class Hospital extends Establecimiento {

    private Boolean tipoHospital;
    private List<Persona> trabajadoresSalud;

    public Hospital() {
    }

    public Hospital(Boolean tipoHospital, List<Persona> trabajadoresSalud) {
        this.tipoHospital = tipoHospital;
        this.trabajadoresSalud = trabajadoresSalud;
    }

    public Boolean getTipoHospital() {
        return tipoHospital;
    }

    public void setTipoHospital(Boolean tipoHospital) {
        this.tipoHospital = tipoHospital;
    }

    public List<Persona> getTrabajadoresSalud() {
        return trabajadoresSalud;
    }

    public void setTrabajadoresSalud(List<Persona> trabajadoresSalud) {
        this.trabajadoresSalud = trabajadoresSalud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
