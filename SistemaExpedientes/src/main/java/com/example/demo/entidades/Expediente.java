package com.example.demo.entidades;

import java.io.File;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "expedientes")

public class Expediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int idExpediente;

    @Column()
    private byte[] imagenes;

    @Column(nullable = false)
    private String informacionGeneral;

    @Column()
    private byte[] documento;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idExpediente")
    private List<Habitante> habitanteList;

    public Expediente() {
    }

    public int getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(int idExpediente) {
        this.idExpediente = idExpediente;
    }

    public byte[] getImagenes() {
        return imagenes;
    }

    public void setImagenes(byte[] imagenes) {
        this.imagenes = imagenes;
    }

    public String getInformacionGeneral() {
        return informacionGeneral;
    }

    public void setInformacionGeneral(String informacionGeneral) {
        this.informacionGeneral = informacionGeneral;
    }

    public byte[] getDocumento() {
        return documento;
    }

    public void setDocumento(byte[] documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Expediente{" + "idExpediente=" + idExpediente + ", imagenes=" + imagenes + ", informacionGeneral=" + informacionGeneral + ", documento=" + documento + ", habitanteList=" + habitanteList + '}';
    }

}