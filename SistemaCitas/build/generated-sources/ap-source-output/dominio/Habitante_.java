package dominio;

import dominio.Expediente;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-05-10T22:20:21")
@StaticMetamodel(Habitante.class)
public class Habitante_ { 

    public static volatile SingularAttribute<Habitante, Integer> idTutor;
    public static volatile SingularAttribute<Habitante, byte[]> datoBiometrico;
    public static volatile SingularAttribute<Habitante, Expediente> idExpediente;
    public static volatile SingularAttribute<Habitante, String> direccion;
    public static volatile SingularAttribute<Habitante, Integer> idhabitante;
    public static volatile SingularAttribute<Habitante, String> nombre;
    public static volatile SingularAttribute<Habitante, Integer> edad;

}