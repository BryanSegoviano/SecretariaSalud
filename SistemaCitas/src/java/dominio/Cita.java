/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bryan
 */
@Entity
@Table(name = "citas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cita.findAll", query = "SELECT c FROM Cita c"),
    @NamedQuery(name = "Cita.findByIdcita", query = "SELECT c FROM Cita c WHERE c.idcita = :idcita"),
    @NamedQuery(name = "Cita.findByDoctor", query = "SELECT c FROM Cita c WHERE c.doctor = :doctor"),
    @NamedQuery(name = "Cita.findByNsshabitante", query = "SELECT c FROM Cita c WHERE c.nsshabitante = :nsshabitante"),
    @NamedQuery(name = "Cita.findByFecha", query = "SELECT c FROM Cita c WHERE c.fecha = :fecha")})
public class Cita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcita")
    private Integer idcita;
    @Basic(optional = false)
    @Column(name = "doctor")
    private String doctor;
    @Basic(optional = false)
    @Column(name = "nsshabitante")
    private String nsshabitante;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public Cita() {
    }

    public Cita(Integer idcita) {
        this.idcita = idcita;
    }

    public Cita(String doctor, String nsshabitante, Date fecha) {
        this.doctor = doctor;
        this.nsshabitante = nsshabitante;
        this.fecha = fecha;
    }

    public Cita(Integer idcita, String doctor, String nsshabitante, Date fecha) {
        this.idcita = idcita;
        this.doctor = doctor;
        this.nsshabitante = nsshabitante;
        this.fecha = fecha;
    }

    public Integer getIdcita() {
        return idcita;
    }

    public void setIdcita(Integer idcita) {
        this.idcita = idcita;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getNsshabitante() {
        return nsshabitante;
    }

    public void setNsshabitante(String nsshabitante) {
        this.nsshabitante = nsshabitante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcita != null ? idcita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cita)) {
            return false;
        }
        Cita other = (Cita) object;
        if ((this.idcita == null && other.idcita != null) || (this.idcita != null && !this.idcita.equals(other.idcita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cita{" + "idcita=" + idcita + ", doctor=" + doctor + ", nsshabitante=" + nsshabitante + ", fecha=" + fecha + '}';
    }

}
