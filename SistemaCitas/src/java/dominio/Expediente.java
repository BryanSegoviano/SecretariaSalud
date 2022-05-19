package dominio;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

public class Expediente {

    private int idExpediente;
    private String imagenes;
    private String informacionGeneral;
    private String documento;
    private List<Habitante> habitanteList;

    public Expediente() {
    }

    public Expediente(int idExpediente, String imagenes, String informacionGeneral, String documento) {
        this.idExpediente = idExpediente;
        this.imagenes = imagenes;
        this.informacionGeneral = informacionGeneral;
        this.documento = documento;
    }
    
    public int getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(int idExpediente) {
        this.idExpediente = idExpediente;
    }

    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    public String getInformacionGeneral() {
        return informacionGeneral;
    }

    public void setInformacionGeneral(String informacionGeneral) {
        this.informacionGeneral = informacionGeneral;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Expediente{" + "idExpediente=" + idExpediente + ", imagenes=" + imagenes + ", informacionGeneral=" + informacionGeneral + ", documento=" + documento + '}';
    }

}