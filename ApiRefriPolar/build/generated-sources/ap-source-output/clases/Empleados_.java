package clases;

import clases.CategoriasProfesionales;
import clases.Encargos;
import jakarta.persistence.metamodel.CollectionAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-05T08:01:11", comments="EclipseLink-4.0.2.v20230616-r3bfa6ac6ddf76d7909adc5ea7ecaa47c02c007ed")
@StaticMetamodel(Empleados.class)
@SuppressWarnings({"rawtypes", "deprecation"})
public class Empleados_ { 

    public static volatile SingularAttribute<Empleados, CategoriasProfesionales> codcategoriaProfesional;
    public static volatile SingularAttribute<Empleados, String> apellido2;
    public static volatile CollectionAttribute<Empleados, Encargos> encargosCollection;
    public static volatile SingularAttribute<Empleados, String> mail;
    public static volatile SingularAttribute<Empleados, String> apellido1;
    public static volatile SingularAttribute<Empleados, Integer> antiguedad;
    public static volatile SingularAttribute<Empleados, BigDecimal> salario;
    public static volatile SingularAttribute<Empleados, String> direccion;
    public static volatile SingularAttribute<Empleados, String> imagen;
    public static volatile SingularAttribute<Empleados, String> provincia;
    public static volatile SingularAttribute<Empleados, String> nombre;
    public static volatile SingularAttribute<Empleados, Integer> cp;
    public static volatile SingularAttribute<Empleados, Boolean> reconocimientoMedico;
    public static volatile SingularAttribute<Empleados, String> ciudad;
    public static volatile SingularAttribute<Empleados, Encargos> idAsignado;
    public static volatile SingularAttribute<Empleados, Integer> id;
    public static volatile SingularAttribute<Empleados, Integer> telefono;

}