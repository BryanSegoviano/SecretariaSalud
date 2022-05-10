package com.example.demo.entidades;

public class TrabajadorSalud extends Persona{

    private Boolean cedula;
    private Hospital hospital;

    public TrabajadorSalud() {
    }

    public TrabajadorSalud(Boolean cedula, Hospital hospital) {
        this.cedula = cedula;
        this.hospital = hospital;
    }

    public Boolean getCedula() {
        return cedula;
    }

    public void setCedula(Boolean cedula) {
        this.cedula = cedula;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public byte[] getDatoBiometrico() {
        return datoBiometrico;
    }

    public void setDatoBiometrico(byte[] datoBiometrico) {
        this.datoBiometrico = datoBiometrico;
    }


 
}
