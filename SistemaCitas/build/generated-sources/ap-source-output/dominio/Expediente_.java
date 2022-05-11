package dominio;

import dominio.Habitante;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-05-10T22:20:21")
@StaticMetamodel(Expediente.class)
public class Expediente_ { 

    public static volatile SingularAttribute<Expediente, byte[]> imagenes;
    public static volatile SingularAttribute<Expediente, Integer> idExpediente;
    public static volatile SingularAttribute<Expediente, byte[]> documento;
    public static volatile SingularAttribute<Expediente, String> informacionGeneral;
    public static volatile ListAttribute<Expediente, Habitante> habitanteList;

}