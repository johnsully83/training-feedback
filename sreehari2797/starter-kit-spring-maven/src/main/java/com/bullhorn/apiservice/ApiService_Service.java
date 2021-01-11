
package com.bullhorn.apiservice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 */
@WebServiceClient(name = "ApiService", targetNamespace = "http://apiservice.bullhorn.com/", wsdlLocation = "https://api.bullhornstaffing.com/webservices-2.5/?wsdl")
public class ApiService_Service
extends Service
{

	private final static URL APISERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(com.bullhorn.apiservice.ApiService_Service.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.bullhorn.apiservice.ApiService_Service.class.getResource(".");
			url = new URL(baseUrl, "https://api.bullhornstaffing.com/webservices-2.5/?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'https://api.bullhornstaffing.com/webservices-2.5/?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		APISERVICE_WSDL_LOCATION = url;
	}

	public ApiService_Service(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public ApiService_Service() {
		super(APISERVICE_WSDL_LOCATION, new QName("http://apiservice.bullhorn.com/", "ApiService"));
	}

	/**
	 * 
	 * @return
	 *     returns ApiService
	 */
	@WebEndpoint(name = "ApiServicePort")
	public ApiService getApiServicePort() {
		return super.getPort(new QName("http://apiservice.bullhorn.com/", "ApiServicePort"), ApiService.class);
	}

	/**
	 * 
	 * @param features
	 *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
	 * @return
	 *     returns ApiService
	 */
	@WebEndpoint(name = "ApiServicePort")
	public ApiService getApiServicePort(WebServiceFeature... features) {
		return super.getPort(new QName("http://apiservice.bullhorn.com/", "ApiServicePort"), ApiService.class, features);
	}

}
