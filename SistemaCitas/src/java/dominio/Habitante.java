package dominio;

import java.io.Serializable;

public class Habitante extends Persona implements Serializable {

    private int idhabitante;
    private String nombre;
    private String direccion;
    private int edad;
    private int idTutor;
    private Expediente idExpediente;
    private String datoBiometrico;
    private String nss;
    private String doctor;
    private String consultorio;
    
    public Habitante() {
    }

    public Habitante(int idhabitante, String nombre, String direccion, int edad, int idTutor, Expediente idExpediente, String datoBiometrico) {
        this.idhabitante = idhabitante;
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.idTutor = idTutor;
        this.idExpediente = idExpediente;
        this.datoBiometrico = datoBiometrico;
    }

    public Habitante(int idhabitante, String nombre, String direccion, int edad, int idTutor, Expediente idExpediente, String datoBiometrico, String nss) {
        this.idhabitante = idhabitante;
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.idTutor = idTutor;
        this.idExpediente = idExpediente;
        this.datoBiometrico = datoBiometrico;
        this.nss = nss;
    }

    public Habitante(int idhabitante, String nombre, String direccion, int edad, int idTutor, Expediente idExpediente, String datoBiometrico, String nss, String doctor, String consultorio) {
        this.idhabitante = idhabitante;
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.idTutor = idTutor;
        this.idExpediente = idExpediente;
        this.datoBiometrico = datoBiometrico;
        this.nss = nss;
        this.doctor = doctor;
        this.consultorio = consultorio;
    }
    
    public String getDatoBiometricoConversion() {
        return datoBiometrico;
    }

    public void setDatoBiometricoConversion(String datoBiometricoConversion) {
        this.datoBiometrico = datoBiometricoConversion;
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

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    @Override
    public String toString() {
        return "Habitante{" + "idhabitante=" + idhabitante + ", nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + ", idTutor=" + idTutor + ", idExpediente=" + idExpediente + ", datoBiometrico=" + datoBiometrico + ", nss=" + nss + ", doctor=" + doctor + ", consultorio=" + consultorio + '}';
    }

}