package com.BrokerAutenticacion.BrokerAutenticacion.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="trabajadoressalud")
public class TrabajadorSalud implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int idtrabajadoressalud;

    @Column(nullable = false)
    private String usuario;

    @Column(nullable = false)
    private String contrasenia;

    public TrabajadorSalud() {
    }

    public int getIdtrabajadoressalud() {
        return idtrabajadoressalud;
    }

    public void setIdtrabajadoressalud(int idtrabajadoressalud) {
        this.idtrabajadoressalud = idtrabajadoressalud;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "TrabajadorSalud [contrasenia=" + contrasenia + ", idtrabajadoressalud=" + idtrabajadoressalud
                + ", usuario=" + usuario + "]";
    }
    
}
