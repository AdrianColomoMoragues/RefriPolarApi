package clases;

import clases.Clientes;
import clases.Empleados;
import jakarta.persistence.metamodel.CollectionAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-05T08:01:11", comments="EclipseLink-4.0.2.v20230616-r3bfa6ac6ddf76d7909adc5ea7ecaa47c02c007ed")
@StaticMetamodel(Encargos.class)
@SuppressWarnings({"rawtypes", "deprecation"})
public class Encargos_ { 

    public static volatile SingularAttribute<Encargos, String> tipo;
    public static volatile SingularAttribute<Encargos, Empleados> idEncargado;
    public static volatile SingularAttribute<Encargos, Clientes> idCliente;
    public static volatile CollectionAttribute<Encargos, Empleados> empleadosCollection;
    public static volatile SingularAttribute<Encargos, Boolean> terminada;
    public static volatile SingularAttribute<Encargos, Integer> id;
    public static volatile SingularAttribute<Encargos, Integer> porcentaje;
    public static volatile SingularAttribute<Encargos, String> nombre;
    public static volatile SingularAttribute<Encargos, Integer> prioridad;

}