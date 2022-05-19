package dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class TrabajadorSalud implements Serializable {

    private int idtrabajadoressalud;
    private String usuario;
    private String contrasenia;

    public TrabajadorSalud(int idtrabajadoressalud, String usuario, String contrasenia) {
        this.idtrabajadoressalud = idtrabajadoressalud;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

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

