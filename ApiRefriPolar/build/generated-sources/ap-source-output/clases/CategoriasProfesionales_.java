package clases;

import clases.Empleados;
import jakarta.persistence.metamodel.CollectionAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-05T08:01:11", comments="EclipseLink-4.0.2.v20230616-r3bfa6ac6ddf76d7909adc5ea7ecaa47c02c007ed")
@StaticMetamodel(CategoriasProfesionales.class)
@SuppressWarnings({"rawtypes", "deprecation"})
public class CategoriasProfesionales_ { 

    public static volatile SingularAttribute<CategoriasProfesionales, String> descripcion;
    public static volatile SingularAttribute<CategoriasProfesionales, String> codigo;
    public static volatile CollectionAttribute<CategoriasProfesionales, Empleados> empleadosCollection;
    public static volatile SingularAttribute<CategoriasProfesionales, String> encargo;

}