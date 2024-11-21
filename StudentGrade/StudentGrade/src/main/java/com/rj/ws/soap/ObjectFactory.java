//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.2 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.11.20 à 04:34:28 PM CET 
//


package com.rj.ws.soap;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rj.ws.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rj.ws.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetGradeRequest }
     * 
     */
    public GetGradeRequest createGetGradeRequest() {
        return new GetGradeRequest();
    }

    /**
     * Create an instance of {@link GetGradeResponse }
     * 
     */
    public GetGradeResponse createGetGradeResponse() {
        return new GetGradeResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

}
