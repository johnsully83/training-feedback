
package com.bullhorn.entity.emb;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bullhorn.entity.emb package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bullhorn.entity.emb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Address1 }
     * 
     */
    public Address1 createAddress1() {
        return new Address1();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link AddressWithoutCountry }
     * 
     */
    public AddressWithoutCountry createAddressWithoutCountry() {
        return new AddressWithoutCountry();
    }

}
