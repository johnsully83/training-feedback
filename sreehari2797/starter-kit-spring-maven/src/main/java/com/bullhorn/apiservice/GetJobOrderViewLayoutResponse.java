
package com.bullhorn.apiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.result.ApiGetViewLayoutResult;


/**
 * <p>Java class for getJobOrderViewLayoutResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getJobOrderViewLayoutResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://result.apiservice.bullhorn.com/}apiGetViewLayoutResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getJobOrderViewLayoutResponse", propOrder = {
    "_return"
})
public class GetJobOrderViewLayoutResponse {

    @XmlElement(name = "return")
    protected ApiGetViewLayoutResult _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGetViewLayoutResult }
     *     
     */
    public ApiGetViewLayoutResult getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGetViewLayoutResult }
     *     
     */
    public void setReturn(ApiGetViewLayoutResult value) {
        this._return = value;
    }

}
