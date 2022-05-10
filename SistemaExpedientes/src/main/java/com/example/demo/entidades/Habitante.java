package com.example.demo.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "habitantes")
public class Habitante extends Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int idhabitante;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private int edad;

    @Column(nullable = true)
    private byte[] datoBiometrico;

    @Column(nullable = true)
    private int idTutor;
    
    @JoinColumn(name = "idExpediente", referencedColumnName = "idExpediente")
    @ManyToOne(optional = false)
    private Expediente idExpediente;

    public Habitante() {
    }

    public int getIdhabitante() {
        return idhabitante;
    }

    public void setIdhabitante(int idhabitante) {
        this.idhabitante = idhabitante;
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

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public Expediente getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(Expediente idExpediente) {
        this.idExpediente = idExpediente;
    }

    @Override
    public String toString() {
        return "Habitante{" + "idhabitante=" + idhabitante + ", nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + ", datoBiometrico=" + datoBiometrico + ", idTutor=" + idTutor + ", idExpediente=" + idExpediente + '}';
    }
    
}